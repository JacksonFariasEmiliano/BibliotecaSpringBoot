package com.crud.api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.api.DTO.LivroDTO;
import com.crud.api.model.Livro;
import com.crud.api.repository.LivroRepository;

public class LivroService {
	
	@Autowired
	private LivroRepository repository;
	
	public List<LivroDTO> findAll(){
		List<Livro> list = repository.findAllByLivroByNameAsc();
		return list.stream().map(x -> new LivroDTO()).collect(Collectors.toList());
	}

}
