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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="resultcss.css" type="text/css" />
</head>
<body>
<% 
			String UpdateFlag = (String)request.getAttribute("UpdateFlag");

		%>
<!-- webpage content goes here in the body -->

	<div class="login-page">
	<center><h1>Welcome to Online Voting</h1></center>
  <div class="form">
    
    <%
//allow access only if session exists
/* String user = null;
if(session.getAttribute("name") == null){
	response.sendRedirect("home.jsp");
}
String aadhar = (String)session.getAttribute("name"); */


try{	
	Connection con = ConnectionProvider.getConnection();
	String query=("SELECT COUNT(party_name) as result from voting WHERE party_name= 'BJP'");
	PreparedStatement ps = con.prepareStatement(query);
	
	ResultSet rs = ps.executeQuery();
	if(rs.next())
	{  
		
		
		%>
		BJP : <br><input type="text" placeholder="city" name="city" value=<%=rs.getString("result") %> disabled size="40"/><br>
	 <%}
	String query1=("SELECT COUNT(party_name) as result from voting WHERE party_name= 'AAP'");
	PreparedStatement ps1 = con.prepareStatement(query1);
	
	ResultSet rs1 = ps1.executeQuery();
	if(rs1.next())
	{  
		
		
		%>
		AAP : <br><input type="text" placeholder="city" name="city" value=<%=rs1.getString("result") %> disabled size="40"/><br>
	 <%}
	String query2=("SELECT COUNT(party_name) as result from voting WHERE party_name= 'CONGRESS'");
	PreparedStatement ps2 = con.prepareStatement(query2);
	
	ResultSet rs2= ps2.executeQuery();
	if(rs2.next())
	{  
		
		
		%>
		CONGRESS : <br><input type="text" placeholder="city" name="city" value=<%=rs2.getString("result") %> disabled size="40"/><br>
	 <%}
	
	String query3=("SELECT COUNT(party_name) as result from voting WHERE party_name= 'NOTA'");
	PreparedStatement ps3 = con.prepareStatement(query3);
	
	ResultSet rs3= ps3.executeQuery();
	if(rs3.next())
	{  
		
		
		%>
		NOTA : <br><input type="text" placeholder="city" name="city" value=<%=rs3.getString("result") %> disabled size="40"/><br>
	 <%}
}catch(Exception e){
	System.out.println("update"+e);
}%>

	
	    
  </div></div>
			</body>
</body>
</html>