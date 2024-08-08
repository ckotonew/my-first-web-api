package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Classe com recursos RestController
public class WelcomeController {
    @GetMapping //Método que irá receber o serviço http get
    public String welcome(){
        return "Welcome to My Spring Boot Web API";
    }
}
