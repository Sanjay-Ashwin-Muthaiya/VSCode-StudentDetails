<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<html>
<body>
    <style>
        #head{
           color: darkgreen;
        }
    </style>
<h1 id="head">Login Page</h1>
<% String errorMessage=(String)request.getAttribute("error");
if(errorMessage!=null){ %>
    <p style="color: red;">(<%= errorMessage %>)</p>
<% } %>
<form action="login" method="POST">
    Enter UserName:<input type="text" name="userName"><br>
    Enter Password:<input type="password" name="password"><br>
    <input type="submit" value="Login">
</form>
</body>
</html>
