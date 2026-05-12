<div class="container">
    <div class="product-grid">

        <c:forEach var="p" items="${products}">
            <div class="product-card">

                <!-- ✅ IMAGE इथे येणार -->
                <img src="${p.imageUrl}" alt="product" class="product-img">

                <!-- ✅ NAME -->
                <div class="product-title">${p.name}</div>

                <!-- ✅ PRICE -->
                <div class="price">₹ ${p.price}</div>

                <!-- ⭐ RATING -->
                <div class="rating">
                    <c:forEach begin="1" end="5" var="i">
                        <span class="star ${i <= p.rating ? 'filled' : ''}">★</span>
                    </c:forEach>
                </div>

                <!-- ✅ ADD TO CART -->
                <a href="/cart/add/${p.id}" class="btn">Add to Cart</a>

            </div>
        </c:forEach>

    </div>
</div>