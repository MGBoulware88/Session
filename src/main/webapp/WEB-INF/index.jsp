<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter Home</title>
<link rel="stylesheet" href="/css/style.css" />
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
		<div class="col-4 card align-self-center container d-flex flex-column justify-content-center gap-3 p-5 my-auto mt-4">
			<h1>Welcome, User</h1>
			<hr />
			<p>What would you like to do today?</p>
			<div>
				<a class="btn btn-primary m-auto" href="http://localhost:8080/counter">Check Count</a>
				<a class="btn btn-danger m-auto" href="http://localhost:8080/reset">Destroy Cookies</a>
			</div>
		
		</div>
</body>
</html>