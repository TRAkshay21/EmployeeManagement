
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%--    <%@page import="com.employee.process.*,com.employee.model.Employee,java.util.*" %> --%>
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
 ${list}
<table class="table table-bordered  table-light" >
	<tr>
               <th>Video Id</th>
             <!--   <th>Video URL</th>  -->  
               <th>Title</th>      
               <th>Duration in seconds</th>      
               <th>Duration in minutes</th>              
            </tr>

<d:forEach items="${list}" var="eachVideo">
<tr>
<td><d:out value="${eachVideo.videoId}"/></td>
<%-- <td><d:out value="${eachVideo.videoUrl}"/></td> --%>
<td><a target="_blank" href="${eachVideo.videoUrl}<d:out value='${eachVideo.videoUrl}'/>">${eachVideo.title}</a></td>
<%-- <td><d:out value="${eachVideo.title}"/></td> --%>
<td><d:out value="${eachVideo.durationInSeconds}"/></td>
<td><d:out value="${eachVideo.durationInMinutes}"/></td>
</tr>
</d:forEach>
</table>
<%@ include file="footer.html" %>
</body>
</html>