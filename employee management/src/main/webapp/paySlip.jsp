<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Registration Form</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  
</head>
<%@ include file="employeeHeading.html" %>
<body class="m-5">
    <div class="container ">
        <h1 style="text-align: center;">PAYSLIP</h1>
        <table class="table ">
        <d:forEach items="${list}" var="eachEmployee">

            <tr>
                <td>Employee Id : </td>
                <td> <d:out value="${eachEmployee.employeeId}"/></td>
            </tr>
            <tr>
                <td>Employee Name :</td>
                <td>  <d:out value="${eachEmployee.firstName}"/>
                 <d:out value="${eachEmployee.lastName}"/></td>
            </tr>
            </d:forEach>
            <tr>
                <td>Month & Year :</td>
                <td>June-2022 </td>
            </tr>
        </table>
        <table class="table table-border border-dark table-striped rounded">
            <tr>
                <th>No : </th>
                <th>Details :</th>
                <th>Amount :</th>
            </tr>
            <tr>
                <td>1.</td>
                <td>Basic Salary</td>
                <td>10000</td>
            </tr>
            <tr>
                <td>2.</td>
                <td> HRA</td>
                <td>3857</td>
            </tr>
            <tr>
                <td>3.</td>
                <td>PF</td>
                <td>1600</td>
            </tr>
            <tr>
                <td>Total</td>
                <td> </td>
                <td>15457</td>
            </tr>
        </table>
       <div style="text-align: end;">
        <a class="btn btn-outline-success" href="EmployeeDashboard.action">Print</a>
        <a class="btn btn-outline-danger" href="EmployeeDashboard.action">Cancel</a>
       </div>
                
        
    </div>


    


  

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>