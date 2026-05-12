<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="/css/style.css">
<a href="/orders/details/${o.id}" class="btn-view">
    🔍 View Details
</a>
<div class="container">
	<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<h2 style="text-align:center;">📦 Your Orders</h2>
    <c:forEach var="o" items="${orders}">
        <div class="order-card">

            <div class="order-header">
                <span><b>Order ID:</b> ${o.id}</span>
                <span><b>Date:</b> ${o.orderDate}</span>
            </div>

            <div class="order-body">
                <p><b>Total Price:</b> ₹ ${o.totalPrice}</p>

                <p>
                    <b>Status:</b> 
                    <span class="status">${o.status}</span>
                </p>
            </div>
			<span class="status">
			    <c:choose>
			        <c:when test="${o.status == 'DELIVERED'}">✅ Delivered</c:when>
			        <c:when test="${o.status == 'PENDING'}">⏳ Pending</c:when>
			        <c:otherwise>🚚 Shipped</c:otherwise>
			    </c:choose>
			</span>

        </div>
    </c:forEach>
	

</div>