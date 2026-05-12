<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>Login</h2>
<link rel="stylesheet" href="/css/style.css">

<form action="/login" method="post">
    Email: <input type="email" name="email"/><br><br>
    Password: <input type="password" name="password"/><br><br>
    <button type="submit">Login</button>
</form>

<a href="/register">New User? Register</a>
