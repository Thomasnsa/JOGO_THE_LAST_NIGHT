package com.jogo.view;

import java.util.Scanner;

public class IntroducaoView {

    private final Scanner scanner;

    public IntroducaoView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void esperarEnterParaContinuar() {
        System.out.println("\n[... ]");
        this.scanner.nextLine(); 

    }

    public void exibirApresentacao() {
        System.out.println("=================================");
        System.out.println("      BEM-VINDO AO JOGO!         ");
        System.out.println("=================================");
        System.out.println("Neste jogo, você assumirá o papel de um detetive tentando resolver um mistério.");
        System.out.println("Explore diferentes locais, colete pistas e tome decisões que afetarão o desenrolar da história.");
        System.out.println("Boa sorte!");
        System.out.println("=================================");

        esperarEnterParaContinuar();
    }

    public void exibirInstrucoes() { 
        System.out.println("=================================");
        System.out.println("Este é um jogo de Mistério/Detetive com escolhas. Seu objetivo é encontrar o verdadeiro\r\n" + 
                           "assassino de Lucas e, assim, provar a inocência de seu melhor amigo, Derick.\r");

        System.out.println("Instruções do Jogo:");
        System.out.println("1. Use os comandos fornecidos para navegar pelo jogo.");
        System.out.println("2. Preste atenção às pistas que encontrar.");
        System.out.println("3. Tome decisões sábias para avançar na história.");
        System.out.println("Para prosseguir com a história, pressione ENTER.");
        System.out.println("4. Divirta-se!");
        System.out.println("=================================");
        System.out.println("");

        esperarEnterParaContinuar();
    }

}