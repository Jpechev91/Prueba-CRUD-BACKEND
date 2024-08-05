package com.example.CODESA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CODESA.entity.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {

}
