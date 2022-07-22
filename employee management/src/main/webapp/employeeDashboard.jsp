<%@page import="javax.websocket.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Dashboard</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <style type="text/css">
  a{
  	text-decoration: none;
  	float:right;
  	size: 1.5em;
  }
  </style>
 <script type="text/javascript">
    
    function noBack()
    {
        window.history.forward();
        
    }
</script>
</head>
<body style="background-color: #C4D7E0" class="m-5"  onLoad="noBack();" onpageshow="if (event.persisted) noBack();" onUnload="">
  <a href="home.action?action=logout" id="logout">Logout</a>
  	
   <h1 style="text-align: center;margin-top: 20px;">Employee Dashboard</h1>
<div class="container mt-3">
    <div class="row">

        <div class="col-lg-6 col-sm-12">
            <div class="card m-5 p-5" >
                <img class="card-img-top" height="250px" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQGPajftntxU93XKwxVQjFYiasz8qcWQa9Xqw&usqp=CAU" alt="Card image">
                <div class="card-body">
                  <h4 class="card-title">Video</h4>           
                  <a href="ViewAllVideo.in" class="btn btn-primary">List</a>
                </div>
                 </div>
        </div>
        <div class="col-lg-6 col-sm-12">
            <div class="card m-5 p-5" >
                <img class="card-img-top" height="250px" src="data:image/jpeg;base64,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" alt="Card image">
                <div class="card-body">
                  <h4 class="card-title">Pay Slip</h4>
                 
                  <a href="paySlip.in?email" class="btn btn-primary">Show</a>
                </div>
                 </div>
        </div>
    </div>
    <div class="row">

        <div class="col-lg-6 col-sm-12">
            <div class="card m-5 p-5" >
                <img class="card-img-top"  height="250px" src="https://images-eu.ssl-images-amazon.com/images/I/51X-pD3qaKL._SY445_SX342_QL70_ML2_.jpg" alt="Card image">
                <div class="card-body">
                  <h4 class="card-title"> Books</h4>
                 
                  <a href="ViewAllBook.in" class="btn btn-primary">List</a>
                </div>
                 </div>
        </div>
        <div class="col-lg-6  col-sm-12">
            <div class="card m-5 p-5" >
                <img class="card-img-top" height="250px" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTwMAIyxZTq_L7y2C3MUsSUxNPQKpcTeF36zg&usqp=CAU" alt="Card image">
                <div class="card-body">
                  <h4 class="card-title">Apply Leave</h4>
                 
                  <a href="applyLeave.action" class="btn btn-primary">Request</a>
                </div>
                 </div>
        </div>
    </div>
    
    
  </div>
    


  

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
   
</body>
</html>