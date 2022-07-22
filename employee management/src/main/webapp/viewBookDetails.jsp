<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--     <%@page import="com.employee.process.*,com.employee.model.Employee,java.util.*" %> --%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
<%@ include file="employeeHeading.html" %>
<table class="table table-bordered  table-light" >
	<tr>
               <th>Book Id</th>
               <th>Book Name</th>   
               <th>Author Name</th>      
               <th>Publisher</th>      
               <th>language</th>    
               <th>No of pages</th>     
               <th>Rating</th>     
               <th>Price</th>           
            </tr>
            
<d:forEach items="${list}" var="eachBook">
<tr>
<td><d:out value="${eachBook.bookId}"/></td>
<td><d:out value="${eachBook.bookName}"/></td>
<td><d:out value="${eachBook.authorName}"/></td>
<td><d:out value="${eachBook.publisher}"/></td>
<td><d:out value="${eachBook.language}"/></td>
<td><d:out value="${eachBook.noOfPage}"/></td>
<td><d:out value="${eachBook.rating}"/></td>
<td><d:out value="${eachBook.price}"/></td>
</tr>
</d:forEach>
</table>
<%@ include file="footer.html" %>
</body>
</html>