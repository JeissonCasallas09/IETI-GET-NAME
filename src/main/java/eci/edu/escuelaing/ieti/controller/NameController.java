package eci.edu.escuelaing.ieti.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/app")
class NameController {


    @GetMapping("/name")
    public String getName() {
        return "Hola Mi nombre es Jeisson Steban Casallas Rozo!";
    }

}