<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>
<title>Spring Boot</title>
<style>
table {
	border-collapse: collapse;
}
</style>
</head>
<body>
	<%@page import="java.util.List"%>
	<%@page import="com.mindtree.library.entity.Books"%>
	<%@page import="com.mindtree.library.entity.Library"%>
	<%@page import="com.mindtree.library.dto.ModelDto"%>
	<%@page import="java.util.Set"%>
	<%@page import="java.util.TreeSet"%>

	<%@page import="java.util.Iterator"%>
	<%
		ModelDto dto = (ModelDto) request.getAttribute("dto");
	%>
	<%
		List<Books> listBooks = dto.getBooks();
	%>
	<%
		Library library = dto.getLibrary();
	%>

	<div align="center">
		<h1>
			Library Details of
			<%=library.getLibraryName()%></h1>
		<br />
		<br />
		<table border="1" cellpadding="10">
			<thead>
				<tr>
					<th>Book ID</th>
					<th>Book Name</th>

				</tr>
			</thead>
			<tbody>
				<%
					Iterator<Books> iterator = listBooks.iterator();

					while (iterator.hasNext()) {
						Books books = iterator.next();
				%>
				<tr>
					<td><%=books.getBookId()%></td>
					<td><%=books.getBookName()%></td>

				</tr>
				<%
					}
				%>

			</tbody>
		</table>
		<br>
		<br>
		<br> <a href="/new-book/<%=library.getLibraryId()%>">Add New
			Book</a>&nbsp;&nbsp; <a href="/update-b/<%=library.getLibraryId()%>">Update
			Book</a>&nbsp;&nbsp; <a href="/delete-b/<%=library.getLibraryId()%>">Delete
			Book</a>

	</div>
</body>
</html>

