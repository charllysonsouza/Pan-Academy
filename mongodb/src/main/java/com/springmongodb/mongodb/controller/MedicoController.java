package com.springmongodb.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springmongodb.mongodb.model.Medico;
import com.springmongodb.mongodb.service.MedicoService;

public class MedicoController {
	
	@Autowired
	private MedicoService medicoService;
	
	@GetMapping
	public List<Medico> getAll(){
		return medicoService.getAll();
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Medico> getById(@PathVariable String id){
		Medico obj = medicoService.getById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public Medico create(@RequestBody Medico medico) {
		return medicoService.create(medico);
	}
}
