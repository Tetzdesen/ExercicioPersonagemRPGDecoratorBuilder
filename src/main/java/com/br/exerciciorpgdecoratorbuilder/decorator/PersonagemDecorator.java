package com.br.exerciciorpgdecoratorbuilder.decorator;

/**
 *
 * @author tetzner
 */
public abstract class PersonagemDecorator implements Componente{
    protected Componente componenteDecorado;

    public PersonagemDecorator(Componente componenteDecorado) {
        this.componenteDecorado = componenteDecorado;
    }
    
}