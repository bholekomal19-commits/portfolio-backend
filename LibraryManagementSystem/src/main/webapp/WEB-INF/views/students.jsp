<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Students Management</title>

<link rel="stylesheet" href="/css/style.css">

<style>

.container{
width:90%;
margin:auto;
padding:30px;
}

.top-section{
display:flex;
justify-content:space-between;
align-items:center;
margin-bottom:30px;
}

.title{
font-size:32px;
color:#1f4e79;
}

.add-btn{
background:#1f4e79;
color:white;
padding:12px 20px;
text-decoration:none;
border-radius:8px;
}

.add-btn:hover{
opacity:0.9;
}

table{
width:100%;
border-collapse:collapse;
background:white;
box-shadow:0 3px 10px rgba(0,0,0,0.15);
}

th{
background:#1f4e79;
color:white;
padding:15px;
}

td{
padding:15px;
text-align:center;
border-bottom:1px solid #ddd;
}

tr:hover{
background:#f4f7fb;
}

.home-btn{
display:inline-block;
margin-top:20px;
padding:10px 18px;
background:#444;
color:white;
text-decoration:none;
border-radius:6px;
}

</style>

</head>

<body>

<div class="container">

<div class="top-section">

<h1 class="title">

🎓 Students Management

</h1>

<a href="/addStudent" class="add-btn">

+ Add Student

</a>

</div>

<table>

<tr>

<th>ID</th>
<th>Name</th>
<th>RollNo</th>
<th>Course</th>
<th>Department</th>
<th>Email</th>
<th>Contact</th>
<th>Action</th>

</tr>

<c:forEach items="${students}" var="student">

<tr>

<td>${student.id}</td>

<td>${student.name}</td>

<td>${student.rollNo}</td>

<td>${student.course}</td>

<td>${student.department}</td>


<td>${student.email}</td>

<td>${student.contact}</td>

<td>

<a href="/deleteStudent?id=${student.id}"

style="background:navy;
color:white;
padding:8px 12px;
text-decoration:none;
border-radius:5px;">

Delete

</a>

</td>

</tr>

</c:forEach>

</table>

<a href="/" class="home-btn">

🏠 Back Home

</a>

</div>

</body>

</html>