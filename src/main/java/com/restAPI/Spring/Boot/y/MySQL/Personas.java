/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restAPI.Spring.Boot.y.MySQL;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author Cesar
 */

@Entity
@Table (name="personas")
@EntityListeners(AuditingEntityListener.class)
public class Personas implements Serializable{
    @Column(name="id")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="legajo")
    private Long legajo;

    public Personas(String nombre, String apellido, Long legajo,Integer id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.id=id;
    }

    public Personas() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Long getLegajo() {
        return legajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setLegajo(Long legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", legajo=" + legajo + '}';
    }

   
    
}
