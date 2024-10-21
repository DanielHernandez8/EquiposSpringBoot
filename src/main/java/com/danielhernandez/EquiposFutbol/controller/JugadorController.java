package com.danielhernandez.EquiposFutbol.controller;

import com.danielhernandez.EquiposFutbol.entities.Jugador;
import com.danielhernandez.EquiposFutbol.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/jugadores")
public class JugadorController {
    @Autowired
    private JugadorRepository jugadorRepository;

    @GetMapping()
    public List<Jugador> selectJugador() {
        List<Jugador> jugadores = jugadorRepository.findAll();
        return jugadores;
    }


}
