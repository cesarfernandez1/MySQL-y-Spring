/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import PersonaDao.PersonaDao;
import com.restAPI.Spring.Boot.y.MySQL.Personas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cesar
 */
@RestController
public class PersonaController {

    @Autowired
    @Qualifier("personaRepository")
    private PersonaDao personaDaoServicio;

    @GetMapping(path="/traertodoslosdatos")
    public ResponseEntity<List<Personas>> getAllPersonas() {
        List<Personas> list = personaDaoServicio.getAllPersonas();
        if (list.size() == 0) {
            return new ResponseEntity<List<Personas>>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<List<Personas>>(list, HttpStatus.OK);

    }

    @GetMapping(path="/traerdatos/{id}")
    public ResponseEntity<Personas> getPersonasById(@PathVariable("id") Integer id) {
        Personas persona = personaDaoServicio.getPersonaById(id);
        return new ResponseEntity<Personas>(persona, HttpStatus.OK);

    }

    @PostMapping(path="/agregardatos")
    public ResponseEntity<Void> addPersonas(@RequestBody Personas persona) {
        personaDaoServicio.addPersona(persona);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @PutMapping(path="/modificardatos/{id}")
    public ResponseEntity<Personas> updatePersona(@RequestBody Personas persona) {
        Personas perUpdate = personaDaoServicio.getPersonaById(persona.getId());
        perUpdate.setNombre(persona.getNombre());
        personaDaoServicio.updatePersona(perUpdate);
        return new ResponseEntity<Personas>(perUpdate, HttpStatus.OK);
    }

    @DeleteMapping(path="/borrardatos/{id}")
    public ResponseEntity<Void> deletePersona(@PathVariable("id") Integer id) throws Exception {
        personaDaoServicio.deletePersona(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
