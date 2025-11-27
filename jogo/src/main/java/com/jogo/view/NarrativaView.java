package com.jogo.view;

import java.util.Scanner;

public class NarrativaView {

    private final Scanner scanner;

    public NarrativaView(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Pausa a execução e espera que o usuário pressione ENTER para continuar.
     */
    public void esperarEnterParaContinuar() {
        System.out.println("\n[... ]");
        this.scanner.nextLine(); 
        System.out.println("\n");
    }

    /**
     * Exibe a sequência da cena de prisão de Derick (Capítulo 1).
     */
    public void exibirCenaPrisaoDerick() {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("--- CAPÍTULO 1: O PRINCIPAL SUSPEITO ---");
        System.out.println("-----------------------------------------------------------------------");
        
        esperarEnterParaContinuar();

        // --- Ação 1: Sirenes ---
        System.out.println("Ação: Josh vai até a casa de seu melhor amigo (Derick) para ir à escola.");
        System.out.println("Josh: \"O ar de Lakewood Hills nunca pareceu tão frio. Eu estava indo buscar Derick, mas");
        System.out.println("quando cheguei na rua dele, vi as sirenes.\"");
        
        // --- Pausa 1 ---
        esperarEnterParaContinuar();
        
        // --- Ação 2: Prisão ---
        System.out.println("Ação: Josh descobre que seu melhor amigo (Derick) é o principal suspeito do assassinato de Lucas.");
        System.out.println("Policial: \"Ele vai conosco. Você, garoto, afaste-se.\"");
        System.out.println("Derick: (Gritando ao longe, sendo escoltado) \"Josh! Não fui eu! Você tem que me ajudar!\"");
        System.out.println("Ação: Derick é levado preso até segunda ordem.");

        // --- Pausa 2 ---
        esperarEnterParaContinuar();

        // --- Ação 3: Dona Lúcia ---
        System.out.println("Ação: Josh conversa com a mãe de Derick (Dona Lúcia).");
        System.out.println("Josh: \"Dona Lúcia, por favor, me diga que isso é um erro. O que a polícia disse?\"");
        System.out.println("D. Lúcia: \"Dizem que ele e Lucas brigaram. Dizem que acharam algo..., mas meu filho é");
        System.out.println("inocente! Eu imploro, Josh, prove a inocência dele.\"");

        // --- Pausa 3 ---
        esperarEnterParaContinuar();

        // --- Ação 4: Promessa ---
        System.out.println("Josh: \"Eu prometo. Vou para a escola. Vou começar a investigar por lá.\"");
        System.out.println("Ação: Josh está indo para a escola. Sua investigação começou.");
        System.out.println("-----------------------------------------------------------------------");
    }

    public void exibirCenaZelador() {
        
        // --- Ação: Josh chega na escola ---
        System.out.println("Ação: Josh chega na escola e percebe que o Zelador (Bob) está mais feliz pela morte de Lucas.");
        
        esperarEnterParaContinuar(); // Pausa

        // --- Diálogo do Zelador ---
        System.out.println("Zelador Bob: (Assobiando, com um sorriso largo) \"Bom dia, Josh! Um dia de paz,");
        System.out.println("finalmente! Quando certas 'pragas' somem, a vida fica mais limpa, não é mesmo?\"");
        
        esperarEnterParaContinuar(); // Pausa

        // --- Próxima Ação de Risco ---
        System.out.println("Ação: Josh sente um arrepio. A felicidade do zelador é suspeita. Você precisa investigar o cômodo dele.");
        System.out.println("-----------------------------------------------------------------------\n");
        esperarEnterParaContinuar();
        System.out.println("Gostaria de investigar o cômodo do Zelador Bob? (escreve 'S' para sim ou 'N' para não)");

    }

    public void exibirResultadoBoaSorteZelador() {
        
        System.out.println("\n--- RESULTADO: BOA SORTE! 🍀 ---");
        System.out.println("Josh: \"Consegui deslizar para dentro. Encontrei um baú médio de madeira, trancado.\"");
        System.out.println("**Pista Adquirida:** Você encontra um Baú Misterioso!");
        System.out.println("----------------------------------");
        
        System.out.println("Pressione ENTER para continuar...");
        scanner.nextLine();
    }

    /**
     * Exibe a narrativa da MÁ SORTE na cena do Zelador.
     * Não recebe parâmetros e não retorna nada (void).
     */
    public void exibirResultadoMaSorteZelador() {
        
        System.out.println("\n--- RESULTADO: MÁ SORTE! 🚨 ---");
        System.out.println("Zelador Bob: \"O que pensa que está fazendo no meu armário, garoto? Isso é invasão!\"");
        System.out.println("**Ação:** Zelador te encontra vasculhando o armário. (+1 Suspeita adicionada)");
        System.out.println("----------------------------------");
        
        System.out.println("Pressione ENTER para continuar...");
        scanner.nextLine();
    }
}