package com.ges.ges.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ges.ges.models.EmpresaModel;

@Repository
public interface EmpresaRepository extends CrudRepository<EmpresaModel, Integer>{

    @Query("from EmpresaModel where foiDeletada is null")
    List<EmpresaModel> findAll();

}
