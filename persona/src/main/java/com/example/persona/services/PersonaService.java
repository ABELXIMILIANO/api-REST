package com.example.persona.services;

import com.example.persona.entities.Persona;
import com.example.persona.repositoires.PersonaRepository;
import com.example.persona.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements BaseService<Persona> {

    //@Autowired : cumple la misma funcion que el constructor PersonaService
    private PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    @Transactional // PARA PODER COMUNICARME CON LA BASE DE DATOS
    public List<Persona> findAll() throws Exception {
        try{
            List<Persona>entities= personaRepository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona findById(Long id) throws Exception {
        try{
            Optional<Persona>entityOptional=personaRepository.findById(id);
            return  entityOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Persona save(Persona entity) throws Exception {
        try{
            entity=personaRepository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona update(Long id, Persona entity) throws Exception {
        try{
            Optional<Persona>entityOptional = personaRepository.findById(id);
            Persona persona = entityOptional.get();
            persona = personaRepository.save(entity);
            return persona;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try{
            if(personaRepository.existsById(id)){
                personaRepository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
