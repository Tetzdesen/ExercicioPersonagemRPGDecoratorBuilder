package com.br.exerciciorpgdecoratorbuilder.builder;

import com.br.exerciciorpgdecoratorbuilder.model.Personagem;

/**
 *
 * @author tetzner
 */
public abstract class PersonagemBuilder {

    protected Personagem personagem;

    public PersonagemBuilder(String nome) {
        this.personagem = new Personagem(nome);
    }

    public abstract void addClasse();

    public abstract void addRaca();

    public final void addNivel() {
        // usar chain para calcular base
        personagem.setNivel(1);
     //   personagem.setNivel(new NivelBasicoHandler());
    }

    public abstract void addItem(String nome, Double valor);

    public final Personagem getPersonagem() {
        return personagem;
    }

}
