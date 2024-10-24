package com.danielhernandez.EquiposFutbol.repository;

import com.danielhernandez.EquiposFutbol.entities.Equipo;
import com.danielhernandez.EquiposFutbol.entities.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo,Integer> {
    Equipo findEquipoByEquipoCod(Integer equipoCod);
}
