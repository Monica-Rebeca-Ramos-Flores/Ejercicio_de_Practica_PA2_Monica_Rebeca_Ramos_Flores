/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.servicios;

import com.example.demo.modelos.Persona;
import com.example.demo.repositorios.PersonaRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class PersonaServicio {
    @Autowired
    private PersonaRepositorio repositorio;
    
    public Persona guardar(Persona entidad){
        return repositorio.save(entidad);
    }
    
    public void eliminar(Long id){
        repositorio.deleteById(id);
    }
    
    public Optional<Persona> getValor(Long id){
        return repositorio.findById(id);
    }
    
    public List<Persona> getTodos(){
        return (List<Persona>)repositorio.findAll();
    }
}

