package com.airus.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airus.desafio.model.Especialidades;
import com.airus.desafio.model.Tecnicos;
import com.airus.desafio.repository.EspecialidadesRepository;
import com.airus.desafio.repository.TecnicosRepository;

@RestController
@RequestMapping("/especialidades")
@CrossOrigin("*")
public class EspecialidadesController {
	
	@Autowired
	private EspecialidadesRepository repository;
	
	@GetMapping // Sempre que uma requisição externa ser get. Dispare este método
	public ResponseEntity<List<Especialidades>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	@PostMapping
	public ResponseEntity<Especialidades> post (@RequestBody Especialidades especialidades){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(especialidades));
	}
	
	@PutMapping
	public ResponseEntity<Especialidades> put (@RequestBody Especialidades especialidades){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(especialidades));
		
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		repository.deleteById(id);
	}
}