package edu.ilp.jatoccsa.service.impl;

import edu.ilp.jatoccsa.dao.IDireccionDao;
import edu.ilp.jatoccsa.entity.Direccion;
import edu.ilp.jatoccsa.service.IDireccionSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DireccionServiceImpl implements IDireccionSrevice {
    //inyeccion de dependencia
    @Autowired
    private IDireccionDao direccionDao;

    @Override
    public List<Direccion> listarDireccion() {
        return this.direccionDao.findAll();
    }
}
