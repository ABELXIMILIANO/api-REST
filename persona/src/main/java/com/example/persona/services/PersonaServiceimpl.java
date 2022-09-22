package com.example.persona.services;

import com.example.persona.entities.Persona;
import com.example.persona.repositoires.BaseRepository;
import com.example.persona.repositoires.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceimpl extends BaseServiceImpl<Persona,Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;


    public PersonaServiceimpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }
}
