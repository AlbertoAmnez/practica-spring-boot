package com.alberto.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alberto.web.mvc.dao.AlumnoRepositorio;
import com.alberto.web.mvc.entity.Alumno;


@Service
public class AlumnoServicesImpl implements AlumnoServices{
	
	@Autowired
	private AlumnoRepositorio repositorio;
	
	@Override
	public List<Alumno> listadoDeAlumnos() {
		return repositorio.findAll();
	}
	
	@Override
	public Alumno guardarAlumno(Alumno alumno) {
		return repositorio.save(alumno);
	}
}
