<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<html>
    <body>
        
        <% String saveMessage=(String)request.getAttribute("saveMessage");
if(saveMessage!=null){ %>
       <h1 style="color:green;">(<%= saveMessage %>)</h1>
<% } %>
<% if(session!=null){ 
    if(session.getAttribute("userName")!=null) { %>
        <a href="studentForm.jsp">Register Student Details</a>
        <a href="viewDetails.jsp">View Student Details</a>
        <a href="logout">Logout</a>
<% }else{
    response.sendRedirect("index.jsp");
}
} %>
    </body>
</html>