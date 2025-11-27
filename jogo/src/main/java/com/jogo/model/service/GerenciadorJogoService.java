package com.jogo.model.service;

import com.jogo.model.entity.PersonagemEntity;

public class GerenciadorJogoService {

    // O JOSH É UMA INSTÂNCIA DA ENTIDADE PERSONAGEM
    private PersonagemEntity josh; 
    
    public GerenciadorJogoService() {
        // CORREÇÃO: Inicialize o objeto JOSH aqui no CONSTRUTOR.
        // O objeto só é criado uma vez!
        this.josh = new PersonagemEntity("Josh"); 
    }
    
    // Método para permitir que outras classes acessem o objeto Josh
   // public PersonagemEntity getJosh() {
        // APENAS RETORNE O OBJETO JÁ CRIADO, não o crie novamente.
       // return this.josh; 
    //}
    
    // Método que usa o objeto Josh
    public void aplicarPenaPorAtoIlegal() {
        // Regra de Negócio: Usa o 'josh' que foi criado no construtor
        this.josh.aumentarSuspeita(1); 
    }

    public void consultarNivelSuspeita() {
        int nivelSuspeita = this.josh.getNivelSuspeita();

        System.out.println("\n------------------------------------");
        System.out.println("     🚨 NÍVEL DE SUSPEITA DE JOSH 🚨");
        System.out.println("------------------------------------");
        System.out.println("Quantidade atual: " + nivelSuspeita + "/3");
    }
    
    

}