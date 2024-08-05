package com.example.CODESA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "PERSONAS")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long idPersona;

	@Column(name = "NOMBRE_COMPLETO")
	private String nombreCompleto;

	@Column(name = "APELLIDOS")
	private String apellidos;

	@Column(name = "EDAD")
	private Long edad;

	@Column(name = "PAIS")
	private Long pais;

	@Column(name = "ESTADO")
	private Long estado;

}
