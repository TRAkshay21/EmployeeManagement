package com.employee.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.employee.command.Command;
import com.employee.command.Constant;

public class InsertEmployeeLeave implements Command {

	@Override
	public Map<String, Object> execute(Map<String, String> map, HttpServletRequest request) {
		System.out.println("@@@@@@@@@@------Inside InsertEmployeeLeave");
		HttpSession session = request.getSession();
		PreparedStatement ps = null;
		Connection con = null;
		con = (Connection) session.getAttribute("connection");
		Map<String, Object> map2 = new HashMap<>();

		String uri = "success";

		// String strEmpId = map.get("empid");
		// int empId = Integer.parseInt(strEmpId);
		String fromDate = map.get("fromdate");
		String toDate = map.get("todate");
		String textArea = map.get("textarea");

		int employeeId = (int) session.getAttribute("employeeId");

		try {

			ps = con.prepareStatement(Constant.insertLeave);

			ps.setInt(1, employeeId);
			ps.setString(2, fromDate);
			ps.setString(3, toDate);
			ps.setString(4, textArea);
			ps.execute();

			System.out.println("Add Done " + employeeId);

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			System.out.println(e.getMessage());
		}
		map2.put(Constant.uriPath, uri);
		return map2;
	}

}
