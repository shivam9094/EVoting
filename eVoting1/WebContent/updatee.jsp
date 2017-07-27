
<!DOCTYPE html>
<html>
<head>

<!-- your webpage info goes here -->

    <title>HOME PAGE</title>
	
	<meta name="author" content="your name" />
	<meta name="description" content="" />

<!-- you should always add your stylesheet (css) in the head tag so that it starts loading before the page html is being displayed -->	
	<link rel="stylesheet" href="style9.css" type="text/css" />
	
</head>
<body>
<% 
			String UpdateFlag = (String)request.getAttribute("UpdateFlag");

		%>
<!-- webpage content goes here in the body -->

	<div class="login-page">
		<center><h1>Welcome to Online Voting</h1></center>
	
  <div class="form">
  <form action="updateServlet" method="post">
   <br>
  	<center><h3>Parties Participating in Election:-</h3></center>
  
<!--     <br><h4>Parties Participating in Election:-</h4><br><br>
	  <input type="radio" name="gender" value="male"><label for="f-option">Party 1</label>
	  <br>
       <input type="radio" name="gender" value="female">
       <label for="f-option">Party 2</label>
      <br>
       <input type="radio" name="gender" value="other">
       <label for="f-option">Party 3</label><image src ="download.jpg">
       <br> 
	  <input type="radio" name="gender" value="male">
	  <label for="f-option">Party 4</label>
	  <br>
       <input type="radio" name="gender" value="female">
       <label for="f-option">Party 5</label>
      <br>
       <input type="radio" name="gender" value="other">
       <br><br><br><br> -->
  <div class="container">
         <br><br><br>
  
  <ul>
  <li>
    <input type="radio" id="f-option" name="party_name" value="BJP">
    <label for="f-option">BJP</label>
    
    <div class="check"></div>
  </li>
  
  <li>
    <input type="radio" id="s-option" name="party_name"  value="Congress">
    <label for="s-option">CONGRESS</label>
    
    <div class="check"><div class="inside"></div></div>
  </li>
  
  <li>
    <input type="radio" id="t-option" name="party_name"  value="AAP">
    <label for="t-option">AAP</label>
    
    <div class="check"><div class="inside"></div></div>
  </li>
  <li>
    <input type="radio" id="t-option" name="party_name"  value="nota">
    <label for="t-option">NOTA</label>
    
    <div class="check"><div class="inside"></div></div>
  </li>
</ul>
  <center><br><input type="text" placeholder="voter_id number" name="voter_id" size="40" required/><br></center>
<center><button>Submit</button></center>
</div>

 </div>
 </div>
</body>
</html>