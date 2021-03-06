package com.caio.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caio.cursomc.domain.Cliente;
import com.caio.cursomc.repositories.ClienteRepository;
import com.caio.cursomc.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired //Instancia automaticamente
	private ClienteRepository repo;
	
	
	
	public Cliente buscar(Integer id) { //Método que utiliza
										  //um objeto do repositório para pesquisar
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID "+id+" Tipo:"+ Cliente.class.getName()));
	}
}
