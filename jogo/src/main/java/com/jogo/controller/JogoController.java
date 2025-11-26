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
        String decisao = scanner.next();
        SimOuNao(decisao);


        
    }

    public boolean SimOuNao(String escolhaBruta) {

    // 1. Converte e Limpa a entrada bruta
    String escolha = escolhaBruta.trim().toLowerCase(); 

    // 2. CORREÇÃO: Usar .equals() ou .equalsIgnoreCase()
    if (escolha.equals("s")) {
        System.out.println("Você escolheu SIM.");
        return true;
    } 
    
    // 3. CORREÇÃO: Usar else if
    else if (escolha.equals("n")) {
        System.out.println("Você escolheu NÃO.");
        return false;
    } 
    
    // 4. Tratamento de entrada inválida
    else {
        System.out.println("Escolha inválida. Por favor, responda com 's' ou 'n'.");
        // Em um cenário real, você provavelmente retornaria FALSE e deixaria o Controller lidar
        // com o erro. Neste caso, retornaremos false para indicar falha de validação.
        return false;
    }
}

    //public void mostrarStatus() {
        // Ponto A: Controller pega o dado do Model
        //PersonagemEntity josh = gerenciador.getJosh(); 
        
        // Ponto B: Controller passa o dado para a View
       //StatusView.exibirStatus(josh); 
  //}

    

 

}
