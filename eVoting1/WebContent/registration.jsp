<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- your webpage info goes here -->

    <title>Registration form</title>
	
	<meta name="author" content="your name" />
	<meta name="description" content="" />

<!-- you should always add your stylesheet (css) in the head tag so that it starts loading before the page html is being displayed -->	
	<link rel="stylesheet" href="style4.css" type="text/css" />
	
</head>
<body>
<%
	String RegisterFlag = (String)request.getAttribute("RegisterFlag");
%>
	<div class="login-page">
	<center><h1 ">THE OUTLIERS</h1></center>

  <div class="form">
  <!--  <center><h2> REGISTRATION FORM</h2></center><br> -->
<form action="register-form" method="post">
<%
      if(RegisterFlag!=null)
		{
			%>					
				<h3 style="color:red; ">*Wrong Wrong, Please Try Again!!!!</h3>
								
			<%	
				}
			%>
   <br><input type="text" placeholder="name" name="name"size="40"/><br>
   <br><input type="text" placeholder="username" name="username"size="40"/><br>
   <br><input type="password" placeholder="password" name="password"size="40"/><br>
   <br><input type="text" placeholder="email address" name="email"size="40"/><br>
   <br><input type="text" placeholder="phone" name="phone"size="40"/><br>
	  
      <button>create</button>
	  <p class ="message">
     Already registered? <a rel="nofollow" rel="noreferrer"href="home.jsp">Sign In</a></p>
    </form>
	</div>
</div>
</body>
</html>