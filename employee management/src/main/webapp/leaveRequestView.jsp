<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--     <%@page import="com.employee.process.*,com.employee.model.Employee,java.util.*" %> --%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Leave Request </title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
<%@ include file="managerHeading.html" %>
<table class="table table-bordered  table-light" >
	<tr>
               <th>Employee Id</th>
               <th>From Date</th>   
               <th>To Date</th>      
               <th>Reason</th>            
            </tr>
            
<d:forEach items="${list}" var="leave">
<tr>
<td><d:out value="${leave.employeeId}"/></td>
<td><d:out value="${leave.fromDate}"/></td>
<td><d:out value="${leave.toDate}"/></td>
<td><d:out value="${leave.textArea}"/></td>

</tr>
</d:forEach>
</table>
<%@ include file="footer.html" %>
</body>
</html>