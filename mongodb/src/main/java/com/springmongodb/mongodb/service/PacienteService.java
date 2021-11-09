package com.springmongodb.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongodb.mongodb.model.Paciente;
import com.springmongodb.mongodb.repository.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	
	public List<Paciente> getAll(){
		return this.pacienteRepository.findAll();
	}
	
	public Paciente getById(String id) {
		return pacienteRepository
				.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Paciente inexistente!"));
	}
	
	public Paciente create(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}
}