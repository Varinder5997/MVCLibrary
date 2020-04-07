<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Add new Book</title>
</head>
<body>
	<%-- 
<%@page import ="com.mindtree.kalingahospital.entity.KalingaHospital" %> --%>
	<div align="center">
		<h1>Add New Book</h1>
		<br />
		<form:form action="/save-book" method="POST" modelAttribute="book">

			<table border="0" cellpadding="10">
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