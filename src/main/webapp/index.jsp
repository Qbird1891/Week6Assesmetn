<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library</title>
</head>
<body>
<h1>Book Database</h1>
	<form action="showBooks" method="get">
		<input type="submit" value="Show Books" />
	</form>
	<a href="addBooks.jsp">Add Books</a>
	<a href="deleteBooks.jsp">Delete Books</a>
	
	<form action="showLibrary" method="get">
		<input type="submit" value="Show Library" />
	</form>
	<a href="addLibrary.jsp">Add Library</a>
	<a href="deleteLibrary.jsp">Delete Library</a>
</body>
</html>