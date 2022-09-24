package com.example.persona.services;

import com.example.persona.entities.Persona;
import com.example.persona.repositoires.BaseRepository;
import com.example.persona.repositoires.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceimpl extends BaseServiceImpl<Persona,Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;


    public PersonaServiceimpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }


    @Override
    public List<Persona> search(String filtro) throws Exception {
        try {
            //List<Persona>personas=personaRepository.findByNombreContainingOrApellidoContaining(filtro,filtro);
            // List<Persona>personas= personaRepository.search(filtro);
              List<Persona>personas= personaRepository.searchNativo(filtro);

            return personas;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }

    }
}
