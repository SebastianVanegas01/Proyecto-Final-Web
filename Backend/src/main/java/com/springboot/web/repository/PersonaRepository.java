package com.springboot.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.web.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
