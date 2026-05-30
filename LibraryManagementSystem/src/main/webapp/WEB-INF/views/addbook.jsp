<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Add Book</title>

<link rel="stylesheet" href="/css/style.css">

<style>

body{
margin:0;
padding:0;
font-family:Arial,sans-serif;
background:#eef2f7;
}

.container{
width:50%;
margin:40px auto;
background:white;
padding:35px;
border-radius:18px;
box-shadow:0 5px 20px rgba(0,0,0,0.2);
}

.book-img{
text-align:center;
margin-bottom:20px;
}

.book-img img{
width:220px;
height:140px;
border-radius:12px;
object-fit:cover;
box-shadow:0px 4px 12px rgba(0,0,0,0.3);
}

.title{
text-align:center;
color:#1f4e79;
margin-bottom:30px;
font-size:34px;
}

.form-group{
margin-bottom:18px;
}

label{
display:block;
font-weight:bold;
margin-bottom:8px;
color:#333;
}

input{
width:100%;
padding:12px;
border:1px solid #ccc;
border-radius:8px;
font-size:15px;
box-sizing:border-box;
}

input:focus{
outline:none;
border-color:#1f4e79;
}

.btn{
width:100%;
padding:14px;
border:none;
background:#1f4e79;
color:white;
font-size:16px;
border-radius:8px;
cursor:pointer;
margin-top:15px;
}

.btn:hover{
background:#163a5c;
}

.back-btn{
display:block;
margin-top:20px;
text-align:center;
text-decoration:none;
color:#1f4e79;
font-weight:bold;
font-size:18px;
}

.back-btn:hover{
color:#163a5c;
}

</style>

</head>

<body>

<div class="container">

<div class="book-img">

<img src="/images/book.jpg" alt="Book Image">

</div>

<h1 class="title">

📚 Add New Book

</h1>

<form action="/saveBook" method="post">

<div class="form-group">

<label>Book Title</label>

<input type="text"
name="title"
placeholder="Enter Book Title"
required>

</div>

<div class="form-group">

<label>Author Name</label>

<input type="text"
name="author"
placeholder="Enter Author Name"
required>

</div>

<div class="form-group">

<label>Category</label>

<input type="text"
name="category"
placeholder="Enter Category"
required>

</div>

<div class="form-group">

<label>Price</label>

<input type="number"
step="0.01"
name="price"
placeholder="Enter Price"
required>

</div>

<div class="form-group">
<label>Book Image URL</label>
<input type="text" name="image"
placeholder="Paste Image URL">
</div>

<div class="form-group">

<label>Quantity</label>

<input type="number"
name="quantity"
placeholder="Enter Quantity"
required>

</div>

<button class="btn" type="submit">

Save Book

</button>

</form>

<a class="back-btn" href="/books">

⬅ Back To Books

</a>

</div>

<div class="book-gallery">

<img src="/images/java.jpg">
<img src="/images/Spring Boot Guide.jpg">
<img src="/images/database Systems.jpg">
<img src="/images/Data Structure.jpg">
<img src="/images/Operating Systems.jpg">
<img src="/images/clean code.jpg">
<img src="/images/Computer Networks.jpg">
<img src="/images/HTML CSS JavaScript.jpg">
<img src="/images/React Develpment.jpg">
<img src="/images/Hibernate in Action.jpg">


</div>

</body>

</html>