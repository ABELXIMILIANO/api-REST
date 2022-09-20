package com.example.persona.repositoires;

import com.example.persona.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {  // en definitiva este es una dao que es la que se comunica con la base de datos

}
