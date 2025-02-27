package com.br.exerciciorpgdecoratorbuilder.builder;

import com.br.exerciciorpgdecoratorbuilder.model.Personagem;

/**
 *
 * @author tetzner
 */
public class Diretor {
    
    public static Personagem build(PersonagemBuilder personagemBuilder){
        personagemBuilder.addClasse();
        personagemBuilder.addRaca();
        personagemBuilder.addNivel();
        return personagemBuilder.getPersonagem();
    }
}
