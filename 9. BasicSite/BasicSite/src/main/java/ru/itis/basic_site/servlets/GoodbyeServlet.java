package ru.itis.basic_site.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoodbyeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Сервлет Goodbye");
        resp.getWriter().println(req.getAttribute("Message"));
        resp.getWriter().println("123123");
    }
}
