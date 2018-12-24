package com.ayv.cargoods.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/index")
public class TestController {

    @GetMapping
    public String getTestPage() {
        return "index";
    }
}
