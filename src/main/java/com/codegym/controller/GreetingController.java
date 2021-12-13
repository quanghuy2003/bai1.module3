package com.codegym.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class GreetingController {
//    @GetMapping("/")
//    public String greeting() {
//        return "index";
//    }
    @GetMapping ("/edit")
    public String showeditform(Model model , @RequestParam String address){
        model.addAttribute("name" , "ánh 2p" + address);
        return "edit";
    }
//    @GetMapping ("/tong")
//    public String tong (Model model, @RequestParam int a, int b) {
//        model.addAttribute("tong", a + b);
//        return "index";
//    }

    @GetMapping("/convert")
    public String doitien (Model model){
        return "index";
    }
    @PostMapping("/convert")
    public String doitien1 (Model model,@RequestParam double a){
        model.addAttribute("tinh",a*23000);
        return "index";
    }
}
