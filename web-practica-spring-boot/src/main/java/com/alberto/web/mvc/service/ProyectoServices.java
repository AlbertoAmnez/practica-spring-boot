package com.alberto.web.mvc.service;

import java.util.List;


import com.alberto.web.mvc.entity.Proyecto;

public interface ProyectoServices {
	
	public List<Proyecto> listadoDeProyectos();
	
	public Proyecto buscarPorId(Long id);

	public Proyecto guardar (Proyecto proyecto);
	
	public Proyecto borrar (Long id);

}
