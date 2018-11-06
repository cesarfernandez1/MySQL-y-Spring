/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restAPI.Spring.Boot.y.MySQL.Repositorio;

import com.restAPI.Spring.Boot.y.MySQL.Personas;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Cesar
 */
// CRUD refers Create, Read, Update, DeletE
//DAO
@Transactional
@Repository
public interface PersonaRepository extends CrudRepository<Personas, Serializable> {

}
