package com.ges.ges.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ges.ges.Repository.SocioRepository;
import com.ges.ges.models.SocioModel;

@RestController
public class SocioController {

    @Autowired
    private SocioRepository _socioRepository;

    @GetMapping("/socio/{id}")
    public ResponseEntity<Optional<SocioModel>> getSocioById( @PathVariable int id ){

        return ResponseEntity.ok(_socioRepository.findById(id));
        
    }
}
