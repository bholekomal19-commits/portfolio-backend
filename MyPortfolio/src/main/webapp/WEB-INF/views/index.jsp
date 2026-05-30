<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
	<link rel="stylesheet" href="/css/style.css">
<meta charset="UTF-8">

<title>Komal Portfolio</title>

<style>

*{
margin:0;
padding:0;
box-sizing:border-box;
font-family:Arial;
scroll-behavior:smooth;
}

body{
background:#111;
color:white;
}

/* Navbar */

nav{
background:black;
padding:20px;
display:flex;
justify-content:space-between;
align-items:center;
position:sticky;
top:0;
}

nav h2{
color:cyan;
}

nav ul{
display:flex;
gap:20px;
list-style:none;
}

nav ul li a{
color:white;
text-decoration:none;
}

/* Hero */

.hero{
height:90vh;
display:flex;
justify-content:center;
align-items:center;
flex-direction:column;
text-align:center;
}

.hero h1{
font-size:60px;
color:cyan;
}

.hero p{
font-size:22px;
margin-top:15px;
}

button{
padding:12px 25px;
margin-top:20px;
border:none;
border-radius:5px;
cursor:pointer;
background:cyan;
font-weight:bold;
}

/* Common Section */

section{
padding:80px;
text-align:center;
}

section h1{
color:cyan;
margin-bottom:25px;
}

/* Skills */

.skill-box{
display:flex;
justify-content:center;
gap:20px;
flex-wrap:wrap;
}

.skill{
background:#222;
padding:20px;
width:150px;
border-radius:10px;
}

/* Projects */

.project-box{
display:flex;
justify-content:center;
gap:20px;
flex-wrap:wrap;
}

.project{
background:#222;
padding:25px;
border-radius:10px;
width:320px;
}

/* Contact */

input, textarea{

width:320px;
padding:10px;
margin:10px;

}

/* Footer */

footer{
background:black;
padding:20px;
text-align:center;
}

</style>

</head>

<body>

<!-- Navbar -->

<nav>

<h2>Komal Portfolio</h2>

<ul>

<li><a href="#">Home</a></li>

<li><a href="#about">About</a></li>

<li><a href="#skills">Skills</a></li>

<li><a href="#projects">Projects</a></li>

<li><a href="#education">Education</a></li>

<li><a href="#contact">Contact</a></li>

</ul>

</nav>

<!-- Hero -->

<section class="hero">

<h1>Komal Bhole</h1>

<p>Java Full Stack Developer</p>

<p>MSc IT Student | Backend Developer | Problem Solver</p>

<a href="PROFILE.pdf" download>

  <button>Download Resume</button>

</a>

</section>

<!-- About -->

<section id="about">

<h1>About Me</h1>

<div class="about-container">

<div class="about-image">

<img src="/images/profile.jpg.png" alt="Profile">

</div>

<div class="about-text">

<p>

I am a passionate and dedicated Java Full Stack Developer currently pursuing MSc IT.

I have knowledge of Core Java, Spring Boot, Hibernate, MySQL, HTML, CSS, JavaScript, React, and REST APIs.

I enjoy building responsive web applications and improving my technical skills through projects and problem solving.

</p>

</div>

</div>

</section>

<!-- Skills -->

<section id="skills">

<h1>Skills</h1>

<div class="skill-box" onclick="toggleSkill('java')">Java</div>
<div id="java" class="skill-detail">
OOP Concepts, Collections, Exception Handling, Multithreading, File Handling, Streams API
</div>

<div class="skill-box" onclick="toggleSkill('spring')">Spring Boot</div>
<div id="spring" class="skill-detail">
REST API, MVC, Dependency Injection, Spring Data JPA, CRUD Operations, Security Basics
</div>

<div class="skill-box" onclick="toggleSkill('hibernate')">Hibernate</div>
<div id="hibernate" class="skill-detail">
ORM Concept, Entity Mapping, HQL, CRUD Operations, OneToMany, ManyToOne Relationships
</div>

<div class="skill-box" onclick="toggleSkill('mysql')">MySQL</div>
<div id="mysql" class="skill-detail">
Tables, Joins, Queries, Stored Procedures, Primary & Foreign Keys, Normalization
</div>

<div class="skill-box" onclick="toggleSkill('htmlcss')">HTML & CSS</div>
<div id="htmlcss" class="skill-detail">
HTML5 Structure, Forms, Semantic Tags, CSS Styling, Flexbox, Grid, Responsive Design
</div>

<div class="skill-box" onclick="toggleSkill('js')">JavaScript</div>
<div id="js" class="skill-detail">
Variables, Functions, DOM Manipulation, Events, ES6 Features, Fetch API Basics
</div>

<div class="skill-box" onclick="toggleSkill('react')">React</div>
<div id="react" class="skill-detail">
Components, Props, State, Hooks (useState, useEffect), Routing Basics
</div>

<div class="skill-box" onclick="toggleSkill('git')">Git & GitHub</div>
<div id="git" class="skill-detail">
Version Control, Repository Management, Commit, Push, Pull, Branching
</div>

</section>
<!-- Projects -->

<section id="projects">

<h1>Projects</h1>

<div class="project-box">

<div class="project">

<h2>Amazon Clone</h2>

<p>

Developed E-Commerce project using Java, Spring Boot,
Hibernate, MySQL and JSP.

</p>

</div>

<div class="project">

<h2>Portfolio Website</h2>

<p>

Created portfolio using Spring Boot, JSP and MySQL
with contact management system.

</p>

</div>

</div>

</section>

<!-- Education -->

<section id="education">

<h1>Education</h1>

<p><b>MSc IT</b> — Currently Pursuing</p>

<br>

<p><b>BSc IT</b> — Completed</p>

</section>

<!-- Internship -->

<section>

<h1>Internship</h1>

<p>

Completed six-month internship in Java Full Stack Development.
Worked on backend development, databases,
Spring Boot projects and frontend technologies.

</p>

</section>

<!-- Contact -->

<section id="contact">

<h1>Contact Me</h1>

<form action="/saveContact" method="post">

<input type="text"
name="name"
placeholder="Enter Name"
required>

<br>

<input type="email"
name="email"
placeholder="Enter Email"
required>

<br>

<textarea
name="message"
rows="5"
placeholder="Enter Message"
required></textarea>

<br>

<button type="submit">

Send

</button>

</form>

</section>

<footer>

<p>

© 2026 Komal Bhole | Java Full Stack Developer

</p>

</footer>
<script>

function toggleSkill(id){

let box = document.getElementById(id);

if(box.style.display === "block"){
box.style.display = "none";
}
else{
box.style.display = "block";
}

}

</script>

</body>

</html>