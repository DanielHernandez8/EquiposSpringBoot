package com.danielhernandez.EquiposFutbol.repository;

import com.danielhernandez.EquiposFutbol.entities.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<Equipo,Integer> {
}
