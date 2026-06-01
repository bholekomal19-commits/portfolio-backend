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
    <h2>My Skills</h2>

    <button onclick="showSkill('java')">Java</button>
    <button onclick="showSkill('spring')">Spring Boot</button>
    <button onclick="showSkill('hibernate')">Hibernate</button>
    <button onclick="showSkill('mysql')">MySQL</button>
    <button onclick="showSkill('html')">HTML & CSS</button>
    <button onclick="showSkill('js')">JavaScript</button>
    <button onclick="showSkill('react')">React</button>
    <button onclick="showSkill('git')">Git & GitHub</button>

    <div id="skill-content"></div>
</section>

<script>
function showSkill(skill){

let content = "";

if(skill=="java"){
content = "OOP Concepts, Collections, Exception Handling, Multithreading, File Handling, Streams API";
}

else if(skill=="spring"){
content = "REST API, MVC, Dependency Injection, Spring Data JPA, CRUD Operations, Security Basics";
}

else if(skill=="hibernate"){
content = "ORM Concept, Entity Mapping, HQL, CRUD Operations, OneToMany, ManyToOne Relationships";
}

else if(skill=="mysql"){
content = "Tables, Joins, Queries, Stored Procedures, Primary & Foreign Keys, Normalization";
}

else if(skill=="html"){
content = "HTML5 Structure, Forms, Semantic Tags, CSS Styling, Flexbox, Grid, Responsive Design";
}

else if(skill=="js"){
content = "Variables, Functions, DOM Manipulation, Events, ES6 Features, Fetch API Basics";
}

else if(skill=="react"){
content = "Components, Props, State, Hooks (useState, useEffect), Routing Basics";
}

else if(skill=="git"){
content = "Version Control, Repository Management, Commit, Push, Pull, Branching";
}

document.getElementById("skill-content").innerHTML = content;

}
</script>
<!-- Projects -->

<section id="projects">

<h1 class="project-title">Projects</h1>

<div class="project-box">

    <div class="project-card">

        <h2>🛒 Amazon Clone</h2>

        <p>
        Developed a full-stack E-Commerce application using Java, 
        Spring Boot, Hibernate, MySQL, JSP and MVC architecture.
        </p>

        <h4>Features:</h4>

        <ul>
            <li>User Authentication</li>
            <li>Product Management</li>
            <li>Cart System</li>
            <li>CRUD Operations</li>
            <li>Database Integration</li>
        </ul>

        <div class="tech">
            <span>Java</span>
            <span>Spring Boot</span>
            <span>Hibernate</span>
            <span>MySQL</span>
        </div>

        <a href="#" class="btn">View Project</a>

    </div>


    <div class="project-card">

        <h2>💼 Portfolio Website</h2>

        <p>
        Built a responsive personal portfolio website using 
        Spring Boot, JSP, HTML, CSS and MySQL with dynamic contact management.
        </p>

        <h4>Features:</h4>

        <ul>
            <li>About Section</li>
            <li>Skills Section</li>
            <li>Contact Form</li>
            <li>Admin Dashboard</li>
            <li>Database Storage</li>
        </ul>

        <div class="tech">
            <span>Spring Boot</span>
            <span>JSP</span>
            <span>MySQL</span>
            <span>CSS</span>
        </div>

        <a href="#" class="btn">Live Demo</a>

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