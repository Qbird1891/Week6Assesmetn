<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library database</title>
</head>
<body>
List of Library's:
	<table>
		<c:forEach items="${requestScope.allLibrarys}" var="currentlibrary">
			<tr>
				<td>${currentlibrary.nameOfLibrary}|</td>
				<td>${currentlibrary.address}</td>
				
			</tr>
			
		</c:forEach>
	</table>
	<br />
	<a href="index.jsp">Home</a>
</body>
</html>