package edu.ilp.jatoccsa.dao;

import edu.ilp.jatoccsa.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {

    @Query("SELECT e FROM Estudiante e WHERE e.codigo= ?1")
    Estudiante obtenerEstudiantePorCodigo(String codigo);


}
