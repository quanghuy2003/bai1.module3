package com.codegym.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller

public class GreetingController {
    @GetMapping("/")
    public String greeting() {
        return "index";
    }
    @GetMapping ("/edit")
    public String showeditform(Model model , @RequestParam String address){
        model.addAttribute("name" , "ánh 2p" + address);
        return "edit";
    }
    @GetMapping ("/tong")
    public String tong (Model model, @RequestParam int a, int b) {
        model.addAttribute("tong", a + b);
        return "index";
    }

    @GetMapping("/convert")
    public String doitien (Model model){
        return "index";
    }
    @PostMapping("/convert")
    public String doitien1 (Model model,@RequestParam double a){
        model.addAttribute("tinh",a*23000);
        return "index";
    }


    @GetMapping("dictionary")
    public String showDictionary(){
        return "dictionary";
    }
    @PostMapping ("/dictionary")
    public String tudien (Model model ,@RequestParam String key){
        Map<String ,String> stringMap=new HashMap<>();
        int a=0;
        stringMap.put("hello","chào cu");
        stringMap.put("cat","mồn lèo");
        stringMap.put("dog", "con chó");
        for (int i = 0; i < stringMap.size(); i++) {
            if(stringMap.containsKey(key)){
                model.addAttribute("result",stringMap.get(key));
                a=1;
            }

        }
        if(a==0){
            model.addAttribute("result","can not find");
        }

        return "dictionary";
    }
}
