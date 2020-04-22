<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<%@page import="classmains.Category"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page of Productivity</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</head>
<body>

	<div class="center-block">
	<form action="cat" method="POST">

		<h2>Add Category</h2>

		<label>Category Name:</label><br>
		<input type="text" name="cat_description">

		<input type="submit" value="Add">

	</form>
	</div>


	<form action="cat" method="GET">

		<input type="submit" value="List" class="btn btn-primary">

		<div class="">
			<table class="table">

				<!-- HEADER -->
				<tr>
					<th>Id</th>
					<th>Description</th>
				</tr>

				<!-- CONTAINT OF THE TABLE -->

				<%
					ArrayList<Category> list = (ArrayList<Category>) request.getAttribute("list");
				if (list != null) {
					for (Category c : list) {
				%>

				<tr>
					<td><%=c.getId_category()%></td>
					<td><%=c.getCat_description()%></td>
				</tr>

				<%
					}
				}
				%>

			</table>
		</div>

	</form>

</body>
</html>