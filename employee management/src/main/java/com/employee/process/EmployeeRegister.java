package com.employee.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.employee.DbConnection.DbConnectionPool;
import com.employee.command.Command;
import com.employee.command.Constant;

public class EmployeeRegister implements Command {

	@Override
	public Map<String, Object> execute(Map<String, String> map, HttpServletRequest request) {
		PreparedStatement ps = null;
		boolean flag = true;
		Connection con = null;
		try {
			con = DbConnectionPool.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Map<String, Object> map2 = new HashMap<>();
		String uri = "success";

		String firstName = map.get("firstName");
		String lastName = map.get("lastName");
		String fatherName = map.get("fatherName");
		String gender = map.get("gender");

		String phoneNum = map.get("phone");
		long phoneNumber = Long.parseLong(phoneNum);

		String rollType = map.get("role");
		String strunderManager = map.get("manger");
//		System.out.println("&&&&&&&&"+strunderManager);

		int underManager = Integer.parseInt(strunderManager);
//		System.out.println(underManager+"$$$$$$$$$");

		String emailId = map.get("email");
		String strage = map.get("age");
		int age = Integer.parseInt(strage);
		System.out.println(age);

		String streetAddress = map.get("streetAddress");
		String address = map.get("address");
		String state = map.get("state");
		String city = map.get("city");
		String country = map.get("country");
		String strpincode = map.get("pincode");
		int pincode = Integer.parseInt(strpincode);
		String password = map.get("password");

		// Validation user============================
		String sql = Constant.select;
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String email = rs.getString("email_id");
				if (emailId.equals(email)) {
					request.setAttribute("message", "alredy exist");
					request.setAttribute("age", age);
					request.setAttribute("firstName", firstName);
					request.setAttribute("lastName", lastName);
					request.setAttribute("fatherName", fatherName);
					request.setAttribute("phoneNumber", phoneNumber);
					request.setAttribute("streetAddress", streetAddress);
					request.setAttribute("address", address);
					request.setAttribute("state", state);
					request.setAttribute("city", city);
					request.setAttribute("country", country);
					request.setAttribute("pincode", pincode);

					uri = "error";
					flag = false;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			ps = con.prepareStatement(Constant.insert);

			ps.setInt(1, age);
			ps.setString(2, firstName);
			ps.setString(3, lastName);
			ps.setString(4, fatherName);
			ps.setString(5, gender);
			ps.setLong(6, phoneNumber);
			ps.setString(7, rollType);
			ps.setInt(8, underManager);
			ps.setString(9, emailId);
			ps.setString(10, rollType); // to edit in future
			ps.setString(11, streetAddress);
			ps.setString(12, address);
			ps.setString(13, state);
			ps.setString(14, city);
			ps.setString(15, country);
			ps.setInt(16, pincode);
			ps.setString(17, password);
			if (flag) {
				ps.execute();
			}
    		con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		map2.put(Constant.uriPath, uri);
		return map2;
	}
}
