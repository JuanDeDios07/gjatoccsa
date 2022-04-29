package edu.ilp.jatoccsa.controller;

import edu.ilp.jatoccsa.entity.Direccion;
import edu.ilp.jatoccsa.entity.Estudiante;
import edu.ilp.jatoccsa.entity.Persona;
import edu.ilp.jatoccsa.service.IDireccionSrevice;
import edu.ilp.jatoccsa.service.IEstudianteService;
import edu.ilp.jatoccsa.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("login")
public class PruevaController {

    //LISTAR ESTUDIANTE
    @Autowired
    private IEstudianteService estudianteService;
    // LISTA DE LA BASE DE DATOS
    @GetMapping("/listaEstudiante")
    public List<Estudiante> listaEstudiante(){

        return this.estudianteService.listarEstudiante();
    }

    //LISTAR PERSONA
    @Autowired
    private IPersonaService personaService;
    // LISTA DE LA BASE DE DATOS
    @GetMapping("/listaPersona")
    public List<Persona> listaPersona(){

        return this.personaService.listarPersona();
    }
    // METODO DE BUSCAR ESTUDIANTE
    @GetMapping("/buscarEstudianteByCodigo")
    public Estudiante buscarEstudianteByCodigo(@RequestParam String codigo){
        return this.estudianteService.obtenerEstudiantePorCodigos(codigo);

    }

    //Obtener la dirección
    @Autowired
    private IDireccionSrevice direccionSrevice;
    // LISTA DE LA BASE DE DATOS
    @GetMapping("/listaDireccion")
    public List<Direccion> listaDireccion(){

        return this.direccionSrevice.listarDireccion();
    }
}
