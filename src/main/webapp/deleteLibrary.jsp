<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete a record from the database</title>
</head>
<body>
<form action="deleteLibrary" method="post">
		Enter the Library you would like to Delete: <input type="text" name="NameOfLibrary"
			size="25"> <input type="submit" value="Delete" />
</form>
<br />
	<a href="index.jsp">Home</a>
</body>
</html>