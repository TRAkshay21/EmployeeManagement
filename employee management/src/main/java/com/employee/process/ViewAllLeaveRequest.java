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
import com.employee.model.EmployeeLeave;

public class ViewAllLeaveRequest implements Command {

	@Override
	public Map<String, Object> execute(Map<String, String> map, HttpServletRequest request) {
		HttpSession session = request.getSession();
		Connection con = null;
		con = (Connection) session.getAttribute("connection");
		Map<String, Object> map2 = new HashMap<>();
		String uri = "success";

		map2.put(Constant.uriPath, uri);
		List<EmployeeLeave> list = new ArrayList<>();

		String sql1 = Constant.selectLeave;
		try {

			PreparedStatement pstmt = con.prepareStatement(sql1);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int employeeId = rs.getInt("employee_id");
				String fromDate = rs.getString("from_date");
				String toDate = rs.getString("to_date");
				String textArea = rs.getString("textarea");

				EmployeeLeave leave = new EmployeeLeave(employeeId, fromDate, toDate, textArea);
				list.add(leave);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * for (Book e : list) { System.out.println(e); }
		 */
		map2.put(Constant.list, list);
		return map2;
	}

}
