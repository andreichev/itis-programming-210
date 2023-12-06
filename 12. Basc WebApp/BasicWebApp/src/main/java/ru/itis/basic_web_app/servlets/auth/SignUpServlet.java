package ru.itis.basic_web_app.servlets.auth;

import ru.itis.basic_web_app.dto.SignUpForm;
import ru.itis.basic_web_app.dto.UserDto;
import ru.itis.basic_web_app.exceptions.AuthException;
import ru.itis.basic_web_app.service.AuthService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/sign-up")
public class SignUpServlet extends HttpServlet {
    private AuthService authService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        ServletContext servletContext = config.getServletContext();
        authService = (AuthService) servletContext.getAttribute("authService");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if(session.getAttribute("user") != null) {
            resp.sendRedirect("profile");
            return;
        }
        req.setAttribute("errorMessage", "");
        req.getRequestDispatcher("sign-up.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if(session.getAttribute("user") != null) {
            resp.sendRedirect("profile");
            return;
        }
        SignUpForm form = SignUpForm.builder()
                .username(req.getParameter("username"))
                .password(req.getParameter("password"))
                .courseName(req.getParameter("courseName"))
                .email(req.getParameter("email"))
                .build();
        UserDto user;
        try {
            user = authService.signUp(form);
        } catch (AuthException e) {
            req.setAttribute("errorMessage", e.getMessage());
            req.getRequestDispatcher("sign-up.jsp").forward(req, resp);
            return;
        }
        session.setAttribute("user", user);
        resp.sendRedirect("profile");
    }
}