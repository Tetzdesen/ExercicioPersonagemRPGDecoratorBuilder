package com.br.exerciciorpgdecoratorbuilder.builder;

/**
 *
 * @author tetzner
 */
public class GuerreiroBuilder extends PersonagemBuilder {

    public GuerreiroBuilder(String nome) {
        super(nome);
    }

    @Override
    public void addClasse() {
       personagem.setClasse("Guerreiro");
    }

    @Override
    public void addRaca() {
        personagem.setRaca("Humano");
    }

    @Override
    public void addItem(String nome, Double valor) {
        personagem.definirItem(nome, valor);
    }
    
}
