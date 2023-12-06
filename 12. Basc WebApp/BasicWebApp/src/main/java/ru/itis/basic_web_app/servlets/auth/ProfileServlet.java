package ru.itis.basic_web_app.servlets.auth;

import ru.itis.basic_web_app.dto.UserDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if(session.getAttribute("user") == null) {
            resp.sendRedirect("sign-in");
            return;
        }
        UserDto user = (UserDto) session.getAttribute("user");
        req.setAttribute("user", user);
        req.getRequestDispatcher("profile.jsp").forward(req, resp);
    }
}
