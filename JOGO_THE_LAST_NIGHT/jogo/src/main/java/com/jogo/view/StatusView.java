package com.jogo.view;

import com.jogo.model.entity.PersonagemEntity;

public class StatusView {

    public static void exibirStatus(PersonagemEntity personagem) {
        
        // A View PUXA o dado através dos Getters do objeto recebido
        String nome = personagem.getNome();
        int suspeita = personagem.getNivelSuspeita();
        
        // A View SÓ FORMATA E IMPRIME
        System.out.println("---------------------------------");
        System.out.println("          STATUS DO JOGADOR      ");
        System.out.println("---------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Nível de Suspeita: " + suspeita + "/3");
        System.out.println("---------------------------------");
    }

}
