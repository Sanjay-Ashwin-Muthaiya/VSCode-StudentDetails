<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>

<html>
    <body>
        <% if(session!=null){ 
            if(session.getAttribute("userName")!=null) { %>
                <a href="home.jsp">DashBoard</a>
       <form action="saveStudentDetails" method="POST">
           Enter Student ID:<input type="number" name=studentId><br>
           Enter Student Name:<input type="text" name=studentName><br>
           Enter Student Mobile Number:<input type="text" name=studentMobile><br>
           Enter Student Roll No:<input type="text" name=studentRollNo><br>
           <input type="submit" value="Save">
           <% }else{
            response.sendRedirect("index.jsp");
        }
        } %>
       </form>
    </body>
</html>