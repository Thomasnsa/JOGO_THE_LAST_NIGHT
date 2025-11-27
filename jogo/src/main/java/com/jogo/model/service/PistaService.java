package com.jogo.model.service;

import com.jogo.model.entity.PistaEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Gerencia o inventário de Pistas do jogador.
 */
public class PistaService {

    private final List<PistaEntity> pistasEncontradas;

    public PistaService() {
        this.pistasEncontradas = new ArrayList<>();
    }

    /**
     * Adiciona uma nova Pista ao inventário, checando por duplicatas pelo ID.
     */
    public boolean adicionarPista(PistaEntity novaPista) {
        // Checa se o ID já está na lista
        if (pistasEncontradas.stream().anyMatch(p -> p.getId().equals(novaPista.getId()))) {
            return false;
        }

        this.pistasEncontradas.add(novaPista);
        return true;
    }

    /**
     * Retorna a lista imutável de todas as pistas encontradas.
     */
    public void getPistasEncontradas() {
    
    // 1. IMPRIME A LISTA (Executado ANTES do retorno)
    System.out.println("\n====================================");
    System.out.println("      📜 PISTAS ENCONTRADAS 📜");
    System.out.println("====================================");
    
    if (pistasEncontradas.isEmpty()) {
        System.out.println("Nenhuma pista encontrada.");
    } else {
        // Itera sobre a lista para mostrar cada pista
        for (int i = 0; i < pistasEncontradas.size(); i++) {
            PistaEntity pista = pistasEncontradas.get(i);
            
            // Acessa os Getters da Entidade
            System.out.printf("%d. [%s] %s: %s%n", 
                i + 1, 
                pista.getId(), 
                pista.getNome(), 
                pista.getDescricao());
        }
    }
    System.out.println("====================================\n");
    
    // 2. RETORNA A LISTA (A execução do método termina aqui)
    //return Collections.unmodifiableList(pistasEncontradas);
}

    
}