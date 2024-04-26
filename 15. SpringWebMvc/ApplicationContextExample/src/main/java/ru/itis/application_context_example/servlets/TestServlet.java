package ru.itis.application_context_example.servlets;

import org.springframework.context.ApplicationContext;
import ru.itis.application_context_example.services.A;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/test")
public class TestServlet extends HttpServlet {
    private A a;

    @Override
    public void init(ServletConfig config) throws ServletException {
        ServletContext context = config.getServletContext();
        ApplicationContext applicationContext = (ApplicationContext) context.getAttribute("app");
        a = applicationContext.getBean(A.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(a.getMessage());
    }
}
