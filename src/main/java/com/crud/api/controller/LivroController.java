package com.crud.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.api.DTO.LivroDTO;
import com.crud.api.service.LivroService;

@RestController
@RequestMapping(value = "/livro")
public class LivroController {

	@Autowired
	private LivroService service;
	
	public ResponseEntity<List<LivroDTO>> findaAll(){
		List<LivroDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
