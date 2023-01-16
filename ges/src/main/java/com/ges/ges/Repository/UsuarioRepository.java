package com.ges.ges.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ges.ges.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer>{

    List<UsuarioModel> findAll();

    UsuarioModel findByLogin(String login);

}
