<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Mindtree</title>

<style>
table {
	border-collapse: collapse;
}
</style>
</head>

<link rel="stylesheet" href="/resources/css/style.css">
<body>

	<%@page import="java.util.ArrayList"%>
	<%@page import="com.mindtree.library.entity.Library"%>
	<%@page import="java.util.Iterator"%>
	<%
		ArrayList<Library> listLibrary = (ArrayList) request.getAttribute("listLibrary");
	%>

	<div align="center">
		<h1>Libraries Management</h1>

		<br />
		<br />
		<table border="1" cellpadding="10">
			<thead>
				<tr>
					<th>Library ID</th>
					<th>Library Name</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<%
					Iterator<Library> iterator = listLibrary.iterator();

					while (iterator.hasNext()) {
						Library library = iterator.next();
				%>
				<tr>
					<td><%=library.getLibraryId()%></td>
					<td><%=library.getLibraryName()%></td>
					<td><a href="/update/<%=library.getLibraryId()%>  ">Update</a>
						&nbsp;&nbsp;&nbsp; <a href="/details/<%=library.getLibraryId()%>">Details</a>
					</td>

				</tr>
				<%
					}
				%>
			</tbody>
		</table>
		<br>
		<br>
		<br> <a href="/new">Add New Library</a> &nbsp;&nbsp;&nbsp; <a
			href="/delete">Delete Library</a>
	</div>
</body>
</html>

