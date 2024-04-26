package ru.itis.bootsandbox.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.itis.bootsandbox.dto.UserDto;

@Controller
public class DefaultController {
    @RequestMapping(value = "/check", method = RequestMethod.GET)
    @ResponseBody
    String checkSession(HttpSession session) {
        return (String) session.getAttribute("MESSAGE");
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    String test(HttpSession session) {
        session.setAttribute("MESSAGE", "IT WORKS!");
        return "HELLO, WOLRD!";
    }
}
