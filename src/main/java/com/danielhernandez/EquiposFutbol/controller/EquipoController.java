package com.danielhernandez.EquiposFutbol.controller;


import com.danielhernandez.EquiposFutbol.entities.Equipo;
import com.danielhernandez.EquiposFutbol.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/equipos")
public class EquipoController {
@Autowired
private EquipoRepository equipoRepository;
    @GetMapping()
    public List<Equipo> selectEquipo() {
        List<Equipo> equipos = equipoRepository.findAll();
        return equipos;
    }


}
