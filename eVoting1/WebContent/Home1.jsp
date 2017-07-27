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
	<link rel="stylesheet" href="Home1.css" type="text/css" />
	
</head>
<body>
<div id="header">
<p id="name">Welcome to Online Voting Portal</p>
           		<div id="wrapper">
    <div id="navMenu">
    <ul style="height: 30px; width: 308px">
    <li id="wrapper1" style="left: 110px; top: -15px; width: 150px; height: 31px"><a style="color:black" href="#">Login Here</a>
    <ul>
  <!--   <li id="wrapper3">
    <a href="#">Link 1</a></li> -->
    <li><a href="home.jsp">Candidate Login</a></li>
    <li><a href="adminLogin.jsp">Admin login</a></li>
    </ul>
    </li>
    </div>
    </div>
     </div>
<% 
			String loginFlag = (String)request.getAttribute("loginFlag");

String RegisterFlag = (String)request.getAttribute("RegisterFlag");

		%>


<div class="login-page">
<center><h1>"ONLINE VOTING PORTAL"</h1></center>
  <div class="form">
  
  <img src = "f26_supp_vote.png"/>
   
    <form>
<!--     <marquee><img src="download (1).jpg"><img src="f26_supp_vote.png"></marquee>
 -->    <%-- <%
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
    
      <!-- <input type="text" placeholder="Enter username" name="username"/> --> --%>
    
   <!--    <input type="text" placeholder="Enter aadhar no." name="aadhar" required/>
      <input type="password" placeholder="Enter password" name="password" required/>
      <br>
      <button>login</button>
      <p class="message">Not registered? <a rel="nofollow" rel="noreferrer"href="register.jsp">Register to Vote</a></p> -->
    </form>
  </div>
</div>
</body>
</html>