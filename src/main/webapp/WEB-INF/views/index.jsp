<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="k"%>
<html>
<body>

<jsp:include page="header.jsp"></jsp:include>
<br><br><br><br>
<k:choose>

<k:when test="${clickloginsss == 1}">
<jsp:include page="loginpage.jsp"></jsp:include>
<h2> this is login page</h2>
</k:when>
<k:when test="${clickregsss == 1}">
<jsp:include page="register.jsp"></jsp:include>

</k:when>

<k:when test="${about ==1 }">
<jsp:include page="aboutus.jsp"></jsp:include>
</k:when>
<k:when test="${home ==1 }">
<jsp:include page="home.jsp"></jsp:include>
</k:when>
<k:otherwise>
<jsp:include page="carousel.jsp"></jsp:include></k:otherwise>
</k:choose>


<br><br><br>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
