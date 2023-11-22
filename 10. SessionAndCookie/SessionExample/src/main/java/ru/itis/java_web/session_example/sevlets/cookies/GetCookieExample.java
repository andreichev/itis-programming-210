package ru.itis.java_web.session_example.sevlets.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

@WebServlet("/get-cookie")
public class GetCookieExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = Optional.ofNullable(req.getCookies()).orElse(new Cookie[] {});
        Optional<Cookie> token = Arrays.stream(cookies)
                .filter(item -> item.getName().equals("TOKEN"))
                .findAny();
        if(token.isPresent()) {
            resp.getWriter().println(token.get().getValue());
        } else {
            resp.getWriter().println("NO COOKIE");
        }
    }
}
