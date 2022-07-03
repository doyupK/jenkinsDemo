package com.example.jenkinsdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class webController {


    @GetMapping("/user/loginView")
    public String login() {
        return "login";
    }
}
