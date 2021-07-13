package com.airus.desafio.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.airus.desafio.model.Especialidades;

public interface EspecialidadesRepository extends JpaRepository<Especialidades, Long>{
	public List<Especialidades> findAllByEspecialidadeTecnicoContainingIgnoreCase (String especialidadeTecnico);


}
