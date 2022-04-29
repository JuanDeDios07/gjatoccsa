package edu.ilp.jatoccsa.dao;

import edu.ilp.jatoccsa.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IProfesorDao extends JpaRepository<Profesor,Long> {
    @Query("SELECT p FROM Profesor p WHERE p.salario = ?1")
    Profesor obtenerProfesorPorSalario(String salario);
}
