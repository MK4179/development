package io.javabrains.springbootstarter;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ErrorHandling {
    
    @GetMapping("/error")
    public String requestMethodName() {
        return null;
    }
    
}