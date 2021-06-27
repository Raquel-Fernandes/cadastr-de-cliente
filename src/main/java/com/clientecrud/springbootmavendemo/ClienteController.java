package com.clientecrud.springbootmavendemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClienteController {

    @RequestMapping("/")
    public String cadastrarApp(){

        return "index";
    }
}
