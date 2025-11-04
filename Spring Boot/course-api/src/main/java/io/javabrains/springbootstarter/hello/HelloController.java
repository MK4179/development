package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String requestMethodName() {
        return "Prajakta is my Lovely Wife !!!";
    }
    
}
