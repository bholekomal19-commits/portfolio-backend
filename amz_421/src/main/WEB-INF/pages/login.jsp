<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>AMZ 221 | Home</title>	
</head>
<body>
	<%@ include file="header.jsp" %>
	<div>
		<form action="/verify-login" method="POST">
			<label>Enter Username :</label>
			<input type="text" name="username" required/><br><br>
			<label>Enter Password:</label>
            <input type="password" name="password" required/>
			<input type="submit" value="Sign Up"/>
		</form>
	</div>
	<div>
		<a href="/register">New Register</a>
	</div>
</body>
</html>