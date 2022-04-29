package edu.ilp.jatoccsa.service.impl;

import edu.ilp.jatoccsa.dao.IPersonaDao;
import edu.ilp.jatoccsa.entity.Persona;
import edu.ilp.jatoccsa.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {

    //inyeccion de dependencia
    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listarPersona() {
        return this.personaDao.findAll();
    }

}
