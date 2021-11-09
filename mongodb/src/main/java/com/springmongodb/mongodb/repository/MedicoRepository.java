package com.springmongodb.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springmongodb.mongodb.model.Medico;

@Repository
public interface MedicoRepository extends MongoRepository<Medico, String> {
	
}
