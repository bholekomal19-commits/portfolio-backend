<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Library Login</title>

<link rel="stylesheet" href="/css/style.css">

<style>

body{
margin:0;
background:linear-gradient(135deg,#1f4e79,#4d8cc9);
height:100vh;
display:flex;
justify-content:center;
align-items:center;
font-family:Arial;
}

.login-box{
background:white;
padding:40px;
width:380px;
border-radius:15px;
box-shadow:0 5px 20px rgba(0,0,0,0.25);
text-align:center;
}

.logo{
font-size:65px;
margin-bottom:10px;
}

h1{
color:#1f4e79;
margin-bottom:10px;
}

.subtitle{
color:gray;
margin-bottom:30px;
}

.input-group{
margin-bottom:18px;
text-align:left;
}

label{
font-weight:bold;
display:block;
margin-bottom:8px;
}

input{
width:100%;
padding:12px;
border:1px solid #ccc;
border-radius:8px;
font-size:15px;
}

.login-btn{
width:100%;
padding:13px;
border:none;
background:#1f4e79;
color:white;
font-size:16px;
border-radius:8px;
cursor:pointer;
margin-top:10px;
}

.login-btn:hover{
opacity:0.9;
}

.home-link{
display:block;
margin-top:20px;
text-decoration:none;
color:#1f4e79;
font-weight:bold;
}

</style>

</head>

<body>

<div class="login-box">

<div class="logo">

📚

</div>

<h1>

Library Login

</h1>

<p class="subtitle">

Library Management System

</p>

<form action="/loginUser" method="post">

<div class="input-group">

<label>Username</label>

<input type="text"
name="username"
placeholder="Enter Username"
required>

</div>

<div class="input-group">

<label>Password</label>

<input type="password"
name="password"
placeholder="Enter Password"
required>

</div>

<button class="login-btn" type="submit">

Login

</button>

</form>

<a href="/" class="home-link">

🏠 Back To Home

</a>

</div>

</body>

</html>