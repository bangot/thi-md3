<%--
  Created by IntelliJ IDEA.
  User: toanv
  Date: 01/07/2020
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
	<title>Add</title>
</head>
<body>

<form method="post" action="/add">
<center>
	<h2>ADD PRODUCT</h2>
	<a href="/home">BACK</a>
	<table>
		<tbody>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td>Total</td>
				<td><input type="text" name="total"></td>
			</tr>
			<tr>
				<td>Color</td>
				<td><input type="text" name="color"></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><input type="text" name="desc"></td>
			</tr>
			<tr>
				<td>Category</td>
				<td>
					<select type="text" name="category">
					<c:forEach items='${requestScope["lists"]}' var="category" >
						<option value="${category.id}">${category.name}</option>
					</c:forEach>
				</select>
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="ADD"></td>
			</tr>
		</tbody>
	</table>
</center>
</form>
</body>
</html>
