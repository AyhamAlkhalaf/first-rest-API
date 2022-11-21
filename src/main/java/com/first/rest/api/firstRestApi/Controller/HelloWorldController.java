package com.first.rest.api.firstRestApi.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //Get HTTP Method
    //http://localhost:8081/hello-world
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

}
