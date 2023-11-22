package ru.itis.java_web.session_example.sevlets.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/set-cookie")
public class SetCookieExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("TOKEN", "SLDKFKL#$()@)_(IFDJJ(_SDF");
        cookie.setMaxAge(2 * 60);
        resp.addCookie(cookie);
    }
}
