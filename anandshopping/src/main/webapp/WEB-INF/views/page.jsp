<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Anand Shopping - ${title}</title>

<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<link href="${css}/bootstrap-theme.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="${css}/shop-homepage.css" rel="stylesheet">

</head>

<body>

	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./common/navigationmenu.jsp"%>

		<!-- Body Content -->
		<div class="content">

			<!-- Load when user clicks Home -->
			<c:if test="${userClickHome}">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- Load when user clicks About -->
			<c:if test="${userClickAbout}">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- Load when user clicks Contact -->
			<c:if test="${userClickContact}">
				<%@include file="contact.jsp"%>
			</c:if>

			<!-- Load when user clicks List Products -->
			<c:if test="${userClickList}">
				<%@include file="productlist.jsp"%>
			</c:if>

		</div>
		
		<!-- Footer Section-->
		<%@include file="./common/footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>
		<script src="${js}/custom.js"></script>
	</div>
</body>

</html>
