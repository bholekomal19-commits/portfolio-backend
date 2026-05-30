<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Books Management</title>

<style>

body{
background:#eef2f7;
font-family:Arial;
margin:0;
padding:0;
}

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
font-size:35px;
color:#1f4e79;
font-weight:bold;
}

.add-btn{
background:#1f4e79;
color:white;
padding:12px 20px;
text-decoration:none;
border-radius:8px;
font-weight:bold;
}

.add-btn:hover{
background:#163a5c;
}

table{
width:100%;
border-collapse:collapse;
background:white;
box-shadow:0 4px 15px rgba(0,0,0,0.1);
border-radius:10px;
overflow:hidden;
}

th{
background:#1f4e79;
color:white;
padding:15px;
font-size:18px;
}

td{
padding:18px;
text-align:center;
border-bottom:1px solid #ddd;
}

tr:hover{
background:#f4f7fb;
}

.book-img{
width:90px;
height:120px;
object-fit:cover;
border-radius:8px;
box-shadow:0 2px 6px rgba(0,0,0,0.2);
}

.home-btn{
display:inline-block;
margin-top:25px;
padding:12px 18px;
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

<h1 class="title">📚 Books Management</h1>

<a href="/addBook" class="add-btn">

+ Add New Book

</a>

</div>

<table>

<tr>

<th>Book Image</th>
<th>ID</th>
<th>Title</th>
<th>Author</th>
<th>Category</th>
<th>Price</th>
<th>Quantity</th>
<th>Action</th>

</tr>

<c:forEach items="${books}" var="book">

<tr>

<td>

<c:choose>

<c:when test="${book.title=='Java Programming'}">
<img src="/images/java.jpg" class="book-img">
</c:when>

<c:when test="${book.title=='Java Programming'}">
<img src="/images/java.jpg" class="book-img">
</c:when>

<c:when test="${book.title=='Spring Boot Guide'}">
<img src="/images/spring Boot Guide.jpg" class="book-img">
</c:when>

<c:when test="${book.title=='Database Systems'}">
<img src="/images/Database Systems.jpg" class="book-img">
</c:when>

<c:when test="${book.title=='Data Structures'}">
<img src="/images/Data Structures.jpg" class="book-img">
</c:when>

<c:when test="${book.title=='Operating System Concepts'}">
<img src="/images/Operating System Concepts.jpg" class="book-img">
</c:when>

<c:when test="${book.title=='clean code'}">
<img src="/images/clean code.jpg" class="book-img">
</c:when>

<c:when test="${book.title=='Computer Networks'}">
<img src="/images/Computer Networks.jpg" class="book-img">
</c:when>

<c:when test="${book.title=='HTML CSS JavaScript'}">
<img src="/images/HTML CSS JavaScript.jpg" class="book-img">
</c:when>

<c:when test="${book.title=='React Development'}">
<img src="/images/React Development.jpg" class="book-img">
</c:when>

<c:when test="${book.title=='Hibernate in Action'}">
<img src="/images/Hibernate in Action.jpg" class="book-img">
</c:when>

<c:otherwise>
<img src="/images/defaultbook.jpg" class="book-img">
</c:otherwise>

</c:choose>

</td>

<td>${book.id}</td>

<td>${book.title}</td>

<td>${book.author}</td>

<td>${book.category}</td>

<td>₹${book.price}</td>

<td>${book.quantity}</td>

<td>

<a href="/deleteBook?id=${book.id}"

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