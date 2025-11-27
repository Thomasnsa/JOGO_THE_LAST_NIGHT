package com.jogo.model.entity;

/**
 * Representa uma Pista genérica (evidência ou informação) no jogo.
 */
public class PistaEntity {

    private final String id;
    private final String nome;
    private final String descricao;

    // Construtor
    public PistaEntity (String id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    // Métodos Getters
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

}