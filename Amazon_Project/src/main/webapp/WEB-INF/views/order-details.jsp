<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="/css/style.css">

<div class="container">

	<h2 style="text-align:center;">📦 Order Details</h2>

	<div class="order-box">
	    <p><b>Order ID:</b> ${order.id}</p>
	    <p><b>Date:</b> ${order.createdAt}</p>
	    <p><b>Status:</b> ${order.status}</p>

	    <h3>🛒 Products</h3>

	    <table>
	        <tr>
	            <th>Product</th>
	            <th>Price</th>
	            <th>Qty</th>
	        </tr>

	        <c:forEach var="item" items="${items}">
	            <tr>
	                <td>${item.product.name}</td>
	                <td>${item.product.price}</td>
	                <td>${item.quantity}</td>
	            </tr>
	        </c:forEach>
	    </table>
	</div></div>