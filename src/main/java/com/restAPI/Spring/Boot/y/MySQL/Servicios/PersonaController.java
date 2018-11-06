/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restAPI.Spring.Boot.y.MySQL.Servicios;

import ServicioParaRepository.ServicioRepository;
import com.restAPI.Spring.Boot.y.MySQL.Personas;

//Sirve para 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


//Sirver para 

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cesar
 */
@RestController
@RequestMapping("/api")
public class PersonaController {

    @Autowired
    private ServicioRepository servicioRepository;

    @GetMapping("/traertodoslosdatos")
    public List<Personas> getPersonas() {
        List<Personas> list =servicioRepository.getAll();
        return list;

    }
    //Valor unico 
//Corregir   

    @GetMapping("/traerdatos/{id}")
    public String getPersonasById(@PathVariable ("id")Integer id) {
       servicioRepository.findById(id);
        return "Persona encontrada";
        
    }
    @PostMapping("/agregardatos")
    public Personas savePersonas(@RequestBody Personas persona) {
        persona = new Personas();
        servicioRepository.add(persona);
        return persona;

    }

    @PutMapping("/modificardatos/{id}")
    public Personas modificarDatos(@PathVariable(value = "id") Integer id, @RequestBody Personas persona) {
        servicioRepository.add(persona);
        return persona;

    }

    @DeleteMapping("/borrardatos/{id}")
    public String borrarDatos(@RequestParam(value = "id") Integer id) {
        servicioRepository.deleteById(id);
        return "ok";
    }
}
