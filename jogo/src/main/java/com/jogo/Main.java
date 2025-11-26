package com.jogo;

import com.jogo.controller.JogoController;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Iniciando Jogo: Jogo The Last Night...");
        
        // 1. Instancia o Controller (a ponte principal)
        JogoController controller = new JogoController();
        
        // 2. Chama o método de inicialização no Controller.
        // O Controller agora assume o controle e inicia o fluxo.
        controller.mostrarStatus();

    }
}