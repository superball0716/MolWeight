<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title>category</title>
<script src="${path}/static/jquery-3.1.1.min.js"></script>
</head>
<body>
	<table>
		<tr>
			<th>category name</th>
		</tr>
		<c:forEach items="${names}" var="name">
			<tr>
				<td>${name}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>