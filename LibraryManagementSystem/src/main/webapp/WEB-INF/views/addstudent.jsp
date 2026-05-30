<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Add Student</title>

<link rel="stylesheet" href="/css/style.css">

<style>

.container{
width:50%;
margin:40px auto;
background:white;
padding:30px;
border-radius:12px;
box-shadow:0 3px 15px rgba(0,0,0,0.2);
}

h1{
text-align:center;
color:#1f4e79;
margin-bottom:25px;
}

input{
width:100%;
padding:12px;
margin-bottom:15px;
border:1px solid #ccc;
border-radius:8px;
}

button{
width:100%;
padding:12px;
background:#1f4e79;
color:white;
border:none;
border-radius:8px;
cursor:pointer;
}

.home-btn{
display:block;
text-align:center;
margin-top:20px;
text-decoration:none;
}

</style>

</head>

<body>

<div class="container">

<h1>🎓 Add Student</h1>

<form action="/saveStudent" method="post">

<input type="text" name="name" placeholder="Student Name" required>

<input type="text" name="department" placeholder="Department" required>

<input type="text" name="course" placeholder="Course" required>

<input type="text" name="rollNo" placeholder="Roll Number" required>

<input type="email" name="email" placeholder="Email" required>

<input type="text" name="contact" placeholder="Contact Number" required>

<button type="submit">
Save Student
</button>

</form>

<a class="home-btn" href="/students">

Back to Students

</a>

</div>

</body>

</html>