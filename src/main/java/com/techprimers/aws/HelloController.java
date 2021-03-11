package com.techprimers.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello easy boss class on wednesday 2021 march";
    }
}
