package com.example.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        if (userName.equals("Sanjay") && password.equals("admin")) {
            HttpSession session = req.getSession(true);
            session.setAttribute("userName", userName);
            req.getRequestDispatcher("home.jsp").forward(req, res);
        } else {
            req.setAttribute("error", "Please enter valid username and password");
            req.getRequestDispatcher("index.jsp").forward(req, res);
        }
    }

}
