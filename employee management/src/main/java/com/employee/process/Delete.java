package com.employee.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.employee.DbConnection.DbConnectionPool;
import com.employee.command.Command;
import com.employee.command.Constant;


public class Delete implements Command {

	@Override
	public Map<String, Object> execute(Map<String, String> map, HttpServletRequest request) {
		boolean deleted=false;
		PreparedStatement ps = null;
		Connection con = null;
		try {
			con = DbConnectionPool.getConnection();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Map<String, Object> map2 = new HashMap<>();
		String uri="EmployeeDashboard.action";
		try {
			PreparedStatement pstmt=con.prepareStatement(Constant.delete);
//			ps.setInt(1, (int) EmployeeServlet.session.getAttribute("employeeId"));//to do
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	


	
}
