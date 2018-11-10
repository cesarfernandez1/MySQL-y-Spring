/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restAPI.Spring.Boot.y.MySQL.Repositorio;

import com.restAPI.Spring.Boot.y.MySQL.Personas;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Cesar
 */
// CRUD refers Create, Read, Update, DeletE
//DAO
@Repository ("personaRepository")
public interface PersonaRepository extends JpaRepository<Personas, Serializable> {

    //para llamar a la bases de datos. Representa la configuración para acceder a la base de datos
    /*@PersistenceContext	
    private EntityManager entityManager;

    @Override
	public Personas getPersonaById(Integer id) {
		return entityManager.find(Personas.class, id);
	}

	
        //sirve para 
	@SuppressWarnings("unchecked")
        //sirve para modificar le comportamiento original de esta clase heredada, sobreescribir la clase paddre 
	@Override
	public List<Personas> getAllPersonas() {
		String hql = "FROM Personas as persona ORDER BY persona.id";
		return (List<Personas>) entityManager.createQuery(hql).getResultList();
	}
	@Override
	public void addPersona(Personas persona) {
		entityManager.persist(persona);
	}
	@Override
	public void updatePersona(Personas persona) {
		Personas personaUpdate = getPersonaById(persona.getId());
		personaUpdate.setNombre(persona.getNombre());
		entityManager.flush();
	}
	@Override
	public void deletePersona(Integer id) {
		entityManager.remove(getPersonaById(id));
	}

    
        @Override
    public boolean personaExists(Integer id, String nombre){
		String hql = "FROM Personas as persona WHERE personas.nombre = ? and personas.id= ?";
		int count = entityManager.createQuery(hql).setParameter(1,id)
				.setParameter(2,nombre).getResultList().size();
		if (count >0 ){
			return true;
		}else{
			return false;

		}

	}*/
}
