<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page
import ="java.sql.Connection"
import ="java.sql.PreparedStatement"
import ="java.sql.ResultSet"
import ="com.info.service.ConnectionProvider"

%>
<html>
<head>
<!-- your webpage info goes here -->

    <title>Profile</title>
	
	<meta name="author" content="your name" />
	<meta name="description" content="" />

<!-- you should always add your stylesheet (css) in the head tag so that it starts loading before the page html is being displayed -->	
	<link rel="stylesheet" href="style7.css" type="text/css" />
	
</head>
<body>
			<div class="login-page">
	<center><h1>User Profile</h1></center>
  <div class="form">
<form action="updateServlet" method="post">
<%
//allow access only if session exists
String user = null;
if(session.getAttribute("name") == null){
	response.sendRedirect("home.jsp");
}
String aadhar = (String)session.getAttribute("name");


try{	
Connection con = ConnectionProvider.getConnection();
String query =("select * from registration where aadhar=?");
PreparedStatement ps = con.prepareStatement(query);
ps.setString(1,aadhar);
ResultSet rs = ps.executeQuery();
while(rs.next())
{ %>

	  <br>Username :<br><input type="text" placeholder="city" name="city" value=<%=rs.getString("username") %> disabled size="40"/><br>
	  <br>Name :<br><input type="text" placeholder="city" name="city" value=<%=rs.getString("name") %> disabled size="40"/><br>
	  <br>Email :<br><input type="text" placeholder="city" name="city" value=<%=rs.getString("email") %> disabled size="40"/><br>
	  <br>Aadhar Number :<br><input type="text" placeholder="city" name="city" value=<%=rs.getString("aadhar") %> disabled size="40"/><br>
	  <br>Voter_id Number :<br><input type="text" placeholder="city" name="city" value=<%=rs.getString("voter_id") %> disabled size="40"/><br>
	  <br>Date Of Birth :<br><input type="text" placeholder="city" name="city" value=<%=rs.getString("dob") %> disabled size="40"/><br>	
	  <br>Mobile Number :<br><input type="text" placeholder="pone" name="phone" value=<%=rs.getString("phone") %> disabled size="40"/><br>
	  <br>Gender :<br><input type="text" placeholder="city" name="city" value=<%=rs.getString("gender") %> disabled size="40"/><br>
	  <br>Address :<br><textarea type="text" placeholder="address"rows="3" name="address"  disabled col="10" /><%=rs.getString("address") %></textarea><br>
	  <br>City :<br><input type="text" placeholder="city" name="city" value=<%=rs.getString("city") %> disabled size="40"/><br>
	  <br>State :<br><input type="text" placeholder="State" name="state" value="<%=rs.getString("state") %>" disabled size="40"/><br>
	  <br>Country:<br><input type="text" placeholder="country" name="country" value=<%=rs.getString("country") %> disabled size="40"/><br>
	  <br>Zip Code:<br><input type="text" placeholder="Zip Code" name="pincode" value=<%=rs.getString("pincode") %> disabled size="40"/><br>
	<% }
}catch(Exception e){
	System.out.println("update"+e);
}%>

      
	  
    </form>
	</div>
</div>
</body>
</html>