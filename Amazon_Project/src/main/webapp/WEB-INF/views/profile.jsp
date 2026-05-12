<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<html>
<head>
    <title>Profile</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<h2 style="text-align:center;">User Profile</h2>

<c:if test="${not empty sessionScope.user}">
    <div style="text-align:center;">
        <p><b>Name:</b> ${sessionScope.user.name}</p>
        <p><b>Email:</b> ${sessionScope.user.email}</p>
    </div>
</c:if>

</body>
</html>