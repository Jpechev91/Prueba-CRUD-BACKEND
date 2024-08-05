package com.example.CODESA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CODESA.entity.Persona;
import com.example.CODESA.repository.PersonaRepository;

@Service
public class PersonaServiceImpl {

	@Autowired
	private PersonaRepository personaRepository;

	public List<Persona> findAll() {
		return personaRepository.findAll();
	}

	public Optional<Persona> findById(Long id) {
		return personaRepository.findById(id);
	}

	public Persona save(Persona persona) {
		return personaRepository.save(persona);
	}

	public void deleteById(Long id) {
		personaRepository.deleteById(id);
	}

}
