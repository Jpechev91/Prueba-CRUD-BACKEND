package com.example.CODESA.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CODESA.entity.Persona;
import com.example.CODESA.service.PersonaServiceImpl;

@RestController
@RequestMapping("/api/persona/")
public class PersonaController {

	@Autowired
	private PersonaServiceImpl personaServiceImpl;

	@GetMapping
	private ResponseEntity<List<Persona>> getAllPersonas() {
		return ResponseEntity.ok(personaServiceImpl.findAll());
	}

	@PostMapping
	private ResponseEntity<Persona> savePersona(@RequestBody Persona persona) {
		try {
			Persona personaSaved = personaServiceImpl.save(persona);
			return ResponseEntity.created(new URI("/api/persona/" + personaSaved.getIdPersona())).body(personaSaved);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}

	}

	@DeleteMapping(value = "delete/{idPersona}")
	private ResponseEntity<Boolean> deletePersona(@PathVariable("idPersona") Long idPersona) {
		personaServiceImpl.deleteById(idPersona);
		return ResponseEntity.ok(!(personaServiceImpl.findById(idPersona) != null));

	}
}
