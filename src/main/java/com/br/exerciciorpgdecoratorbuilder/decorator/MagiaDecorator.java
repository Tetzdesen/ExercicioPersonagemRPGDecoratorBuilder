package com.br.exerciciorpgdecoratorbuilder.decorator;

/**
 *
 * @author tetzner
 */
public final class MagiaDecorator extends PersonagemDecorator {

    private final Double duracao;

    public MagiaDecorator(Componente componenteDecorado, Double duracao) {
        super(componenteDecorado);
        this.duracao = duracao;
        if (componenteDecorado.getTipo().equalsIgnoreCase("Guerreiro")) {
            throw new IllegalArgumentException("Um guerreiro não pode utilizar magia");
        }
    }

    @Override
    public void definirItem(String nome, Double valor) {
        componenteDecorado.definirItem("Magia (duração: " + duracao + " segundos)", duracao);
    }

    @Override
    public String toString() {
        return componenteDecorado.toString();
    }

    @Override
    public String getTipo() {
        return "Magia Ancestral";
    }
}
