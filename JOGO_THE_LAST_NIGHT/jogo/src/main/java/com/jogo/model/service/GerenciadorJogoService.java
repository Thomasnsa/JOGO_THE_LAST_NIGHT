package com.jogo.model.service;

import com.jogo.model.entity.PersonagemEntity;

public class GerenciadorJogoService {

    // O JOSH É UMA INSTÂNCIA DA ENTIDADE PERSONAGEM
    private PersonagemEntity josh; 
    
    public GerenciadorJogoService() {
        // Instanciação: O objeto 'josh' é criado aqui
        this.josh = new PersonagemEntity("Josh"); 
        
    }
    
    // Método para permitir que outras classes acessem o objeto Josh
    public PersonagemEntity getJosh() {
        return this.josh;
    }
    
    // Método que usa o objeto Josh
    public void aplicarPenaPorAtoIlegal() {
        // Regra de Negócio usando o método da Entidade Personagem:
        this.josh.aumentarSuspeita(1); 
    }

}
