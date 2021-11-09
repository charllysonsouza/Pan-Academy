package com.springmongodb.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongodb.mongodb.model.Medico;
import com.springmongodb.mongodb.repository.MedicoRepository;

@Service
public class MedicoService {
	
	@Autowired
	MedicoRepository medicoRepository;
	
	public List<Medico> getAll(){
		return this.medicoRepository.findAll();
	}
	
	public Medico getById(String id) {
		return medicoRepository
				.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Medico inexistente!"));
	}
	
	public Medico create(Medico medico) {
		return medicoRepository.save(medico);
	}
}