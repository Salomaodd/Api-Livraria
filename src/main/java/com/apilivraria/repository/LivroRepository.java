package com.apilivraria.repository;

import com.apilivraria.model.Autor;
import com.apilivraria.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID > {

    boolean existsByAutor(Autor autor);
}
