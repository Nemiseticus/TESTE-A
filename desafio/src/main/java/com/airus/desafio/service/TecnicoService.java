package com.airus.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.airus.desafio.model.Tecnicos;
import com.airus.desafio.repository.TecnicosRepository;

@Service

public class TecnicoService {
	@Autowired //Instanciação de repositorio
	public TecnicosRepository repository;
	
	public List<Tecnicos> listarTodos(){
		return repository.findAll(); //return repository.findAll();
	}
	
	

}
