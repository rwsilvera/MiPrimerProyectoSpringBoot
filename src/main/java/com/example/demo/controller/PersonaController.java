package com.example.demo.controller;

import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    PersonaService personaService;
    @GetMapping("/findAllPersona")
    public List<Persona> findAllPersona (){
       return personaService.findAllPersona();
    }
    @PostMapping("/savePersona")
    public Persona savePersona (@RequestBody Persona persona){
        return personaService.savePersona(persona);
    }
    @PutMapping("/updatePersona/{id}")
    public Persona updatePersona(@PathVariable Long id, @RequestBody Persona persona){
        return personaService.updatePersona(id, persona);

    }
    @DeleteMapping("/deletePersona/{id}")
    public String deletePersona(@PathVariable Long id){
        personaService.deletePersona(id);

        return "Borrado Correctamente";
    }




}
