package dio.my_firt_web_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to my Spring Boot Web Api";
    }
}
