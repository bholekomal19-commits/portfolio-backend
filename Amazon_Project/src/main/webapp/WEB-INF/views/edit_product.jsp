<%@ page contentType="text/html;
charset=UTF-8" %>

<h2>Edit Product</h2>

<form action="/products/update" method="post">

    <input type="hidden" name="id" value="${product.id}" />

    Name: <input type="text" name="name" value="${product.name}" /><br><br>

    Description: <input type="text" name="description" value="${product.description}" /><br><br>

    Price: <input type="text" name="price" value="${product.price}" /><br><br>

    Category: <input type="text" name="category" value="${product.category}" /><br><br>

    Image URL: <input type="text" name="imageUrl" value="${product.imageUrl}" /><br><br>

    <button type="submit">Update</button>

</form>