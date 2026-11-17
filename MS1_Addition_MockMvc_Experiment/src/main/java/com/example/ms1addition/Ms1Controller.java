package com.example.ms1addition;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ms1Controller {

    @GetMapping("/ms1/add")
    public String add(@RequestParam("a") int a, @RequestParam("b") int b) {
        return "MS1.1-Additions =" + (a + b);
    }
}
