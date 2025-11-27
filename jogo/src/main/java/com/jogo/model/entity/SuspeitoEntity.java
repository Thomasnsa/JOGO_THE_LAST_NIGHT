package com.jogo.model.entity;


public class SuspeitoEntity {

    private final String nome;
    private final String descricao;

    // Construtor
    public SuspeitoEntity (String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }


    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

}