/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repositorios;

import com.example.demo.modelos.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface PersonaRepositorio extends CrudRepository<Persona, Long> {
    
}
