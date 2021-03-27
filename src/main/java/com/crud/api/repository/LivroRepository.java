package com.crud.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.api.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
	
	//Lista de livro organizado por ordem alfabetica
	List<Livro> findAllByLivroByNameAsc();

}
