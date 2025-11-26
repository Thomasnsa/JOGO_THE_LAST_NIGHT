package com.jogo.controller;

import com.jogo.model.entity.PersonagemEntity;
import com.jogo.model.service.GerenciadorJogoService;
import com.jogo.view.StatusView;

public class JogoController {

    private GerenciadorJogoService gerenciador; // Model Service

    public JogoController() {
        // Inicializa o Service antes que qualquer método tente usá-lo.
        this.gerenciador = new GerenciadorJogoService(); 
    }
    
    public void mostrarStatus() {
        // Ponto A: Controller pega o dado do Model
        PersonagemEntity josh = gerenciador.getJosh(); 
        
        // Ponto B: Controller passa o dado para a View
        StatusView.exibirStatus(josh); 
    }

}
