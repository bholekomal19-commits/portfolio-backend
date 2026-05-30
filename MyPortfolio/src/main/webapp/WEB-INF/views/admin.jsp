<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Admin Panel</title>

<style>

body{

font-family:Arial;

background:#111;

color:white;

padding:30px;

}

h1{

text-align:center;

color:cyan;

margin-bottom:30px;

}

table{

width:100%;

border-collapse:collapse;

background:#222;

}

th,td{

padding:15px;

border:1px solid gray;

text-align:center;

}

th{

background:cyan;

color:black;

}

a{

text-decoration:none;

padding:8px 15px;

background:red;

color:white;

border-radius:5px;

}

tr:hover{

background:#333;

}

</style>

</head>

<body>

<h1>Contact Messages</h1>

<table>

<tr>

<th>ID</th>

<th>Name</th>

<th>Email</th>

<th>Message</th>

<th>Action</th>

</tr>

<c:forEach items="${contacts}" var="c">

<tr>

<td>${c.id}</td>

<td>${c.name}</td>

<td>${c.email}</td>

<td>${c.message}</td>

<td>

<a href="/delete/${c.id}">

Delete

</a>

</td>

</tr>

</c:forEach>

</table>

</body>

</html>