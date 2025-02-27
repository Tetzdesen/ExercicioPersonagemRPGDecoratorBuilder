package com.br.exerciciorpgdecoratorbuilder.builder;

/**
 *
 * @author tetzner
 */
public class MagoBuilder extends PersonagemBuilder {

    public MagoBuilder(String nome) {
        super(nome);
    }

    @Override
    public void addClasse() {
        personagem.setClasse("Mago");
    }

    @Override
    public void addRaca() {
       personagem.setRaca("Elfo");
    }

    @Override
    public void addItem(String nome, Double valor) {
      personagem.definirItem(nome, valor);
    }
    
}
