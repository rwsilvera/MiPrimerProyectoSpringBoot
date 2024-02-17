package com.example.demo.controller;

import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    PersonaService personaService;
    @GetMapping("/findAllPersona")
    public List<Persona> findAllPersona (){
       return personaService.findAllPersona();
    }
}
