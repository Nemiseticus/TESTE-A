package com.airus.desafio.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_especialidades")// definindo tabela e seu nome
public class Especialidades {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Chave primaria
	private long id ;
	
	@NotNull
	//@ManyToOne
	private String especialidadeTecnico ;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEspecialidadeTecnico() {
		return especialidadeTecnico;
	}

	public void setEspecialidadeTecnico(String especialidadeTecnico) {
		this.especialidadeTecnico = especialidadeTecnico;
	}

	
	}
