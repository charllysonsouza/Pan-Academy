package com.springmongodb.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongodb.mongodb.model.Consulta;
import com.springmongodb.mongodb.repository.ConsultaRepository;

@Service
public class ConsultaService {
	
	@Autowired
	ConsultaRepository consultaRepository;
	
	
	public List<Consulta> getAll(){
		return this.consultaRepository.findAll();
	}
	
	public Consulta getById(String id) {
		return consultaRepository
				.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Consulta inexistente!"));
	}
	
	public Consulta create(Consulta consulta) {
		return consultaRepository.save(consulta);
	}
}
