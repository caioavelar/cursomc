package com.caio.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.caio.cursomc.domain.Categoria;
import com.caio.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias") //mapeamento
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET) //Requisição básica
	public ResponseEntity<?> find(@PathVariable Integer id) { //Método para utilizar o serviço que
															  //Aplica o repositório	
		
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok(obj);
	
	}
	
	

}
