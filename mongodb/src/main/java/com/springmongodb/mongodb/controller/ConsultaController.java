package com.springmongodb.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongodb.mongodb.model.Consulta;
import com.springmongodb.mongodb.service.ConsultaService;

@RestController
@RequestMapping(path = "/consultas")
public class ConsultaController {
	
	@Autowired
	private ConsultaService consultaService;
	
	@GetMapping
	public List<Consulta> getAll(){
		return consultaService.getAll();
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Consulta> getById(@PathVariable String id){
		Consulta obj = consultaService.getById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public Consulta create(@RequestBody Consulta consulta) {
		return consultaService.create(consulta);
	}

}
