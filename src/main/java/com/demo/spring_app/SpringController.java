package com.demo.spring_app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @RequestMapping("/hello")
    public String getDetails(){
        return "Hello World";
    }
}
