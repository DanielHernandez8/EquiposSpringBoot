package com.danielhernandez.EquiposFutbol.repository;

import com.danielhernandez.EquiposFutbol.entities.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface JugadorRepository extends JpaRepository<Jugador,Integer> {
    List<Jugador> findAllByEquipoCod(Integer equipoCod);

}
