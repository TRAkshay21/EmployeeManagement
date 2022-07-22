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

public class ViewAll implements Command {

	@Override
	public Map<String, Object> execute(Map<String, String> map, HttpServletRequest request) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Connection con = null;
		con = (Connection) session.getAttribute("connection");
		System.out.println(con);
		Map<String, Object> map2 = new HashMap<>();
		String uri = "success";

		map2.put(Constant.uriPath, uri);
		List<Employee> list = new ArrayList<>();
		// int underManager=(int) Controller.session.getAttribute("employeeId");
//		Controller.getValueFromSession("employeeId");
		int underManager = (int) session.getAttribute("employeeId");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^" + underManager);
		String sql = Constant.findById;

		Employee emp = null;

		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, underManager);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println("Inside Rs");
				int employee = rs.getInt("employee_id");
				String rolltype = rs.getString("roll_type");

				int undermanager = rs.getInt("under_manager");

				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String fatherName = rs.getString("father_name");
				String gender = rs.getString("gender");
				String emailId = rs.getString("email_id");
				String designation = rs.getString("designation");
				String streetAddress = rs.getString("street_address");
				String address = rs.getString("address");
				String state = rs.getString("state");
				String city = rs.getString("city");
				String country = rs.getString("country");
				String pincode = rs.getString("pincode");
				String password = rs.getString("password");
				long phoneNumber = rs.getLong("phone_number");
				int age = rs.getInt("age");
				System.out.println(age);

				emp = new Employee(employee, rolltype, undermanager, firstName, lastName, fatherName, gender, emailId,
						designation, streetAddress, address, state, city, country, pincode, password, phoneNumber, age);
				list.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(list.size());
		/*
		 * for (Employee e : list) { System.out.println(e); }
		 */
		map2.put(Constant.list, list);

		return map2;
	}

}
