<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>Register</h2>
<link rel="stylesheet" href="/css/style.css">

<form action="/register" method="post">
    Name: <input type="text" name="name"/><br><br>
    Email: <input type="email" name="email"/><br><br>
    Password: <input type="password" name="password"/><br><br>
    <button type="submit">Register</button>
</form>

