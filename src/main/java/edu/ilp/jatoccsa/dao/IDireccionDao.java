package edu.ilp.jatoccsa.dao;

import edu.ilp.jatoccsa.entity.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IDireccionDao extends JpaRepository<Direccion,Long> {
    @Query("SELECT d FROM Direccion d WHERE d.ciudad = ?1")
    Direccion obtenerDireccionPorCiudad(String ciudad);
}
