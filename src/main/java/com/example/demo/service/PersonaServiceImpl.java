package com.example.demo.service;

import com.example.demo.entity.Persona;
import com.example.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PersonaServiceImpl implements PersonaService {
   @Autowired
    PersonaRepository personaRepository;
    @Override
    public List<Persona> findAllPersona() {
        return personaRepository.findAll();
    }
    public Persona savePersona(Persona persona){
        return personaRepository.save(persona);
    }

    @Override
    public Persona updatePersona(Long id, Persona persona) {
        Persona personaUpdate = personaRepository.findById(id).get();
        personaUpdate.setCedula(persona.getCedula());
        personaUpdate.setNombre(persona.getNombre());
        personaUpdate.setApellido(persona.getApellido());
        personaUpdate.setSexo(persona.getSexo());
        personaUpdate.setCelular(persona.getCelular());
        personaUpdate.setDireccion(persona.getDireccion());
        personaUpdate.setFechaNacimiento(persona.getFechaNacimiento());



    return personaRepository.save(personaUpdate);
    }

    @Override
    public void deletePersona(Long id) {

        personaRepository.deleteById(id);

    }


}
