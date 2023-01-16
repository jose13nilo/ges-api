package com.ges.ges.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ges.ges.Repository.EnderecoRepository;
import com.ges.ges.models.EnderecoModel;

@RequestMapping("/api/endereco")
@RestController
public class EnderecoController {

    @Autowired
    private EnderecoRepository _enderecoRepository;

    @PostMapping("/save")
    public EnderecoModel save( @RequestBody EnderecoModel endereco){

        return _enderecoRepository.save(endereco);

    }

}
