/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaDao;

import com.restAPI.Spring.Boot.y.MySQL.Personas;
import java.util.List;
/**
 *
 * @author Cesar
 */

public interface PersonaDao {
    public List<Personas> getAllPersonas();
    public Personas getPersonaById(Integer id);
    boolean addPersona(Personas persona);
    void updatePersona(Personas persona);
    boolean deletePersona(Integer id);
}
