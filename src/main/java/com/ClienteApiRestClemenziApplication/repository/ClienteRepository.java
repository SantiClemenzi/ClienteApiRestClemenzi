package com.ClienteApiRestClemenziApplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ClienteApiRestClemenziApplication.model.ClienteModel;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteModel, Long> {

}
