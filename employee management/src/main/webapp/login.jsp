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
 <script type="text/javascript">
    
    function noBack()
    {
        window.history.forward();
        window.history.back();
        
    }
</script>
</head>
<body style="background-color: #C4D7E0" class="m-5" >
    <div class="container row ">
<div class="col-lg-8 ">
    <h1 class="display-1">Login Page</h1>
</div>
<div class="col-lg-4 col-sm-12">
    <form action="EmployeeLogin.in" method="post" class="p-5 " style="background-color: #F7EDDB">
<!--email-->
          <div class="mb-3 mt-3">
            <label for="email" class="form-label">Email:</label>
            <input type="email" class="form-control" id="email" placeholder="Enter email" name="email" required>
          </div>
   
          <!--password-->
        <div class="mb-3 mt-3">
            <label for="password" class="form-label">Enter Password:</label>
            <input type="password" class="form-control" id="password" placeholder="Enter Password" name="password" required>
          </div>
            <i style="color: red; font-size: 17px" ><d:out value="${message}"></d:out></i> 
           <button type="submit" class="btn btn-primary">Submit</button>
      </form> 
</div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>