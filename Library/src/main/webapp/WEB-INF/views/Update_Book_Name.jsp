<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Edit Book Details</title>
</head>
<body>
	<div align="center">
		<h1>Update Book Details</h1>
		<br />
		<form:form action="/edit-book" method="POST" modelAttribute="book">
			<table border="0" cellpadding="10">
				<tr>
					<td>Book ID:</td>
					<td><form:input path="bookId"  readonly="true" /></td>
				</tr>
				<tr>
					<td>Book Name:</td>
					<td><form:input path="bookName" /></td>
				</tr>
	
				<tr>
					<td colspan="2"><button type="submit">Save</button></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>
>
