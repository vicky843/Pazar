<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="k"%>
<html>
<body>

<jsp:include page="adminheader.jsp"></jsp:include>
<br><br><br><br>
<k:choose>
<k:when test="${clickcat == 1 }">
<jsp:include page="category.jsp"></jsp:include>
</k:when>
<k:when test="${clicksup == 1 }">
<jsp:include page="supplier.jsp"></jsp:include>
</k:when>
<k:when test="${clickpro == 1 }">
<jsp:include page="product.jsp"></jsp:include>
</k:when>
<k:when test="${clickregtrs == 1 }">
<jsp:include page="registervalues.jsp"></jsp:include>
</k:when>
<k:otherwise>
<jsp:include page="adminmid.jsp"></jsp:include>
</k:otherwise>

</k:choose>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
