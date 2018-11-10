/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioParaRepository;

import PersonaDao.PersonaDao;
import com.restAPI.Spring.Boot.y.MySQL.Personas;
import com.restAPI.Spring.Boot.y.MySQL.Repositorio.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cesar
 */
@Service ("personaImpServicio")
public class PersonaImpServicio implements PersonaDao{
    @Autowired
    @Qualifier("personaRepository")
    private PersonaRepository personaRepository;
    
    @Override
    public Personas getPersonaById(Integer id) {
        Personas obj = personaRepository.getOne(id);
        if (obj == null) {
            return null;
        }
        return obj;
    }


    @Override
    public List<Personas> getAllPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public synchronized boolean addPersona(Personas persona) {
        if (personaRepository.existsById(persona.getId())) {
            return false;
        } else {
            personaRepository.save(persona);
            return true;
        }
    }

    @Override
    public void updatePersona(Personas persona) {
        personaRepository.save(persona);
    }

    @Override
    public boolean deletePersona(Integer id) {
        personaRepository.deleteById(id);    
    return true;
    }
    }
