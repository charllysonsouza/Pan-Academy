package com.springmongodb.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springmongodb.mongodb.model.Paciente;
import com.springmongodb.mongodb.service.PacienteService;

public class PacienteController {
	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping
	public List<Paciente> getAll(){
		return pacienteService.getAll();
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Paciente> getById(@PathVariable String id){
		Paciente obj = pacienteService.getById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public Paciente create(@RequestBody Paciente paciente) {
		return pacienteService.create(paciente);
	}
}
