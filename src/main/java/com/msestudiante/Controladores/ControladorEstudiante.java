package com.msestudiante.Controladores;

import com.msestudiante.Entidades.ApEstudiante;
import com.msestudiante.Repositorios.RepositorioEstudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author root
 */
@RestController
@RequestMapping("estudiante")
@EnableJpaRepositories(basePackages = "com.msestudiante.Repositorios")
public class ControladorEstudiante {
    
    @Autowired
    RepositorioEstudiante Estudiantes;

    @RequestMapping(
            value = "/all",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public List<ApEstudiante> getAll(){
        List<ApEstudiante> result = (List<ApEstudiante>) Estudiantes.findAll();
        return result;
    }

    @RequestMapping(
            value = "/crearestudiante",
            method = RequestMethod.POST,
            produces = "application/json"
    )
    public ApEstudiante create(@RequestBody ApEstudiante Estudiante){
        try {
            Estudiante = Estudiantes.save(Estudiante);
            return Estudiante;
        }catch (Exception ex ){
            return null;
        }
    }
    
}
