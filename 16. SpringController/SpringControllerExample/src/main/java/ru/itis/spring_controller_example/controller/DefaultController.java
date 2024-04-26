package ru.itis.spring_controller_example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    String func() {
        return "HELLO, WORLD!";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String test(Model model) {
        model.addAttribute("message", "HELLO, WORLD!");
        return "index";
    }
}
