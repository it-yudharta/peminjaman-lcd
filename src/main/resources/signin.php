<?php
include('login.php'); // Memasuk-kan skrip Login 
 
if(isset($_SESSION['login_user'])){
header("location: profile.php");
}
?>
 
<!DOCTYPE html>
<html>
  <head>
    <title> Form Login</title>
	
	<!-- Skrip CSS -->
   <link rel="stylesheet" href="style.css"/>
  
  </head>	
  <body>
	<div class="container">
		<div class="main">
	      <form action="" method="post">
			<h2> FORM LOGIN </h2><hr/>		
			
			<label>Username :</label>
			<input id="name" name="username" placeholder="username" type="text">
			
			<label>Password :</label>
			<input id="password" name="password" placeholder="**********" type="password">
			
			<input type="submit" name="submit" id="submit" value="Login">
		  </form>
		</div>
   </div>
 
  </body>
</html>