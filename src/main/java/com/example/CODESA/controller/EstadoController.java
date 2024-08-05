package com.example.CODESA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CODESA.entity.Estado;
import com.example.CODESA.service.EstadoServiceImpl;

@RestController
@RequestMapping("/api/estado/")
public class EstadoController {

	@Autowired
	private EstadoServiceImpl estadoServiceImpl;

	@GetMapping
	private ResponseEntity<List<Estado>> getAllEstados() {
		return ResponseEntity.ok(estadoServiceImpl.findAll());
	}

}
