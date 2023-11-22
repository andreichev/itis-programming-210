package ru.itis.java_web.session_example.sevlets;

import ru.itis.java_web.session_example.model.User;
import ru.itis.java_web.session_example.repository.UserRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/sign-in")
public class SignInServlet extends HttpServlet {
    private UserRepository userRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        ServletContext servletContext = config.getServletContext();
        userRepository = (UserRepository) servletContext.getAttribute("userRepository");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/sign-in.ftl").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Optional<User> optionalUser = userRepository.getByUsername(username);
        if(optionalUser.isEmpty()) {
            req.setAttribute("errorMessage", "User not found");
            req.getRequestDispatcher("/sign-in.ftl").forward(req, resp);
            return;
        }
        User user = optionalUser.get();
        if(password.equals(user.getPassword())) {
            HttpSession session = req.getSession(true);
            session.setAttribute("user", user);
            resp.sendRedirect("profile");
        } else {
            req.setAttribute("errorMessage", "Incorrect password");
            req.getRequestDispatcher("/sign-in.ftl").forward(req, resp);
        }
    }
}
