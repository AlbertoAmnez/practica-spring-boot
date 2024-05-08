package com.alberto.web.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alberto.web.mvc.entity.Alumno;
import com.alberto.web.mvc.service.AlumnoServices;

@Controller
public class AlumnoController {
	
	@Autowired
	private AlumnoServices servicio;
	
	@GetMapping({"/alumnos", "/"})
	public String listaAlumnos(Model modelo) {
		modelo.addAttribute("alumno", servicio.listadoDeAlumnos());
		return "alumno";
	}
	
	@GetMapping("/alumnos/new")
	public String formularioAlumno(Model modelo) {
		Alumno alumno = new Alumno();
		modelo.addAttribute("alumno",alumno);
		return "crear_alumno";
	}

}


