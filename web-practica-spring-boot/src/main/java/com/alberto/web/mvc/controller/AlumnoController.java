package com.alberto.web.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
		return "nuevo_alumno";
	}
	
	@PostMapping("/alumnos/new")
	public String guardarAlumno(@ModelAttribute("alumno") Alumno alumno) {
		servicio.guardarAlumno(alumno);
		return "redirect:/alumnos";
	}
	
	@GetMapping("/alumnos/edit/{id}")
	public String formEditarAlumno(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("alumno", servicio.obtenerAlumnoId(id));
		
		return "editar_alumno";
	}
	
	@PostMapping("/alumnos/edit/{id}")
	public String actualizarAlumno(@PathVariable Long id, @ModelAttribute("alumno") Alumno alumno) {
		Alumno alumnoUpdate = servicio.obtenerAlumnoId(id);
		
		alumnoUpdate.setNombre(alumno.getNombre());
		alumnoUpdate.setApellido(alumno.getApellido());
		alumnoUpdate.setTelefono(alumno.getTelefono());
		alumnoUpdate.setEmail(alumno.getEmail());
		alumnoUpdate.setDni(alumno.getDni());
		alumnoUpdate.setFecha_nac(alumno.getFecha_nac());
		
		servicio.guardarAlumno(alumnoUpdate);
		return "redirect:/alumnos";
		
	}
	
	@GetMapping("/alumnos/eliminar/{id}")
	public String eliminarAlumno(@PathVariable Long id) {
		servicio.eliminarAlumno(id);
		return "redirect:/alumnos";

	}

}
	


