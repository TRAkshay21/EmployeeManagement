package com.employee.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.employee.command.Command;
import com.employee.command.Constant;
import com.employee.model.Employee;

public class EmployeePaySlip implements Command {

	@Override
	public Map<String, Object> execute(Map<String, String> map, HttpServletRequest request) {

		HttpSession session = request.getSession();
		Connection con = null;
		con = (Connection) session.getAttribute("connection");
		Map<String, Object> map2 = new HashMap<>();
		String uri = "success";// ch

		map2.put(Constant.uriPath, uri);
		List<Employee> list = new ArrayList<>();
		// HttpServletRequest request = null;

		String email = (String) session.getAttribute("email");

		// String email=(String) map.get("email");
//		System.out.println("hbjbkjb"+email);
		String sql1 = Constant.selectByEmailId;
		Employee employee = null;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql1);
			pstmt.setString(1, email);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				int employeeId = rs.getInt("employee_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");

				employee = new Employee(employeeId, firstName, lastName);

				list.add(employee);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		for (Employee e : list) {
			System.out.println(e);
		}
		map2.put(Constant.list, list);
		return map2;
	}

}
