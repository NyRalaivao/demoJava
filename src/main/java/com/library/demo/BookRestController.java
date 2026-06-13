package com.library.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {
    //GET POST PUT PATCH DELETE
    // Get = Lecture
    // Post = Création
    // Mise à jour
    // Delete = Suppression

    @GetMapping("/book")
    public String get() {
        return "Hello World";
    }
}
