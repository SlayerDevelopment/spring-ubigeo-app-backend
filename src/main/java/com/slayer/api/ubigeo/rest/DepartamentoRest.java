package com.slayer.api.ubigeo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slayer.api.ubigeo.entities.Departamento;
import com.slayer.api.ubigeo.services.DepartamentoService;
import com.slayer.api.ubigeo.util.LogAbstract;

import static com.slayer.api.ubigeo.util.UbigeoAppConstantes.ROOT;

import java.util.List;

@RestController
@RequestMapping(ROOT)
public class DepartamentoRest extends LogAbstract{
	
	@Autowired
	private DepartamentoService departamentoService;
	
	@GetMapping("/departamentos")
	private List<Departamento> listarDepartamentos(){
		return departamentoService.listarDepartamentos();
	}

}
