package com.example.persona.controllers;


import com.example.persona.entities.Persona;
import com.example.persona.services.PersonaServiceimpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController  extends BaseControllerImpl<Persona, PersonaServiceimpl> {

}
