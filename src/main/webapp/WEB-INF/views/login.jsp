<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html>
<body>
<h1>
	<p> Enter use name and password to login </p>
</h1>
<form method="post" action="./loginform" name="loginForm">
	<input type="text" id="userName" name="userName"/>
	<input type="password" id="password" name="password"/>
	<input type="button" name="Submit" value="Submit" onclick="document.forms['loginForm'].submit();" />
</form>
</body>
</html>