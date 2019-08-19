package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage (Model model) {
        model.addAttribute("myvar", "type in localhost:8084/loadform to be redirected to login page.");
        return "hometemplate";
    }

    @RequestMapping("/loadform")
    public String loadFormPage(){
        return "formtemplate";
    }
    @RequestMapping("/processform")
    public String loadFromPage(@RequestParam("login") String login, Model model){
        model.addAttribute("loginval",login);
        return "confirm";
    }
}
