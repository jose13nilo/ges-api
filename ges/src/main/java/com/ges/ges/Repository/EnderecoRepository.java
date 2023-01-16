package com.ges.ges.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ges.ges.models.EnderecoModel;

@Repository
public interface EnderecoRepository extends CrudRepository<EnderecoModel, Integer>{

    List<EnderecoModel> findAll();

    EnderecoModel save(EnderecoModel endereco);

}
