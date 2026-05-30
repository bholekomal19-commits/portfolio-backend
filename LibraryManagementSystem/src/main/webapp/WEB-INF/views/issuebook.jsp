<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Issue Books</title>

<style>

body{
font-family:Arial;
background:#eef2f7;
margin:0;
padding:0;
}

.container{
width:90%;
margin:auto;
padding:30px;
}

.title{
text-align:center;
font-size:35px;
margin-bottom:30px;
color:#1f4e79;
}

.form-box{
background:white;
padding:25px;
border-radius:12px;
box-shadow:0 3px 12px rgba(0,0,0,0.15);
margin-bottom:40px;
}

.form-grid{
display:grid;
grid-template-columns:repeat(2,1fr);
gap:20px;
}

input,select{
padding:12px;
width:100%;
border:1px solid #ccc;
border-radius:8px;
box-sizing:border-box;
}

.submit-btn{
margin-top:20px;
padding:12px 25px;
background:#1f4e79;
color:white;
border:none;
border-radius:8px;
cursor:pointer;
}

.submit-btn:hover{
background:#163a5c;
}

.day-chart{
background:white;
padding:20px;
margin-bottom:30px;
border-radius:12px;
box-shadow:0 3px 10px rgba(0,0,0,0.1);
}

.schedule-table{
width:100%;
border-collapse:collapse;
}

.schedule-table th{
background:#1f4e79;
color:white;
padding:12px;
}

.schedule-table td{
padding:12px;
border:1px solid #ddd;
text-align:center;
}

table{
width:100%;
border-collapse:collapse;
background:white;
box-shadow:0 3px 12px rgba(0,0,0,0.1);
}

th{
background:#1f4e79;
color:white;
padding:15px;
}

td{
padding:14px;
text-align:center;
border-bottom:1px solid #ddd;
}

tr:hover{
background:#f2f6fb;
}

.return-btn{
background:red;
padding:8px 14px;
color:white;
text-decoration:none;
border-radius:6px;
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

.error{
color:red;
font-weight:bold;
text-align:center;
margin-top:15px;
}

</style>

</head>

<body>

<div class="container">

<h1 class="title">

📚 Issue / Return Books

</h1>

<div class="day-chart">

<h2>📅 Department Issue Book Schedule</h2>

<table class="schedule-table">

<tr>
<th>Department</th>
<th>Issue Day</th>
</tr>

<tr>
<td>Computer Department</td>
<td>Monday</td>
</tr>

<tr>
<td>Physics Department</td>
<td>Tuesday</td>
</tr>

<tr>
<td>Commerce Department</td>
<td>Wednesday</td>
</tr>

<tr>
<td>Information Technology</td>
<td>Thursday</td>
</tr>

<tr>
<td>Math Department</td>
<td>Friday</td>
</tr>

<tr>
<td>Chemistry Department</td>
<td>Saturday</td>
</tr>

</table>

</div>

<div class="form-box">

<form action="/saveIssueBook" method="post">

<div class="form-grid">

<input type="text"
name="studentName"
placeholder="Student Name"
required>

<input type="text"
name="bookName"
placeholder="Book Name"
required>

<select name="department" required>

<option value="">Select Department</option>

<option value="Information Technology">
Information Technology
</option>

<option value="Math">
Math
</option>

<option value="Chemistry">
Chemistry
</option>

<option value="Computer">
Computer
</option>

<option value="Commerce">
Commerce
</option>

</select>

<select name="issueDay" required>

<option value="">Select Issue Day</option>

<option value="Monday">Monday</option>
<option value="Tuesday">Tuesday</option>
<option value="Wednesday">Wednesday</option>
<option value="Thursday">Thursday</option>
<option value="Friday">Friday</option>
<option value="Saturday">Saturday</option>

</select>

<input type="date"
name="issueDate"
required>

<input type="date"
name="returnDate"
required>

</div>

<button class="submit-btn" type="submit">

Issue Book

</button>

</form>

</div>

<c:if test="${param.error=='invalidday'}">

<p class="error">

❌ This department cannot issue books on this day

</p>

</c:if>

<table>

<tr>

<th>ID</th>
<th>Student Name</th>
<th>Book Name</th>
<th>Department</th>
<th>Issue Day</th>
<th>Issue Date</th>
<th>Return Date</th>
<th>Action</th>

</tr>

<c:forEach items="${issueBooks}" var="book">

<tr>

<td>${book.id}</td>

<td>${book.studentName}</td>

<td>${book.bookName}</td>

<td>${book.department}</td>

<td>${book.issueDay}</td>

<td>${book.issueDate}</td>

<td>${book.returnDate}</td>

<td>

<a class="return-btn"
href="/returnBook?id=${book.id}">

Return

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