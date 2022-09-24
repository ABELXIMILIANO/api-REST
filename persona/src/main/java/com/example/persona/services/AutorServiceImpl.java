package com.example.persona.services;

import com.example.persona.entities.Autor;
import com.example.persona.entities.Base;
import com.example.persona.repositoires.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.io.Serializable;
@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }


}
