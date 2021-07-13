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

import com.airus.desafio.model.Tecnicos;
import com.airus.desafio.repository.TecnicosRepository;
import com.airus.desafio.service.TecnicoService;

@RestController
@RequestMapping("/tecnicos") //Por qual url que essa classe sera acessada
@CrossOrigin("*") //Aceitar requisições de qualquer origem
public class TecnicosController {

	@Autowired //Instanciação de repositorio
	private TecnicosRepository repository;
	
	@Autowired
	private TecnicoService service;
	
	@GetMapping // Sempre que uma requisição externa ser get. Dispare este método
	public ResponseEntity<List<Tecnicos>> listarTodos(){
		return new ResponseEntity<List<Tecnicos>> (service.listarTodos(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Tecnicos> post (@RequestBody Tecnicos tecnicos){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(tecnicos));
	}
	
	@PutMapping
	public ResponseEntity<Tecnicos> put (@RequestBody Tecnicos tecnicos){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(tecnicos));
		
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		repository.deleteById(id);
	}
}
