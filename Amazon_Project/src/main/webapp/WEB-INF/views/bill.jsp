<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link rel="stylesheet" href="/css/style.css">

<div class="container">

    <h2 style="text-align:center;">🧾 Bill Summary</h2>

    <table class="bill-table">
        <tr>
            <th>🛍️ Product</th>
            <th>💰 Price</th>
            <th>🔢 Qty</th>
            <th>🧮 Total</th>
        </tr>

		<c:forEach var="c" items="${items}">
		<tr>
		    <td>
		        <img src="${c.product.imageUrl}" width="60" height="60">
		        📦 ${c.product.name}
		    </td>
		    <td>₹ ${c.product.price}</td>
		    <td>${c.quantity}</td>
		    <td>₹ ${c.product.price * c.quantity}</td>
		</tr>
		</c:forEach>
    </table>

    <div class="total-box">
        💵 Grand Total: ₹ ${total}
    </div>

    <div class="btn-box">
        <a href="/cart" class="btn back">⬅ Back to Cart</a>
        <a href="/orders/place" class="btn order">✅ Place Order</a>
    </div>

</div>