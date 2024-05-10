package com.alberto.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alberto.web.mvc.dao.ProyectoRepositorio;
import com.alberto.web.mvc.entity.Proyecto;

@Service
public class ProyectoServicesImpl implements ProyectoServices{
	
	@Autowired
	private ProyectoRepositorio repositorio;
	
	@Override
	@Transactional(readOnly = true)
	public List<Proyecto> listadoDeProyectos() {
		return (List<Proyecto>) repositorio.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Proyecto buscarPorId(Long id) {	
		return repositorio.findById(id).orElse(null);
	}

	@Override
	public Proyecto guardar(Proyecto proyecto) {
		return repositorio.save(proyecto);
	}

	@Override
	@Transactional
	public Proyecto borrar(Long id) {
		Proyecto proyectoBorrado= repositorio.findById(id).orElse(null);
		repositorio.deleteById(id);
		
		return proyectoBorrado;
	}
}
