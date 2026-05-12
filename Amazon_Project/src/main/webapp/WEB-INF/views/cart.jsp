<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">

<div class="cart-container">

    <h2><i class="fa-solid fa-cart-shopping"></i> Your Shopping Cart</h2>

    <table class="cart-table">
        <tr>
            <th>Product</th>
            <th>Price</th>
            <th>Qty</th>
            <th>Total</th>
            <th>Action</th>
        </tr>

        <c:forEach var="c" items="${cartList}">
            <tr>

                <!-- Product -->
                <td class="product-info">
                    <img src="${c.product.imageUrl}" class="product-img">

                    <div>
                        <b>${c.product.name}</b><br>
                        <small>${c.product.description}</small>
                    </div>
                </td>

                <!-- Price -->
                <td>₹ ${c.product.price}</td>

                <!-- Quantity -->
                <td class="qty-box">
                    <a href="/cart/decrease/${c.id}" class="qty-btn">-</a>
                    <span>${c.quantity}</span>
                    <a href="/cart/increase/${c.id}" class="qty-btn">+</a>
                </td>

                <!-- Total -->
                <td>₹ ${c.product.price * c.quantity}</td>

                <!-- Action -->
                <td>
                    <a href="/cart/delete/${c.id}" class="remove-btn">
                        <i class="fa-solid fa-trash"></i> Remove
                    </a>
                </td>

            </tr>
        </c:forEach>
    </table>

    <!-- Checkout Section -->
    <div class="checkout-box">
        <a href="/cart/bill" class="checkout-btn">
            <i class="fa-solid fa-credit-card"></i> Proceed to Checkout
        </a>
    </div>

</div>