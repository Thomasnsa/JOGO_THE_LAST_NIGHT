package com.jogo.model.service;

import com.jogo.model.entity.SuspeitoEntity;

/**
 * Classe Factory responsável por criar e inicializar instâncias de SuspeitoEntity.
 * Garante que os suspeitos sejam criados com Nome e Descrição padronizados.
 */
public class SuspeitoFactory {

    public static SuspeitoEntity criarZelador() {
        return new SuspeitoEntity(
            "Zelador",
            "Trabalha na escola há muitos anos. Foi visto em atitude suspeita com um baú nos fundos da escola."
        );
    }

    public static SuspeitoEntity criarDiretor() {
        return new SuspeitoEntity(
            "Diretor",
            "É o chefe da escola. Assim como o Zelador, ele também foi visto com um baú misterioso, o que levanta suspeitas sobre a administração."
        );
    }

    public static SuspeitoEntity criarDerick() {
        return new SuspeitoEntity(
            "Derick",
            "Suspeito inicial. A chave para um dos locais suspeitos foi encontrada em seu quarto. Ele insiste em sua inocência."
        );
    }

    public static SuspeitoEntity criarMelhorAmigoLucas() {
        return new SuspeitoEntity(
            "Melhor Amigo (de Lucas)",
            "Em sua última mensagem no celular os dois estavam brigados."
        );
    }

    public static SuspeitoEntity criarProfessor() {
        return new SuspeitoEntity(
            "Professor",
            "Não gostava de Lucas e teve várias discussões com ele na escola, até houve uma vez que tentou agredi-lo fiscamente na frente de todos."
        );
    }

    public static SuspeitoEntity criarPaiLucas() {
        return new SuspeitoEntity(
            "Pai de Lucas (Sr Steve)",
            "Com uma família problemática, ele talvez por raiva ou ódio contratou alguém para querer silenciar Lucas (vitima), até porque ele espancava o filho"
        );
    }

    public static SuspeitoEntity criarIrmaoJames() {
        return new SuspeitoEntity(
            "James (Irmão de Josh)",
            "Irmão de Josh, estava com rosto machucado"
        );
    }
}