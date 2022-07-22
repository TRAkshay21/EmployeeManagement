<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<%@ include file="employeeHeading.html" %>
<table class="table table-bordered  table-light" >
	<tr>
               <th>Book Id</th>
               <th>Book Name</th>             
            </tr>
            
		<d:forEach items="${list}" var="eachBook">
		<tr>
		<td><d:out value="${eachBook.bookId}"/></td>
		<%-- <td><a href="ViewBookDetails.in?bookId=${eachBook.bookName}">${eachBook.bookName}</a></td> --%>
		<td><a href="ViewBookDetails.in?bookName=<d:out value='${eachBook.bookName}'/>">${eachBook.bookName}</a></td>
		</tr>
		</d:forEach>
</table>
<%@ include file="footer.html" %>
</body>
</html>