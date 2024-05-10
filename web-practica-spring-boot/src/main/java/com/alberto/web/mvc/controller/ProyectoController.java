package com.alberto.web.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alberto.web.mvc.entity.Proyecto;
import com.alberto.web.mvc.service.ProyectoServices;

@RestController
@RequestMapping("/api")
public class ProyectoController {
	
	@Autowired
	private ProyectoServices servicio;
	
	@GetMapping("/proyecto")
	public List<Proyecto> index(){
		return servicio.listadoDeProyectos();
	
	}
	
	
	@GetMapping("/proyecto/{id}")
	public Proyecto show(@PathVariable Long id) {
		return servicio.buscarPorId(id);
	}
	
	
	@PostMapping("/proyecto")
	public Proyecto create(@RequestBody Proyecto proyecto) {
		return servicio.guardar(proyecto);
	}
	
	
	
	
	@PutMapping("/proyecto/{id}")
	public Proyecto update(@PathVariable Long id,@RequestBody Proyecto proyecto ) {
		Proyecto proyectoUpdate = servicio.buscarPorId(id);
		proyectoUpdate.setNombre(proyecto.getNombre());
		proyectoUpdate.setDescripcion(proyecto.getDescripcion());
		proyectoUpdate.setFecha_inicio(proyecto.getFecha_inicio());
		proyectoUpdate.setFecha_fin(proyecto.getFecha_fin());
		proyectoUpdate.setActivo(proyecto.getActivo());
		
		return servicio.guardar(proyectoUpdate);
	}
	

	@DeleteMapping("/proyecto/{id}")
	public Proyecto delete(@PathVariable Long id) {
		return servicio.borrar(id);
		
	}
}


