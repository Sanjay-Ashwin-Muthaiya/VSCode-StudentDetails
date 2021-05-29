package com.example.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/viewDetails.jsp")
public class ViewDetailsServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        HttpSession session = req.getSession(false);
        ServletContext context = getServletContext();
        if (session != null) {
            if (session.getAttribute("userName") != null) {
                PrintWriter out = res.getWriter();
                HashMap<String, String> student_details = StudentDetails.getHashmap();
                student_details = (HashMap<String, String>) context.getAttribute("all_student_details");
                out.println(
                        "<html><body><table border='1' width='700' align='center'><tr bgcolor='#8ba5e0'><th>StudentID</th><th>Student Details</th></tr>");
                for (Map.Entry<String, String> m : student_details.entrySet()) {
                    out.println("<tr><td>" + m.getKey() + "</td><td>" + m.getValue() + "</td>"
                            + "<td><a href='DeleteServlet?id=" + m.getKey() + "'>Delete</a></td></tr>");
                }
                out.println("</table><br><a href='home.jsp'>Dashboard</a></body></html>");
            } else {
                res.sendRedirect("index.jsp");
            }
        }
    }
}