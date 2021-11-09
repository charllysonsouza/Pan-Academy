package com.springmongodb.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springmongodb.mongodb.model.Paciente;

@Repository
public interface PacienteRepository extends MongoRepository<Paciente, String>{

}
