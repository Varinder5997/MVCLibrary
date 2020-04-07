<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Delete Book</title>

<style>
table {
	border-collapse: collapse;
}
</style>
</head>
<body>
	<%@page import="java.util.ArrayList"%>
	<%@page import="java.util.Iterator"%>
	<%@page import ="com.mindtree.library.dto.LibraryDto"%>
	<%
		ArrayList<Integer> listBooks = (ArrayList) request.getAttribute("allIds");
	%>
	<%
		int id = 0;
	%>
	<div align="center">
		<h1>Delete Book</h1>

		<form action="/Update-book-ofId">
			<label for="id">Choose a Library:</label> <select id="id" name="id">
				<%
					Iterator<Integer> iterator = listBooks.iterator();

					while (iterator.hasNext()) {
						Integer book = iterator.next();
				%>

				<option value="<%=book%>"><%=book%></option>

				<%
					}
				%>
			</select> <br>
			<br>

			<button type="submit">Save</button>

		</form>
		<br>
		<br>
		<br>
	</div>
</body>
</html>

