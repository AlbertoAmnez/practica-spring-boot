package com.alberto.web.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alberto.web.mvc.entity.Alumno;


public interface AlumnoRepositorio extends JpaRepository<Alumno,Long> {

}
