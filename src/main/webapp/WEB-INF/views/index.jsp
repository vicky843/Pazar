<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="k"%>
<html>
<body>

<jsp:include page="header.jsp"></jsp:include>
<br><br><br><br>

<k:choose>
<k:when test="${clicklogin == 1}">
<jsp:include page="loginpage.jsp"></jsp:include>

</k:when>
<k:when test="${clickreg == 1}">
<jsp:include page="register.jsp"></jsp:include>
</k:when>


</k:choose>
<br><br><br>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
