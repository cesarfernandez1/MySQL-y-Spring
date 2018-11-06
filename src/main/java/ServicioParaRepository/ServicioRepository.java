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
public class ServicioRepository {
    @Autowired
    private PersonaRepository personaRepository;

    public void add(Personas persona){
        this.personaRepository.save(persona);
    }
  
    public List<Personas> getAll(){
        return (List<Personas>) this.personaRepository.findAll();
               
    }

    public void deleteById(Integer id){
        this.personaRepository.deleteById(id);
    }  
     public void findById(Integer id){
        this.personaRepository.findById(id);
    }  
}
