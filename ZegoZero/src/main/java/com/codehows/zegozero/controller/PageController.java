package com.codehows.zegozero.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class PageController {

    @GetMapping("/main")
    public String main(){
        return "main";
    }

    @GetMapping("/plan")
    public String plan(){ return "plan"; }

}
