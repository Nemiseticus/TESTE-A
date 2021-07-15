package com.airus.desafio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //Anotação necessaria para que reconheça como entidade
@Table(name = "tb_tecnicos")// definindo tabela e seu nome
public class Tecnicos {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Chave primaria
	private long id ;
	
	//@OneToMany
	private String descricaoTecnico ;
	
	private long id_especialidades ; //Chave estrangeira 

	public long getId_especialidades() {
		return id_especialidades;
	}

	public void setId_especialidades(long id_especialidades) {
		this.id_especialidades = id_especialidades;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricaoTecnico() {
		return descricaoTecnico;
	}

	public void setDescricaoTecnico(String descricaoTecnico) {
		this.descricaoTecnico = descricaoTecnico;
	}
	
	
		
	
}
