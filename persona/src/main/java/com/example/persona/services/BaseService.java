package com.example.persona.services;

import java.util.List;

public interface BaseService <E>   { // este es el servicio que se va a comunicar con el repositorio
    public List<E> findAll() throws Exception;

    public E findById(Long id) throws Exception;

    public E save(E entity) throws Exception;

    public E update (Long id, E entity) throws Exception;

    public boolean delete(Long id) throws Exception;

}
