package com.example.CODESA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CODESA.entity.Pais;
import com.example.CODESA.repository.PaisRepository;

@Service
public class PaisServiceImpl {

    @Autowired
    private PaisRepository paisRepository;

    public List<Pais> findAll() {
        return paisRepository.findAll();
    }

    public Optional<Pais> findById(Long id) {
        return paisRepository.findById(id);
    }

    public Pais save(Pais pais) {
        return paisRepository.save(pais);
    }

    public void deleteById(Long id) {
        paisRepository.deleteById(id);
    }
}
