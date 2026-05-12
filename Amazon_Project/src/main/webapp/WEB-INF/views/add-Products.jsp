<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link rel="stylesheet" href="/css/style.css">

<h2>Add Product</h2>

<form action="/products/save" method="post">

    <label>Name:</label>
    <input type="text" name="name" required/>

    <label>Description:</label>
    <input type="text" name="description"/>

    <label>Price:</label>
    <input type="number" name="price" required/>

    <label>Category:</label>
    <input type="text" name="category"/>

    <label>Image Path:</label>
    <input type="text" name="imageUrl" placeholder="/images/laptop.jpg"/>

    <button type="submit">Save</button>
</form>

<a href="/products">⬅ Back to Products</a>