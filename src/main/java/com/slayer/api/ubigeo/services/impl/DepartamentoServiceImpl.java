package com.slayer.api.ubigeo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slayer.api.ubigeo.daos.DepartamentoDao;
import com.slayer.api.ubigeo.entities.Departamento;
import com.slayer.api.ubigeo.services.DepartamentoService;
import com.slayer.api.ubigeo.util.LogAbstract;

@Service
public class DepartamentoServiceImpl extends LogAbstract implements DepartamentoService {

	@Autowired
	private DepartamentoDao dao;

	@Override
	@Transactional(readOnly = true)
	public List<Departamento> listarDepartamentos() {
		LOG.info("Ejecutando el siguiente Metodo de la Clase: " + getClass().getName() + " - "
				+ Thread.currentThread().getStackTrace()[1].getMethodName());
		return dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Departamento mostrarDepartamento(Long id) {
		LOG.info("Ejecutando el siguiente Metodo de la Clase: " + getClass().getName() + " - "
				+ Thread.currentThread().getStackTrace()[1].getMethodName());
		return dao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Integer cuentaRegistros() {
		LOG.info("Ejecutando el siguiente Metodo de la Clase: " + getClass().getName() + " - "
				+ Thread.currentThread().getStackTrace()[1].getMethodName());
		return dao.findAll().size();
	}

	@Override
	@Transactional
	public void guardarDepartamento(Departamento departamento) {
		LOG.info("Ejecutando el siguiente Metodo de la Clase: " + getClass().getName() + " - "
				+ Thread.currentThread().getStackTrace()[1].getMethodName());
		dao.save(departamento);
	}

	@Override
	@Transactional
	public void eliminarDepartamento(Long id) {
		LOG.info("Ejecutando el siguiente Metodo de la Clase: " + getClass().getName() + " - "
				+ Thread.currentThread().getStackTrace()[1].getMethodName());
		dao.deleteById(id);
	}


}
