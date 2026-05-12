<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<html>
	<head>
	    <title>All Products</title>
	    <link rel="stylesheet" href="/css/style.css">
	</head>
	<body>

<jsp:include page="header.jsp" />

<h2 style="text-align:center;">All Products</h2>

<table border="1" align="center" cellpadding="10">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Price</th>
        <th>Category</th>
        <th>Image</th>
        <th>Action</th>
    </tr>

	<c:forEach var="p" items="${products}">
	    <tr>
	        <td>${p.id}</td>
	        <td>${p.name}</td>
	        <td>${p.description}</td>
	        <td>₹ ${p.price}</td>
	        <td>${p.category}</td>

	        <td>
	            <img src="${p.imageUrl}" width="80" height="80"/>
	        </td>

			<td>
			    <a href="/products/delete/${p.id}">Delete</a> |
			    <a href="/products/edit/${p.id}">Edit</a> |
			    
			    <!-- FIXED -->
              <a href="/cart/add/${p.id}">Add to Cart</a>			
			  </td>
		    </tr>
	</c:forEach>
</table>

<br><br>

<div style="text-align:center;">
    <a href="/products/add">Add New Product</a>
</div>

<jsp:include page="footer.jsp" />

</body>
</html>
