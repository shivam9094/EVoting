<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- your webpage info goes here -->

    <title>Login here</title>
	
	<meta name="author" content="your name" />
	<meta name="description" content="" />

<!-- you should always add your stylesheet (css) in the head tag so that it starts loading before the page html is being displayed -->	
	<link rel="stylesheet" href="adminLogin.css" type="text/css" />
	
</head>
<body>
<% 
			String loginFlag = (String)request.getAttribute("loginFlag");

String RegisterFlag = (String)request.getAttribute("RegisterFlag");

		%>


<div class="login-page">
<center><h1>Election Commission Login</h1></center>
  <div class="form">
  <img src = "Online-Voting-icon-300x300.png"/>
   
    <form action="adminlogin" method="post">
    <%
					if(loginFlag!=null)
					{
				%>					
					<h3 style="color:red; ">*Wrong Username or password!</h3>
									
				<%	
					}
				%>
				<%
      if(RegisterFlag!=null)
		{
			%>					
				<h3 style="color:darkorange; ">Registration Successfull!!!!!</h3>
								
			<%	
				}
			%>
      <input type="text" placeholder="Enter Username" name="username" required/>
      <input type="password" placeholder="Enter password" name="password" required/>
      <br>
      <button>login</button>
     
      <!-- <p class="message">Not registered? <a rel="nofollow" rel="noreferrer"href="register.jsp">Register to Vote</a></p> -->
    </form>
  </div>
</div>
</body>
</html>