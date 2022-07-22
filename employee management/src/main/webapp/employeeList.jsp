<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.employee.process.*,com.employee.model.Employee,java.util.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d"%>
<!DOCTYPE html> 
<html>
<head>
<meta charset="UTF-8">
<title>View</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
<%@ include file="managerHeading.html" %>

<d:if test="">


</d:if>
<table class="table table-responsive table-bordered  table-light table-striped table-hover" >
	<tr>
               <th>employeeid</th>
               <th>FirstName</th>
               <th>LastName</th>
               <th>fatherName</th>
               <th>Gender</th>
               <th>PhoneNumber</th>
               <th>rollType</th>
               <th>UnderManager</th>
               <th>Email</th>
               <th>Designation</th>
               <th>Age</th>
               <th>streetaddress</th>
               <th>Address</th>
               <th>state</th>
               <th>city</th>
               <th>country</th>
               <th>pincode</th>
               <th>password</th>
               <th>Edit</th>
               <th>Delete</th>
            </tr>
            
<d:forEach items="${list}" var="eachEmployee">
<tr>
<td><d:out value="${eachEmployee.employeeId}"/></td>
<td><d:out value="${eachEmployee.firstName}"/></td>
<td><d:out value="${eachEmployee.lastName}"/></td>
<td><d:out value="${eachEmployee.fatherName}"/></td>
<td><d:out value="${eachEmployee.gender}"/></td>
<td><d:out value="${eachEmployee.phoneNumber}"/></td>
<td><d:out value="${eachEmployee.rollType}"/></td>
<td><d:out value="${eachEmployee.underManager}"/></td>
<td><d:out value="${eachEmployee.emailId}"/></td>
<td><d:out value="${eachEmployee.designation}"/></td>
<td><d:out value="${eachEmployee.age}"/></td>
<td><d:out value="${eachEmployee.streetAddress}"/></td>
<td><d:out value="${eachEmployee.address}"/></td>
<td><d:out value="${eachEmployee.state}"/></td>
<td><d:out value="${eachEmployee.city}"/></td>
<td><d:out value="${eachEmployee.country}"/></td>
<td><d:out value="${eachEmployee.pincode}"/></td>
<td><d:out value="${eachEmployee.password}"/></td>
<%-- <td><a href="EmployeeRegisterView.action?emailId=<d:out value="${eachEmployee.emailId}"/>">Edit</a></td> --%>
<!-- <td><button type="submit">delete</button></td> -->

</tr>
</d:forEach>
</table>
<%@ include file="footer.html" %>
<%-- EDIT

<table border="1" style="align-content: center;" >
	<tr>
               <th>employeeid</th>
               <th>FirstName</th>
               <th>LastName</th>
               <th>fatherName</th>
               <th>Gender</th>
               <th>PhoneNumber</th>
               <th>rollType</th>
               <th>UnderManager</th>
               <th>Email</th>
               <th>Designation</th>
               <th>DOB</th>
               <th>streetaddress</th>
               <th>Address</th>
               <th>state</th>
               <th>city</th>
               <th>country</th>
               <th>pincode</th>
               <th>password</th>
               <th>Save</th>
               <th>Cancel</th>
            </tr>
            
<d:forEach items="${list}" var="eachEmployee">
<tr>
<td><input type="text" value="${eachEmployee.employeeId}"></td>
<td><input type="text" value="${eachEmployee.firstName}"></td>
<td><input type="text" value="${eachEmployee.employeeId}"></td>
<td><input type="text" value="${eachEmployee.firstName}"></td>
<td><input type="text" value="${eachEmployee.employeeId}"></td>
<td><input type="text" value="${eachEmployee.firstName}"></td>
<td><input type="text" value="${eachEmployee.employeeId}"></td>
<td><input type="text" value="${eachEmployee.firstName}"></td>
<td><input type="text" value="${eachEmployee.employeeId}"></td>
<td><input type="text" value="${eachEmployee.firstName}"></td>
<td><input type="text" value="${eachEmployee.employeeId}"></td>
<td><input type="text" value="${eachEmployee.firstName}"></td>
<td><input type="text" value="${eachEmployee.employeeId}"></td>
<td><input type="text" value="${eachEmployee.firstName}"></td>
<td><input type="text" value="${eachEmployee.employeeId}"></td>
<td><input type="text" value="${eachEmployee.firstName}"></td>
<td><input type="text" value="${eachEmployee.employeeId}"></td>
<td><input type="text" value="${eachEmployee.firstName}"></td>
<td><button type="submit">Save</button></td>
<td><button type="submit">cancel</button></td>


</tr>
</d:forEach>
</table>
 --%>

</body>
</html>