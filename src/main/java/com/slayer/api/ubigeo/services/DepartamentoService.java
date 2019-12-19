package com.slayer.api.ubigeo.services;

import java.util.List;

import com.slayer.api.ubigeo.entities.Departamento;

public interface DepartamentoService {
	
	List<Departamento> listarDepartamentos();
	Departamento mostrarDepartamento(Long id);
	Integer cuentaRegistros();
	void guardarDepartamento(Departamento departamento);
	void eliminarDepartamento(Long id);

}
