package com.airus.desafio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.airus.desafio.model.Tecnicos;

@Repository
public interface TecnicosRepository extends JpaRepository<Tecnicos, Long> {
	public List<Tecnicos> findAllByDescricaoTecnicoContainingIgnoreCase (String descricaoTecnico);
	
	public List<Tecnicos> findAll();
}
