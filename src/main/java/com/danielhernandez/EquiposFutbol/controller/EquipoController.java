package com.danielhernandez.EquiposFutbol.controller;


import com.danielhernandez.EquiposFutbol.dto.EquipoJugadorDTO;
import com.danielhernandez.EquiposFutbol.entities.Equipo;
import com.danielhernandez.EquiposFutbol.entities.Jugador;
import com.danielhernandez.EquiposFutbol.repository.EquipoRepository;
import com.danielhernandez.EquiposFutbol.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/equipos")
public class EquipoController {
@Autowired
private EquipoRepository equipoRepository;


    @Autowired
    private JugadorRepository jugadorRepository;

    @GetMapping()
    public List<Equipo> selectEquipo() {
        List<Equipo> equipos = equipoRepository.findAll();

        return equipos;
    }

    @GetMapping("/{equipoCod}")
    public EquipoJugadorDTO getEquipo (@PathVariable("equipoCod")Integer equipoCod){
        Equipo infoEquipo = equipoRepository.findEquipoByEquipoCod(equipoCod);
        List<Jugador> jugadores = jugadorRepository.findAllByEquipoCod(equipoCod);
//        EquipoJugadorDTO equipoJugadorDTO = new EquipoJugadorDTO();
//        equipoJugadorDTO.setEquipo(infoEquipo);
//        equipoJugadorDTO.setJugadores(jugadores);
//        return  equipoJugadorDTO;
        return new EquipoJugadorDTO(infoEquipo, jugadores);
    }



}
