package com.example.myspringbootapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FIXME: Add Doc
 *
 * @author Duc Ngo (ducngo@kms-technology.com)
 * @since 10-May-23
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }
}
