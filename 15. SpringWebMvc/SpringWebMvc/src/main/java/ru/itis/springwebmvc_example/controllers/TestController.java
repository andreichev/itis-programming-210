package ru.itis.springwebmvc_example.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.itis.springwebmvc_example.services.A;

@Controller
@RequiredArgsConstructor
public class TestController {
    private final A a;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    String getMessage() {
        return a.getMessage();
    }

    @RequestMapping(value = "/abc", method = RequestMethod.GET)
    @ResponseBody
    String getAltMessage() {
        return "GOODBYE";
    }
}
