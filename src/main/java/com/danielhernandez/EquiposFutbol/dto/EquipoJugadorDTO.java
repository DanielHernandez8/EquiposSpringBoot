package com.danielhernandez.EquiposFutbol.dto;

import com.danielhernandez.EquiposFutbol.entities.Equipo;
import com.danielhernandez.EquiposFutbol.entities.Jugador;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class EquipoJugadorDTO {
    List<Jugador> jugadores;
    Equipo equipo;

    public EquipoJugadorDTO(Equipo infoEquipo, List<Jugador> jugadores) {
        this.equipo=infoEquipo;
        this.jugadores=jugadores;
    }
}
