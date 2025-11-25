package com.jogo.model.entity;

public class PersonagemEntity {
    
        // ATRIBUTOS (O QUÊ a entidade armazena)
        private String nome;
        private int nivelSuspeita; // Ex: 0 (inicial) a 10 (máximo)
        
        // Construtor para inicializar o objeto
        public PersonagemEntity(String nome) {
            this.nome = nome;
            this.nivelSuspeita = 0; // Suspeita sempre começa em zero
        }
        
        // MÉTODO DE LÓGICA BÁSICA (Regra de Negócio que pertence à Entidade)
        public void aumentarSuspeita(int pontos) {
            // Garantindo que a suspeita não passe de 3
            this.nivelSuspeita = Math.min(this.nivelSuspeita + pontos, 3);
        }
        
        // Getters para que o Controller e Services possam ler o estado
        public String getNome() {
            return nome;
        }
    
        public int getNivelSuspeita() {
            return nivelSuspeita;
        }
}
