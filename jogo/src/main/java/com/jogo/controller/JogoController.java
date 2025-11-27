package com.jogo.controller;

import java.util.Scanner;
import javax.swing.text.View;
import com.jogo.model.entity.PersonagemEntity;
import com.jogo.model.entity.PistaEntity;
import com.jogo.model.service.GerenciadorJogoService;
import com.jogo.model.service.PistaService;
import com.jogo.model.service.SuspeitoFactory;
import com.jogo.model.service.PistaFactory;
import com.jogo.model.service.SuspeitoFactory;
import com.jogo.model.service.SuspeitoService;

import com.jogo.view.StatusView;
import com.jogo.view.IntroducaoView;
import com.jogo.view.NarrativaView;

public class JogoController {

    private GerenciadorJogoService gerenciador; // Model Service
    private PistaService pistaService;
    private PistaFactory pistaFactory; 
    private PistaEntity pistaEntity; // Model Service
    private SuspeitoFactory suspeitoFactory;
    private SuspeitoService suspeitoService;    
    private final Scanner scanner;
    private final IntroducaoView introducaoView;
    private final NarrativaView narrativaView;
    

    public JogoController() {
        // Inicializa o Service antes que qualquer método tente usá-lo.
        this.gerenciador = new GerenciadorJogoService(); 
        this.pistaService = new PistaService();
        this.pistaFactory = new PistaFactory();
        this.suspeitoFactory = new SuspeitoFactory();
        this.suspeitoService = new SuspeitoService();


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

        boolean decisaoFinal = SimOuNao(decisao); 
        this.introducaoView.esperarEnterParaContinuar();

        do {
            if(decisaoFinal == true)  {
             boolean sorteFinal = sorte();
            if(sorteFinal == true) {
                this.narrativaView.exibirResultadoBoaSorteZelador();
                pistaService.adicionarPista(pistaFactory.criarBauZelador());
                pistaService.getPistasEncontradas();
                this.introducaoView.esperarEnterParaContinuar();

                suspeitoService.adicionarSuspeito(suspeitoFactory.criarZelador());
                suspeitoService.exibirListaSuspeitos();

                decisaoFinal = false;
            } else {
                this.narrativaView.exibirResultadoMaSorteZelador();
                this.gerenciador.aplicarPenaPorAtoIlegal();
                this.introducaoView.esperarEnterParaContinuar();
                gerenciador.consultarNivelSuspeita();
                this.introducaoView.esperarEnterParaContinuar();
                this.narrativaView.zeladorVaiEmbora();
                

                decisaoFinal = this.narrativaView.reivestigar();
                decisao = scanner.next();
                decisaoFinal = SimOuNao(decisao);
                
                if(decisaoFinal == true) {
                    decisaoFinal = true;
                } else {
                decisaoFinal = false;
            }
        }
        } }while(decisaoFinal == true);

        this.narrativaView.exibirRetornoParaCasa();
        decisao = scanner.next();
        decisaoFinal = SimOuNao(decisao);
        this.introducaoView.esperarEnterParaContinuar();

        if(decisaoFinal == true) {
            pistaService.getPistasEncontradas();
            suspeitoService.exibirListaSuspeitos();
        }

        
        this.narrativaView.exibirNovoDia();
    }         
    


    public boolean SimOuNao(String escolhaBruta) {

    // 1. Processamento (Limpa e padroniza a entrada)
    String escolhaProcessada = escolhaBruta.trim().toLowerCase();
    Scanner sc = new Scanner(System.in);

    while(1 == 1) {
        if (escolhaProcessada.equals("s")) {
        // Exibe feedback, mas NÃO retorna aqui para que o loop externo possa usar o resultado.
        System.out.println("Opção escolhida: SIM. (Preparando para investigar)");

        this.scanner.nextLine(); 

        return true; // Entrada válida
        
    } else if (escolhaProcessada.equals("n")) {
        System.out.println("Opção escolhida: NÃO. (Avançando na história)");
        
        return false; // Entrada válida
    }
    
    System.out.println("\n❌ Escolha inválida. Por favor, responda APENAS com 's' ou 'n'.");
    escolhaBruta = sc.nextLine();
    escolhaProcessada = escolhaBruta.trim().toLowerCase();
        }         
    }

    public boolean sorte() {
        
        System.out.println("Pela sorte iremos ver se você conseguirá encontrar algo ou levantará suspeita contra si próprio.");
        System.out.println("Aperte ENTER para ver o resultado.");
        this.introducaoView.esperarEnterParaContinuar();



        double numeroAleatorio = Math.random(); // Gera número entre 0.0 e 1.0
        return numeroAleatorio > 0.4; 
    }

    //public void mostrarStatus() {
        // Ponto A: Controller pega o dado do Model
        //PersonagemEntity josh = gerenciador.getJosh(); 
        
        // Ponto B: Controller passa o dado para a View
       //StatusView.exibirStatus(josh); 
  //}

}