package com.example.CODESA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CODESA.entity.Estado;
import com.example.CODESA.repository.EstadoRepository;

@Service
public class EstadoServiceImpl {

	@Autowired
	private EstadoRepository estadoRepository;

	public List<Estado> findAll() {
		return estadoRepository.findAll();
	}

	public Optional<Estado> findById(Long id) {
		return estadoRepository.findById(id);
	}

	public Estado save(Estado estado) {
		return estadoRepository.save(estado);
	}

	public void deleteById(Long id) {
		estadoRepository.deleteById(id);
	}

}
