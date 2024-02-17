package com.example.demo.service;

import com.example.demo.entity.Persona;
import com.example.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
   @Autowired
    PersonaRepository personaRepository;
    @Override
    public List<Persona> findAllPersona() {
        return personaRepository.findAll();
    }
}
