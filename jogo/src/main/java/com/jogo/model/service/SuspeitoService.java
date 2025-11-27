package com.jogo.model.service;

import com.jogo.model.entity.SuspeitoEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Serviço responsável por gerenciar a coleção de Suspeitos descobertos.
 */
public class SuspeitoService {

    // Lista onde os Suspeitos descobertos serão armazenados.
    private final List<SuspeitoEntity> suspeitosDescobertos;

    public SuspeitoService() {
        // Inicializa a lista vazia ao criar o serviço.
        this.suspeitosDescobertos = new ArrayList<>();
    }

    /**
     * Adiciona um novo Suspeito à lista de descobertas.
     * @param novoSuspeito A entidade SuspeitoEntity a ser adicionada.
     */
    public void adicionarSuspeito(SuspeitoEntity novoSuspeito) {
        if (novoSuspeito != null) {
            // Evita adicionar o mesmo suspeito duas vezes, se o SuspeitoEntity tiver equals/hashCode bem definidos
            if (!this.suspeitosDescobertos.contains(novoSuspeito)) {
                this.suspeitosDescobertos.add(novoSuspeito);
                System.out.println("\n=================================================");
                System.out.println("      🎉 NOVO SUSPEITO ADICIONADO AO CASO! 🎉");
                System.out.println("=================================================");
    
                System.out.printf("  NOME: %s%n", novoSuspeito.getNome());
                System.out.println("  ---------------------------------------------");
                System.out.println("  DESCRIÇÃO INICIAL:");
                System.out.printf("  %s%n", novoSuspeito.getDescricao());
                System.out.println("-------------------------------------------------");
                System.out.println("  Verifique o inventário de Suspeitos para mais detalhes.");
                System.out.println("=================================================\n");
}
            } else {
                 System.out.printf("[LOG SUSP. SERVICE] Suspeito %s já está na lista.%n", novoSuspeito.getNome());
            }
        }
    

    /**
     * Retorna a lista de suspeitos descobertos de forma imutável (apenas leitura).
     * @return Uma lista imutável de SuspeitoEntity.
     */
    public void exibirListaSuspeitos() {
    
    System.out.println("\n=================================================");
    System.out.println("      🔍 CADERNO DE INVESTIGAÇÃO - SUSPEITOS 🔍");
    System.out.println("=================================================");
    
    if (this.suspeitosDescobertos.isEmpty()) {
        System.out.println("  Nenhum suspeito formalmente identificado ainda.");
        System.out.println("  Continue sua investigação!");
        
    } else {
        
        System.out.printf("  Total de Suspeitos Identificados: %d%n", this.suspeitosDescobertos.size());
        System.out.println("  ---------------------------------------------");
        
        // Loop para imprimir cada suspeito
        for (int i = 0; i < this.suspeitosDescobertos.size(); i++) {
            SuspeitoEntity suspeito = this.suspeitosDescobertos.get(i);
            
            System.out.printf("  SUSPEITO #%d: %s%n", (i + 1), suspeito.getNome());
            System.out.printf("    Descrição: %s%n", suspeito.getDescricao());
            System.out.println("  ---------------------------------------------");
        }
    }
    
    System.out.println("=================================================\n");
}
    
    // Você pode adicionar outras lógicas de negócio aqui, como:
    // public SuspeitoEntity buscarSuspeitoPorNome(String nome) { ... }
}