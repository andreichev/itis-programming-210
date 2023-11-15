package ru.itis.basic_site.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Запрос выполняется");
        req.setAttribute("Message", "How are you?");
        req.getRequestDispatcher("/hello.ftl").forward(req, resp);
    }
}
