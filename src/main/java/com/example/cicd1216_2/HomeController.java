package com.example.cicd1216_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hicicd")
    public String hicicd() {


        return "hicicd1216~~";
    }
}
