package com.crud.api.DTO;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AutorDTO {

	private Long id;
	private String nome;
	
	private List<LivroDTO> livros = new ArrayList<>();
}
