package com.example.persona.repositoires;

import com.example.persona.entities.Autor;
import com.example.persona.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService  extends BaseServiceImpl<Autor, Long> {

    @Autowired
    private AutorRepository autorRepository;
    public AutorService(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
