<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Registration Form</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  
</head>
<body style="background-color: #C4D7E0" class="m-5">
    <div class="container row ">
<div class="col-lg-8 ">
    <h1 class="display-1">Registration Page</h1>
</div>
<div class="col-lg-4 col-sm-12">
    <form action="EmployeeRegister.in" method="post" class="p-5 " style="background-color: #F7EDDB">
      <!--firstName-->
        <div class="mb-3 mt-3">
            <label for="firstName" class="form-label">First Name:</label>
            <input type="text" class="form-control" id="firstName" placeholder="First Name" name="firstName" required value="${firstName}">
          </div>
          <!--lastName-->
          <div class="mb-3 mt-3">
            <label for="lastName" class="form-label">Last Name:</label>
            <input type="text" class="form-control" id="lastName" placeholder="Last Name" name="lastName" required value="${lastName}">
          </div>
          <!--fatherName-->
          <div class="mb-3 mt-3">
            <label for="fatherName" class="form-label">Father Name:</label>
            <input type="text" class="form-control" id="fatherName" placeholder="Father Name" name="fatherName" required value="${fatherName}">
          </div>
         
<!--Gender radio-->
          <div class="form-check">
            <input type="radio" class="form-check-input" id="male" name="gender" value="male" checked >Male
            <label class="form-check-label" for="male"></label>
          </div>
          <div class="form-check">
            <input type="radio" class="form-check-input" id="female" name="gender" value="female" >Female
            <label class="form-check-label" for="female"></label>
          </div>
          <div class="form-check">
            <input type="radio" class="form-check-input" id="other" name="gender" value="other" >Other
            <label class="form-check-label" for="other"></label>
          </div>

<!--phone-->
          <div class="mb-3 mt-3">
            <label for="phone" class="form-label">Phone Number:</label>
            <input type="text" class="form-control" id="phone" placeholder="+91 89.." name="phone" required pattern="[0-9]{10}" value="${phoneNumber}">
          </div>
<!--email-->
          <div class="mb-3 mt-3">
            <label for="email" class="form-label">Email:</label>
            <i style="color: red; font-size: 17px" ><d:out value="${message}"></d:out></i> 
            <input type="email" class="form-control" id="email" placeholder="Enter email" name="email" required >
          </div>
          <!--employee type-->
          <div class="form-check">
            <input type="radio" class="form-check-input" id="employee" name="role" value="employee" checked >Employee
            <label class="form-check-label" for="employee"></label>
          </div>
          <div class="form-check">
            <input type="radio" class="form-check-input" id="manager" name="role" value="manager">Manager
            <label class="form-check-label" for="manager"></label>
          </div>

<!--select designationo-->
<div id="underManager">
<label for="underManager" class="form-label">Under Manager:</label>

  <select class="mdb-select md-form" name="manger" searchable="Search here..">
    <option value="1" id="disabled">Select</option>
    <option value="2">Manager 1</option>
    <option value="7">Manager 2</option>
    <option value="8">Manager 3</option>
    <option value="9">Manager 4</option>
  </select>
</div>
          <!--dob-->
        <div class="mb-3 mt-3">
          <label for="age" class="form-label">Age</label>
          <input type="text" class="form-control" id="email" placeholder="Enter Age" name="age" required pattern="[18-56]{2}"
           oninvalid="this.setCustomValidity('Enter Age Between 18 to 56')"  value="${age}"/>
        </div>
         <!--Street Address-->
         <div class="mb-3 mt-3">
          <label for="streetAddress" class="form-label">Enter Address 1:</label>
          <input type="text" class="form-control" id="streetAddress" placeholder="Enter Address 1" name="streetAddress" required value="${streetAddress}">
        </div>
        <!--Address-->
        <div class="mb-3 mt-3">
            <label for="address" class="form-label">Enter Address 2:</label>
            <input type="text" class="form-control" id="address" placeholder="Enter Address 2" name="address" required value="${address}">
          </div>
            <!--state-->
        <div class="mb-3 mt-3">
          <label for="state" class="form-label">Enter State :</label>
          <input type="text" class="form-control" id="state" placeholder="Enter State " name="state" required value="${state}">
        </div>
          <!--city-->
          <div class="mb-3 mt-3">
            <label for="city" class="form-label">Enter City :</label>
            <input type="text" class="form-control" id="city" placeholder="Enter City " name="city" required value="${city}">
          </div>
            <!--country-->
        <div class="mb-3 mt-3">
          <label for="country" class="form-label">Enter Country :</label>
          <input type="text" class="form-control" id="country" placeholder="Enter Country " name="country" required value="${country}">
        </div>
          <!--Pincode-->
        <div class="mb-3 mt-3">
            <label for="pincode" class="form-label">Enter Pincode:</label>
            <input type="text" class="form-control" id="pincode" placeholder="Enter Pincode" name="pincode" required pattern="[0-9]{6}" value="${pincode}">
          </div>
          <!--password-->
        <div class="mb-3 mt-3">
            <label for="password" class="form-label">Enter Password:</label>
            <input type="password" class="form-control" id="password" placeholder="Enter Password" name="password" required pattern="{8}">
          </div>
        
        <button type="submit" class="btn btn-primary">Submit</button>
        <button type="reset" class="btn btn-danger">Cancel</button>
      </form> 
</div>

    </div>
 
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <script>
      $("#manager").click(function(){
        $("#underManager").hide(500);
      }); 

      $("#employee").click(function(){
        $("#underManager").show(500);
        $("#disabled").hide(500);
      }); 
        </script>
   
</body>
</html>