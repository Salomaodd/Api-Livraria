package com.apilivraria.controller.dto;

import com.apilivraria.model.Autor;

import java.time.LocalDate;
import java.util.UUID;

public record AutorDTO(UUID id,
                       String nome,
                       LocalDate dataNascimento,
                       String nacionalidade) {

    public Autor mapearParaAutor() {
        Autor autor = new Autor();
        autor.setNome(this.nome);
        autor.setDataNascimento(this.dataNascimento);
        autor.setNacionalidade(this.nacionalidade);
        return autor;
    }
}