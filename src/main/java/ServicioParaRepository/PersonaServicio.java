/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioParaRepository;

import com.restAPI.Spring.Boot.y.MySQL.Personas;
import java.util.List;

/**
 *
 * @author Cesar
 */
public interface PersonaServicio {
 List<Personas> getAllPersonas();
     Personas getPersonaById(Integer id);
     boolean addPersona(Personas persona);
     void updatePersona(Personas persona);
     void deletePersona(Integer id);   
}
