<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>AMZ  | Register</title>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>

    <%@ include file="header.jsp" %>

    <h2>New Registration</h2>

    <form action="/add-customer" method="POST">

        Full Name:<input type="text" name="fullname" required /><br><br>

        Address:<input type="text" name="address" required /><br><br>

        Mobile:<input type="text" name="mobile" required /><br><br>

        Email:<input type="email" name="email" required /><br><br>

        Username:<input type="text" name="username" required /><br><br>

        Password:<input type="password" name="password" required /><br><br>

        <input type="submit" value="Sign up" />

    </form>

    <br>
    <a href="/">Already Registered? Login Here</a>
	<%@ include file="footer.jsp" %>
</body>
</html>