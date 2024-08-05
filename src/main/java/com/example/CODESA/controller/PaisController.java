package com.example.CODESA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CODESA.entity.Pais;
import com.example.CODESA.service.PaisServiceImpl;

@RestController
@RequestMapping("/api/pais/")
public class PaisController {

	@Autowired
	private PaisServiceImpl paisServiceImpl;

	@GetMapping
	public ResponseEntity<List<Pais>> getAllPaises() {
		return ResponseEntity.ok(paisServiceImpl.findAll());
	}
}
