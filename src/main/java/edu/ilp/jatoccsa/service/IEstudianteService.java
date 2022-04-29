package edu.ilp.jatoccsa.service;


import edu.ilp.jatoccsa.entity.Estudiante;

import java.util.List;

public interface IEstudianteService {

    //listar todas las Estudiante
    List<Estudiante> listarEstudiante();

//Obtener estudiante por su codigo

    Estudiante obtenerEstudiantePorCodigos(String codigo);

}
