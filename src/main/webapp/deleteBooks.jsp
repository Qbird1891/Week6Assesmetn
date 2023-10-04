<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete book from the database</title>
</head>
<body>
<form action="deleteBooks" method="post">
		Enter the title of the book to delete: 
		<input type="text" name="title" size="25"> <input type="submit" value="Delete" />
	</form>	
</body>
</html>