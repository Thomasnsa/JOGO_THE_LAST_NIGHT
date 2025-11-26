package com.jogo.controller;

import java.util.Scanner;

import javax.swing.text.View;

import com.jogo.model.entity.PersonagemEntity;

import com.jogo.model.service.GerenciadorJogoService;

import com.jogo.view.StatusView;
import com.jogo.view.IntroducaoView;
import com.jogo.view.NarrativaView;

public class JogoController {

    private GerenciadorJogoService gerenciador; // Model Service
    private final Scanner scanner;
    private final IntroducaoView introducaoView;
    private final NarrativaView narrativaView;

    public JogoController() {
        // Inicializa o Service antes que qualquer método tente usá-lo.
        this.gerenciador = new GerenciadorJogoService(); 

        // Inicializa o Scanner
        this.scanner = new Scanner(System.in);

        this.narrativaView = new NarrativaView(this.scanner);
        this.introducaoView = new IntroducaoView(this.scanner);

    }

    public void iniciarJogo() {
        
        this.introducaoView.exibirApresentacao();

        this.introducaoView.exibirInstrucoes();

        this.narrativaView.exibirCenaPrisaoDerick();

        this.narrativaView.exibirCenaZelador();
        escolhaZelador = scanner.next();


        
    }

    public void SimOuNao(String escolha) {
        if (escolha.equalsIgnoreCase("sim")) {
            System.out.println("Você escolheu SIM.");
        } else if (escolha.equalsIgnoreCase("não")) {
            System.out.println("Você escolheu NÃO.");
        } else {
            System.out.println("Escolha inválida. Por favor, responda com 'sim' ou 'não'.");
        }
        
    }
    
    //public void mostrarStatus() {
        // Ponto A: Controller pega o dado do Model
        //PersonagemEntity josh = gerenciador.getJosh(); 
        
        // Ponto B: Controller passa o dado para a View
       //StatusView.exibirStatus(josh); 
  //}

    

 

}
