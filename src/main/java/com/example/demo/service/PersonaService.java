package com.example.demo.service;

import com.example.demo.entity.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona>findAllPersona();
    Persona savePersona(Persona persona);
    Persona updatePersona(Long id,Persona persona);
    void deletePersona(Long id);

}
