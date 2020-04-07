<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Add new Library</title>
</head>
<body>
<script type="text/javascript" src="/resources/js/form.js"></script>
	<%-- 
<%@page import ="com.mindtree.kalingahospital.entity.KalingaHospital" %> --%>
	<%@page import="java.util.ArrayList"%>
	<%@page import="java.util.List"%>
	<%@page import="java.util.Iterator"%>
	<%@page import="com.mindtree.library.dto.NewDto"%>
	<%@page import= "com.mindtree.library.entity.Library" %>
<%-- 	<%
		NewDto dto=(NewDto)request.getAttribute("dto");
		Library library=dto.getLibrary();
		List<Library>allLibrary=dto.getAllLibraries();
		//ArrayList<Integer> listLibrary = (ArrayList) request.getAttribute("allId");
	%> --%>
	
	<div align="center">
		<h1>Add New Library</h1>
		<br />
		<form:form name="myform" action="/save" method="POST" modelAttribute="library" onsubmit="return validateform()">

			<label for="libraryName">LibraryName : </label>&nbsp;&nbsp;
					<form:input type="text" path="libraryName"
				placeholder="Library Name" />
			<br>

			<br>
			<button type="submit">Save</button>


		</form:form>


	</div>
</body>
</html>