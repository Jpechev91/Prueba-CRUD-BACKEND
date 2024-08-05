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
@Table(name = "ESTADOS")
public class Estado {

	@Id
	@Column(name = "ID_ESTADO")
	private Long idEstado;

	@Column(name = "NOMBRE_ESTADO")
	private String nombreEstado;

}
