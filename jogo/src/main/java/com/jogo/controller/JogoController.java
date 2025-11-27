package com.jogo.controller;

import java.util.ArrayList;
import java.util.List;
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
                this.introducaoView.esperarEnterParaContinuar();

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


        fimDiaNovoDia();

        this.narrativaView.exibirCenaJamesMachucado();
        suspeitoService.adicionarSuspeito(suspeitoFactory.criarIrmaoJames());
        suspeitoService.exibirListaSuspeitos();
        this.introducaoView.esperarEnterParaContinuar();

        this.narrativaView.exibirCenaCasaLucas();
        decisao = scanner.next();

        decisaoFinal = SimOuNao(decisao); 
        this.introducaoView.esperarEnterParaContinuar();

        do {
            if(decisaoFinal == true)  {
             boolean sorteFinal = sorte();
            if(sorteFinal == true) {
                this.narrativaView.exibirCenaInvasaoQuartoLucas();
                pistaService.adicionarPista(pistaFactory.criarCelularLucas());
                pistaService.getPistasEncontradas();
                this.introducaoView.esperarEnterParaContinuar();

                suspeitoService.adicionarSuspeito(suspeitoFactory.criarPaiLucas());
                suspeitoService.exibirListaSuspeitos();
                this.introducaoView.esperarEnterParaContinuar();

                decisaoFinal = false;
            } else {
                this.narrativaView.exibirCenaJoshPegoPeloPaiLucas();
                this.gerenciador.aplicarPenaPorAtoIlegal();
                this.introducaoView.esperarEnterParaContinuar();
                gerenciador.consultarNivelSuspeita();
                this.introducaoView.esperarEnterParaContinuar();

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


        this.narrativaView.exibirCenaDiretorMiller();
        decisao = scanner.next();

        decisaoFinal = SimOuNao(decisao); 
        this.introducaoView.esperarEnterParaContinuar();

        do {
            if(decisaoFinal == true)  {
             boolean sorteFinal = sorte();
            if(sorteFinal == true) {
                this.narrativaView.exibirCenaInvestigacaoSalaDiretor();
                pistaService.adicionarPista(pistaFactory.criarBauDiretor());
                pistaService.getPistasEncontradas();
                this.introducaoView.esperarEnterParaContinuar();

                suspeitoService.adicionarSuspeito(suspeitoFactory.criarDiretor());
                suspeitoService.exibirListaSuspeitos();
                this.introducaoView.esperarEnterParaContinuar();

                decisaoFinal = false;
            } else {
                this.narrativaView.exibirCenaDiretorPegaJosh();
                this.gerenciador.aplicarPenaPorAtoIlegal();
                this.introducaoView.esperarEnterParaContinuar();
                gerenciador.consultarNivelSuspeita();
                this.introducaoView.esperarEnterParaContinuar();

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

        this.narrativaView.exibirCenaProfessorEntregaRedacao();
        pistaService.adicionarPista(pistaFactory.criarRedacaoJames());
        pistaService.getPistasEncontradas();
        this.introducaoView.esperarEnterParaContinuar();

        suspeitoService.adicionarSuspeito(suspeitoFactory.criarProfessor());
        suspeitoService.exibirListaSuspeitos();
        this.introducaoView.esperarEnterParaContinuar();

        fimDiaNovoDia();

        this.narrativaView.exibirCenaDonaLuciaVultos();
        decisao = scanner.next();

        decisaoFinal = SimOuNao(decisao); 
        this.introducaoView.esperarEnterParaContinuar();

        do {
            if(decisaoFinal == true)  {
             boolean sorteFinal = sorte();
            if(sorteFinal == true) {
                this.narrativaView.exibirCenaJoshAchaChaveDerick();
                pistaService.adicionarPista(pistaFactory.criarChaveDerick());
                pistaService.getPistasEncontradas();
                this.introducaoView.esperarEnterParaContinuar();

                suspeitoService.adicionarSuspeito(suspeitoFactory.criarDerick());
                suspeitoService.exibirListaSuspeitos();
                this.introducaoView.esperarEnterParaContinuar();

                decisaoFinal = false;
            } else {
                this.narrativaView.exibirCenaDonaLuciaAchaJosh();
                this.gerenciador.aplicarPenaPorAtoIlegal();
                this.introducaoView.esperarEnterParaContinuar();
                gerenciador.consultarNivelSuspeita();
                this.introducaoView.esperarEnterParaContinuar();

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

        this.narrativaView.exibirCenaAbreBauFinal();
        pistaService.adicionarPista(pistaFactory.criarArmaDoCrime());
        pistaService.getPistasEncontradas();
        this.introducaoView.esperarEnterParaContinuar();

        fimDiaNovoDia();

        this.narrativaView.exibirCenaBotaoCamisa();
        pistaService.adicionarPista(pistaFactory.criarBotaoCamisa());
        pistaService.getPistasEncontradas();
        this.introducaoView.esperarEnterParaContinuar();

        this.narrativaView.exibirCenaRevisaoObrigatoria();
        pistaService.getPistasEncontradas();
        this.introducaoView.esperarEnterParaContinuar();
        suspeitoService.exibirListaSuspeitos();
        this.introducaoView.esperarEnterParaContinuar();
        
        
        iniciarSelecaoEntrevistas();  
        iniciarAcusacaoFinal();  

        
    }         
    
// DENTRO DE JogoController.java

public void iniciarAcusacaoFinal() {
    
    System.out.println("\n=================================================");
    System.out.println("     👑 MOMENTO DA VERDADE: ACUSAÇÃO FINAL 👑");
    System.out.println("=================================================");
    System.out.println("  Com todas as pistas e entrevistas em mãos, você tem que decidir.");
    System.out.println("  Quem é o assassino de Lucas?");
    
    // Lista de opções para acusação (deve ser a mesma usada nas entrevistas)
    System.out.println("1 - Zelador");
    System.out.println("2 - Pai de Derick (Sr Steve)");
    System.out.println("3 - Diretor Miller");
    System.out.println("4 - Professor Fred");
    System.out.println("5 - James (irmão)");
    System.out.println("6 - Derick (o amigo inocente)"); // Note que Derick é a vítima da armadilha
    System.out.println("7 - Marlon, Melhor amigo de Lucas");
    System.out.println("----------------------------------------");

    int escolha = -1;
    boolean escolhaValida = false;

    // Loop de validação de input
    do {
        System.out.print("Digite o número do seu suspeito final (1 a 7): ");
        if (scanner.hasNextInt()) {
            escolha = scanner.nextInt();
            scanner.nextLine();
            if (escolha >= 1 && escolha <= 7) {
                escolhaValida = true;
            } else {
                System.out.println("❌ Número fora do range. Por favor, escolha um número de 1 a 7.");
            }
        } else {
            System.out.println("❌ Entrada inválida! Por favor, insira apenas números.");
            scanner.nextLine();
        }
    } while (!escolhaValida);

    final int ASSASSINO_CORRETO = 5; // James (irmão)
    
    // =======================================================
    // VERIFICAÇÃO DO RESULTADO
    // =======================================================

    if (escolha == ASSASSINO_CORRETO) {
        // === FINAL VITORIOSO ===
        this.narrativaView.exibirFinalVitoria(escolha);
        
    } else {
        // === FINAL DERROTA/ERRO ===
        this.narrativaView.exibirFinalDerrota(escolha, ASSASSINO_CORRETO);
    }
    
    // Finaliza o jogo após o desfecho
    // this.menuController.carregarTelaFinal();
}    

// DENTRO DE JogoController.java

public void iniciarSelecaoEntrevistas() {
    
    // Contador para controlar as entrevistas (serão 3 no total)
    int entrevistasRestantes = 3;
    
    // Lista para rastrear os números (IDs de 1 a 7) dos suspeitos já entrevistados
    List<Integer> entrevistadosIds = new ArrayList<>(); 
    
    System.out.println("=================================================");
    System.out.println("     🎤 FASE FINAL: SELEÇÃO DE ENTREVISTAS");
    System.out.println("  Você tem direito a 3 entrevistas no total.");
    System.out.println("=================================================");
    
    // LOOP PRINCIPAL: Executa até que 3 entrevistas sejam concluídas
    while (entrevistasRestantes > 0) {
        
        System.out.printf("\n--- ENTREVISTA #%d de 3 ---\n", (4 - entrevistasRestantes));
        
        // Exibição da lista para que o jogador possa fazer a seleção (View de contexto)
        System.out.println("1 - Zelador, estava com baú misterioso");
        System.out.println("2 - Pai de Derick (Sr Steve)");
        System.out.println("3 - Diretor Miller, estava com baú misterioso");
        System.out.println("4 - Professor Fred");
        System.out.println("5 - James (irmão)");
        System.out.println("6 - Derick (melhor amigo)");
        System.out.println("7 - Marlon, Melhor amigo de Lucas (vítima)");
        System.out.println("----------------------------------------");

        int escolha = -1;
        boolean escolhaValidaParaExecucao = false;
        
        // LOOP DE VALIDAÇÃO: Repete até receber uma escolha válida (número 1-7, não repetido)
        do {
            System.out.print("Escolha o número do suspeito: ");
            
            // 1. TRATAMENTO DE ERRO: Verifica se o input é um número
            if (scanner.hasNextInt()) {
                escolha = scanner.nextInt();
                scanner.nextLine(); // Consome o '\n'
                
                // 2. VALIDAÇÃO DE RANGE: Verifica se está entre 1 e 7
                if (escolha >= 1 && escolha <= 7) {
                    
                    // 3. VALIDAÇÃO DE REPETIÇÃO: Verifica se já foi entrevistado
                    if (entrevistadosIds.contains(escolha)) {
                        System.out.println("❌ Suspeito já entrevistado. Escolha outro alvo.");
                        
                    } else {
                        // Entrada válida e inédita!
                        escolhaValidaParaExecucao = true; // Sai do loop 'do-while'
                    }
                    
                } else {
                    System.out.println("❌ Opção inválida! Por favor, escolha um número de 1 a 7.");
                }
                
            } else {
                // Mensagem de erro para input não-numérico
                System.out.println("❌ Comando inválido! Por favor, insira apenas números.");
                scanner.nextLine(); // Descarta o input inválido para evitar loop infinito
            }

        } while (!escolhaValidaParaExecucao);
        
        // EXECUÇÃO: Chama a função de entrevista correspondente
        switch (escolha) {
            case 1:
                this.narrativaView.entrevistarZelador();
                break;
            case 2:
                this.narrativaView.entrevistarPaiDerickSrSteve();
                break;
            case 3:
                this.narrativaView.entrevistarDiretorMiller();
                break;
            case 4:
                this.narrativaView.entrevistarProfessorFred();
                break;
            case 5:
                this.narrativaView.entrevistarJamesIrmao();
                break;
            case 6:
                this.narrativaView.entrevistarDerick();
                break;
            case 7:
                this.narrativaView.entrevistarMarlonMelhorAmigo();
                break;
        }

        // REGISTRO: Adiciona o suspeito à lista de entrevistados e decrementa o contador principal
        entrevistadosIds.add(escolha);
        entrevistasRestantes--;
        
    } // Fim do LOOP PRINCIPAL
    
    System.out.println("\n=================================================");
    System.out.println("     ✅ FASE DE ENTREVISTAS CONCLUÍDA!");
    System.out.println("  As 3 entrevistas permitidas foram realizadas.");
    System.out.println("=================================================\n");
}    


    public void fimDiaNovoDia() {
        this.narrativaView.exibirRetornoParaCasa();
        String decisao = scanner.next();
        boolean decisaoFinal = SimOuNao(decisao);
        this.introducaoView.esperarEnterParaContinuar();

        if(decisaoFinal == true) {
            pistaService.getPistasEncontradas();
            this.introducaoView.esperarEnterParaContinuar();
            suspeitoService.exibirListaSuspeitos();
            this.introducaoView.esperarEnterParaContinuar();

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