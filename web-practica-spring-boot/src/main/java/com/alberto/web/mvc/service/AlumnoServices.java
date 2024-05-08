package com.alberto.web.mvc.service;

import java.util.List;

import com.alberto.web.mvc.entity.Alumno;


public interface AlumnoServices {
	
	public List<Alumno> listadoDeAlumnos();
	
	public Alumno guardarAlumno(Alumno alumno);

}
