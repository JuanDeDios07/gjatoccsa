package edu.ilp.jatoccsa.service.impl;

import edu.ilp.jatoccsa.dao.IEstudianteDao;
import edu.ilp.jatoccsa.entity.Estudiante;
import edu.ilp.jatoccsa.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EstudianteServiceImpl implements IEstudianteService {
    //inyeccion de dependencia
    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public List<Estudiante> listarEstudiante() {
        return this.estudianteDao.findAll();
    }
    @Override
    public  Estudiante obtenerEstudiantePorCodigos(String codigo){
        return  this.estudianteDao.obtenerEstudiantePorCodigo(codigo);
    }

}
