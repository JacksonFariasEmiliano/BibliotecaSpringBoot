package com.crud.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.api.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {

}
