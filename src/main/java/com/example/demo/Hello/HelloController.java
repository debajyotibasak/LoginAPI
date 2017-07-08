package com.example.demo.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Any time your are building a REST Controller annotate the following.
@RestController
public class HelloController {

    //This annotation is used for mapping HTTP requests.
    /*@RequestMapping maps only GET method by default. To map other HTTP methods specify it in annotations*/
    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }
}

