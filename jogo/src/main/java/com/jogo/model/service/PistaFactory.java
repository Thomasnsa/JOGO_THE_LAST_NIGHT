package com.jogo.model.service;

import com.jogo.model.entity.PistaEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PistaFactory {

    /**
     * Pista 1: Baú na Sala do Zelador.
     */
    public static PistaEntity criarBauZelador() {
        return new PistaEntity(
            "P001", 
            "Baú Misterioso (Zelador)", 
            "Um baú de madeira antigo, encontrado escondido na sala do zelador. Não está trancado, mas está vazio."
            
        );
    }
    
    /**
     * Pista 2: Celular da Vítima (Lucas).
     */
    public static PistaEntity criarCelularLucas() {
        return new PistaEntity(
            "P002", 
            "Celular da Vítima", 
            "O celular de Lucas, encontrado em sua casa. Contém três conversas cruciais: uma briga com o melhor amigo, uma mensagem da namorada, e uma ameaça vaga de um número desconhecido. \"A mensagem de texto do desconhecido que diz: 'aproveite sua família.....' (há 5 pontos, fora do comum, geralmente é colocado só 3)."
        );
    }

    /**
     * Pista 2.1: Celular da Vítima (Lucas).
     */
    public static PistaEntity criarAmeacaDesconhecida() {
        return new PistaEntity(
            "P02.1", 
            "Informação do pai da vitima sobre o celular da vitima (Lucas)", 
            "A mensagem de texto do desconhecido que diz: 'aproveite sua família.....' (há 5 pontos, fora do comum, geralmente é colocado só 3)."
        );
    }
    
    /**
     * Pista 3: Baú na Sala do Diretor (Misterioso 2).
     */
    public static PistaEntity criarBauDiretor() {
        return new PistaEntity(
            "P003", 
            "Baú Misterioso (Diretor)", 
            "O mesmo baú de madeira visto na sala do zelador, agora trancado e guardado na sala do diretor. Ele parece ter sido limpo recentemente."
        );
    }
    
    /**
     * Pista 4: Redação de James (Irmão).
     */
    public static PistaEntity criarRedacaoJames() {
        return new PistaEntity(
            "P004", 
            "Redação de James", 
            "Uma redação de James (seu irmão) sobre 'Pressão e Segredos'. Contém uma frase estranhamente relevante: '...o peso da verdade é a única coisa que nos liberta...'."
        );
    }
    
    /**
     * Pista 5: Chave no Quarto de Derick.
     */
    public static PistaEntity criarChaveDerick() {
        return new PistaEntity(
            "P005", 
            "Chave Misteriosa", 
            "Uma chave antiga, encontrada escondida no quarto de Derick. Parece que pode abrir algum tipo de porta, caixa ou baú."
        );
    }
    
    /**
     * Pista 6: Arma do Assassinato (Faca).
     */
    public static PistaEntity criarArmaDoCrime() {
        return new PistaEntity(
            "P006", 
            "Faca do Assassinato", 
            "A faca que foi usada no crime. Encontrada dentro do Baú Misterioso na sala do diretor. O cabo tem marcas de manipulação recente."
        );
    }

    /**
     * Pista 7: Botão de Camisa.
     */
    public static PistaEntity criarBotaoCamisa() {
        return new PistaEntity(
            "P007", 
            "Botão de Camisa", 
            "Um botão de camisa de cor escura, arrancado violentamente. Encontrado próximo ao local do assassinato na floresta."
        );
    }
}
