/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioParaRepository;

import com.restAPI.Spring.Boot.y.MySQL.Personas;
import com.restAPI.Spring.Boot.y.MySQL.Repositorio.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cesar
 */
@Service
public class PersonaImpServicio implements PersonaServicio{
    @Autowired
    private PersonaServicio personaservicio;
    @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    public Personas getPersonaById(Integer id) {
        Personas obj = personaRepository.getPersonaById(id);
        if (obj == null) {
            return null;
        }
        return obj;
    }


    @Override
    public List<Personas> getAllPersonas() {
        return personaRepository.getAllPersonas();
    }

    @Override
    public synchronized boolean addPersona(Personas persona) {
        if (personaRepository.personaExists(persona.getId(), persona.getNombre())) {
            return false;
        } else {
            personaRepository.addPersona(persona);
            return true;
        }
    }

    @Override
    public void updatePersona(Personas persona) {
        personaRepository.updatePersona(persona);
    }

    @Override
    public void deletePersona(Integer id) {
        personaRepository.deletePersona(id);
    }
    }
