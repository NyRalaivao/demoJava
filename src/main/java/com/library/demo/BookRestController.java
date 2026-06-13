package com.library.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {
    //GET POST PUT PATCH DELETE

    @GetMapping("test")
    public String helloWord() {
        return "Hello World";
    }
}
