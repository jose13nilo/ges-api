package com.ges.ges.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ges.ges.Repository.UsuarioRepository;
import com.ges.ges.models.LoginModelDTO;
import com.ges.ges.models.UsuarioModel;

@RequestMapping("/api/usuario")
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository _usuarioRepository;

    @PostMapping("/logar")
    public Boolean logar( @RequestBody LoginModelDTO login){

        UsuarioModel usuario = _usuarioRepository.findByLogin(login.getLogin());

        if(usuario == null){
            return false;
        }

        if(usuario.getSenha().equals(login.getSenha())){
            return true;
        }

        return false;
        
    }
}
