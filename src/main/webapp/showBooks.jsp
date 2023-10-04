<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of all Books</title>
</head>
<body>
Title:           Author:            Category:            Publication Date:

<table>

		<c:forEach items="${requestScope.allBooks}" var="currentbook">
		
			<tr>
				<td>${currentbook.title}|</td>
				<td>${currentbook.author }|</td>
				<td>${currentbook.category }|</td>
				<td>${currentbook.publicationDate }</td>
				
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="index.jsp">Home</a>
</body>
</html>