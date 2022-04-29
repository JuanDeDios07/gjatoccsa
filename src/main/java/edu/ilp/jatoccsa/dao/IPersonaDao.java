package edu.ilp.jatoccsa.dao;

import edu.ilp.jatoccsa.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IPersonaDao extends JpaRepository<Persona,Long> {
    @Query("SELECT p FROM Profesor p WHERE p.telefono = ?1")
    Persona obtenerPersonaPorTelefono(String telefono);
}
