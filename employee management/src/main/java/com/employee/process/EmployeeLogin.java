package com.employee.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.employee.DbConnection.DbConnectionPool;
import com.employee.command.Command;
import com.employee.command.Constant;

public class EmployeeLogin implements Command {
	HttpSession session = null;

	@Override
	public Map<String, Object> execute(Map<String, String> map, HttpServletRequest request) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		session = request.getSession(true);

		try {
			con = DbConnectionPool.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Map<String, Object> map2 = new HashMap<>();
		String uri = "";

		String loginEmail = null;
		String loginPassword = null;
		int underManger = 0;
		int employeeId = 0;

		String email = map.get("email");
		String password = map.get("password");
//	     System.out.println(email + password);//1

		try {
			ps = con.prepareStatement(Constant.login);
			ps.setString(1, email);
			rs = ps.executeQuery();

			System.out.println("#####" + email + password);
			if (rs.next()) {
				loginEmail = rs.getString("email_id");
				loginPassword = rs.getString("password");
				underManger = rs.getInt("under_manager");
				employeeId = rs.getInt("employee_id");
//				Controller.getValueFromSession("employeeId");
//				int empID = Controller.value;
//				
//			

				session.setAttribute("employeeId", employeeId);
				session.setAttribute("underManger", underManger);
				session.setAttribute("email", loginEmail);
				session.setAttribute("connection", con);
				// System.out.println("666-----------"+);
				// Controller.req.getSession();
				/// req.setAttribute("email", userName);
				// Controller.session.setAttribute("email",email);
				// EmployeeServlet.session.setAttribute("employeeId",employeeId);
				// EmployeeServlet.session.setAttribute("underManger",underManger);

			}
			System.out.println(loginEmail + loginPassword);

			if ((email.equals(loginEmail) && password.equals(loginPassword))) {
				if (underManger == 1) {
					System.out.println("%%%%" + underManger);
					uri = "successManager";

				} else {
					System.out.println("%%%%" + "else");
					uri = "successEmployee";
				}
			} else {
				request.setAttribute("message", "Inavlid User Name and password");
				uri = "error";
				System.out.println("Invalid user" + loginEmail);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		map2.put(Constant.uriPath, uri);
		return map2;
	}
}
