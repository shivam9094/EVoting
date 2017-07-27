
<!DOCTYPE html>
<html>
<head>

<!-- your webpage info goes here -->

    <title>HOME PAGE</title>
	
	<meta name="author" content="your name" />
	<meta name="description" content="" />

<!-- you should always add your stylesheet (css) in the head tag so that it starts loading before the page html is being displayed -->	
	<link rel="stylesheet" href="user.css" type="text/css" />
	
</head>
<body>
<% 
			String UpdateFlag = (String)request.getAttribute("UpdateFlag");

		%>
<!-- webpage content goes here in the body -->

	<div class="login-page">
	<center><h1>Welcome to Online Voting</h1></center>
  <div class="form">
    <% if(UpdateFlag!=null)
		{
			%>					
				<h3 style="color:darkorange; ">Update Successfull!!!!!</h3>
								
			<%	
				}
			%>
    
	 <div id="nav">
			<ul>
			    <li><a href="user.jsp">Show Result</a></li>
				<li><a href="profile.jsp">Profile</a></li>
				<li><a href="updatee.jsp">Voting</a></li>
				<li><a href="logoutServlet">Logout</a></li>
				
			</ul>	
		</div>
		<br><br><br><br><br>
		<p>Internet voting will allow the casting of Online voting from virtually any location around the world and Display voting results in a graphical fashion for the administrator to analyse and providing a most secured and user friendly online voting system.<br>
		-Easy to manage large amount of user and data store in electronic for long time.<br>
		<b>-Register Vote form any where.</b></p>    
		<marquee>okay</marquee>
  </div></div>
			</body>
</html>