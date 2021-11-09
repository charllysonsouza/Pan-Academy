package com.springmongodb.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springmongodb.mongodb.model.Consulta;

@Repository
public interface ConsultaRepository extends MongoRepository<Consulta, String>{

}
