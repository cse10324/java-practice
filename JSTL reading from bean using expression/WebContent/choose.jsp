<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>choose and when case</title>
</head>
<body>

<c:choose>
	<c:when test="${param.lang == 'java'}">
		hello java
	</c:when>
	<c:otherwise>
		learning something new
	</c:otherwise>
</c:choose>

</body>
</html>