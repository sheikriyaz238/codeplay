package com.codeplay.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/")
@CrossOrigin
public class MainController {
    @GetMapping(path="/greet/")
    public String greet(){
        return "Hey There";
    }

}