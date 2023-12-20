package ru.itis.auth_example.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/sign-in.ftl").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // System.out.println(req.getHeader("Content-Type"));
        // BufferedReader reader = req.getReader();
        // String line;
        // while ((line = reader.readLine()) != null) {
        //     System.out.println(line);
        // }
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if(password.equals("123123")) {
            resp.sendRedirect("profile");
        } else {
            req.setAttribute("errorMessage", "Incorrect password");
            req.getRequestDispatcher("/sign-in.ftl").forward(req, resp);
        }
    }
}
