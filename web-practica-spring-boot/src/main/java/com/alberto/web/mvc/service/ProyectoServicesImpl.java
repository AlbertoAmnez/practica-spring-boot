package com.alberto.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alberto.web.mvc.dao.ProyectoRepositorio;
import com.alberto.web.mvc.entity.Proyecto;

@Service
public class ProyectoServicesImpl implements ProyectoServices{
	
	@Autowired
	private ProyectoRepositorio repositorio;
	
	@Override
	public List<Proyecto> listadoDeProyectos() {
		return repositorio.findAll();
	}

	
}
