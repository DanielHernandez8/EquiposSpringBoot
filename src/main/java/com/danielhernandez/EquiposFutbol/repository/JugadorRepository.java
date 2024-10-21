package com.danielhernandez.EquiposFutbol.repository;

import com.danielhernandez.EquiposFutbol.entities.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador,Integer> {
//    @Query("Select j from Jugador j")
//    List<Jugador> findAll();
}
