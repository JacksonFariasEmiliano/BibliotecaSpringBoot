package com.crud.api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.api.DTO.AutorDTO;
import com.crud.api.model.Autor;
import com.crud.api.repository.AutorRepository;

public class AutorService {
	
	@Autowired
	private AutorRepository repository;
	
	public List<AutorDTO>findAll(){
		List<Autor> list = repository.findAll();
		return list.stream().map(x -> new AutorDTO()).collect(Collectors.toList());
	}

}
