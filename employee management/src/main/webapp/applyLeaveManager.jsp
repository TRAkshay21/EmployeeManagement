
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Apply Leave</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body style="background-color: #FFC4C4">
<%@ include file="managerHeading.html" %>
        <div class='row m-3'>
        <div class="col-lg-4"></div>
        <div class="col-lg-4 p-5" style="background-color: #F7E2D6">
     <h1>Apply Leave </h1>
<form class="mt-3" action="InsertMangerLeave.in">
  <div class="form-group">
  
   <!--  <input type="text" class="form-control" name="empid" id="empid"  placeholder="Employee Id"/> -->
 
    <label for="fromdate">From Date:</label>
    <input type="date" class="form-control" name="fromdate" id="fromdate"/>
 
    <label for="todate">To Date:</label>
    <input type="date" class="form-control"  name="todate" id="todate"/>
 
    <label for="textarea">Reason</label>
    <textarea class="form-control" id="textarea" name="textarea" ></textarea>

  </div>
  <p style="text-align:left">
  <button type="submit" class="btn btn-info  mt-2" >Submit</button>
  <button type="reset"  class="btn btn-danger ms-3  mt-2" >Clear</button>
  </p>
</form> 

</div>
</div>

</body>
</html>