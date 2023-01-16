package com.ges.ges.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ges.ges.Repository.EmpresaRepository;
import com.ges.ges.models.EmpresaModel;
import com.ges.ges.models.EmpresaModelDTO;

@RequestMapping("/api/empresa")
@RestController
public class EmpresaController {

    @Autowired
    private EmpresaRepository _empresaRepository;

    @GetMapping()
    public EmpresaModelDTO findAll(){

        EmpresaModelDTO empresas =  new EmpresaModelDTO( );

        empresas.setContent(_empresaRepository.findAll());

        return empresas;

    }

    @PostMapping("/save")
    public EmpresaModel save( @RequestBody EmpresaModel empresa){

        return _empresaRepository.save(empresa);

    }
}


