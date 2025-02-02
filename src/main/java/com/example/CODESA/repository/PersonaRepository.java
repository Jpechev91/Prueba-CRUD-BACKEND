package com.example.CODESA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CODESA.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
