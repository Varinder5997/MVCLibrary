<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Delete Library</title>

<style>
table {
	border-collapse: collapse;
}
</style>
</head>
<body>
	<%@page import="java.util.ArrayList"%>
	<%@page import="java.util.Iterator"%>
	<%
		ArrayList<Integer> listLibrary = (ArrayList) request.getAttribute("allId");
	%>
	<%
		int id = 0;
	%>
	<div align="center">
		<h1>Delete Libraries</h1>

		<form action="/d">
			<label for="id">Choose a Library:</label> <select id="id" name="id">
				<%
					Iterator<Integer> iterator = listLibrary.iterator();

					while (iterator.hasNext()) {
						Integer library = iterator.next();
				%>

				<option value="<%=library%>"><%=library%></option>

				<%
					}
				%>
			</select> <br>
			<br>

			<button type="submit">Done</button>


		</form>

		<br>
		<br>
		<br>

	</div>
</body>
</html>

