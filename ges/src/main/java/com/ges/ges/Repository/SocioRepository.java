package com.ges.ges.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ges.ges.models.SocioModel;

@Repository
public interface SocioRepository extends CrudRepository<SocioModel, Integer>{

    Optional<SocioModel> findById(Integer id);

}
