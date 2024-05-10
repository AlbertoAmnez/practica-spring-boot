package com.alberto.web.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.alberto.web.mvc.service.ProyectoServices;

@Controller
public class ProyectoController {
	
	@Autowired
	private ProyectoServices servicio;
	
	@GetMapping({"/proyecto", "/"})
	public String listaproyectos(Model modelo) {
		modelo.addAttribute("proyecto", servicio.listadoDeProyectos());
		return "proyecto";
	}

}
