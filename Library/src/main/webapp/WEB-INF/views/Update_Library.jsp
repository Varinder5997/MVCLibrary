<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Edit Library Details</title>
</head>
<body>
	<div align="center">
		<h1>Update Library Details</h1>
		<br />
		<form:form action="/save" method="POST" modelAttribute="library">
			<table border="0" cellpadding="10">
				<tr>
					<td>Library ID:</td>
					<td><form:input path="libraryId" readonly="true" /></td>
				</tr>
				<tr>
					<td>Library Name:</td>
					<td><form:input path="libraryName" /></td>
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
