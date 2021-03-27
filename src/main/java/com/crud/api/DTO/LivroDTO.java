package com.crud.api.DTO;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LivroDTO {

	private Long id;
	private String nome;
	private String autor;
	
	private List<AutorDTO> autores = new ArrayList<>();
	
	
}
