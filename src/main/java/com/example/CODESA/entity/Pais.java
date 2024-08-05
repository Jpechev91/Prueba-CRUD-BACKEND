package com.example.CODESA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "PAISES")
public class Pais {

	@Id
	@Column(name = "ID_PAIS")
	private Long idPais;

	@Column(name = "NOMBRE_PAIS")
	private String nombrePais;

}
