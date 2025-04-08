package com.example.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class testController {

    @GetMapping("/hi")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello World");
    }
}
