package com.example.login;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/saveStudentDetails")
public class SaveDetailsServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        HttpSession session = req.getSession(false);
        ServletContext context = getServletContext();

        if (session != null) {
            String studentID = req.getParameter("studentId");
            String studentName = req.getParameter("studentName");
            String studentMobile = req.getParameter("studentMobile");
            String studentRollNo = req.getParameter("studentRollNo");
            StudentDetails.setStudentID(studentID);
            StudentDetails.setStudentName(studentName);
            StudentDetails.setStudentMobile(studentMobile);
            StudentDetails.setStudentRollNo(studentRollNo);
            HashMap<String, String> studentData_Object = (HashMap<String, String>) context
                    .getAttribute("saveStudentDetails");
            if (studentData_Object == null) {
                studentData_Object = new HashMap<String, String>();
            }
            studentData_Object.put(studentID,
                    "Name: " + studentName + "  MobileNumber: " + studentMobile + "  RollNo: " + studentRollNo);
            context.setAttribute("saveStudentDetails", studentData_Object);
            context.setAttribute("all_student_details", StudentDetails.saveDetails(studentData_Object));
            PrintWriter out = res.getWriter();
            out.println("Saved Successfully");
            req.setAttribute("saveMessage", "Saved Successfully");
            req.getRequestDispatcher("home.jsp").forward(req, res);

        } else {
            res.sendRedirect("index.jsp");
        }
    }

}
