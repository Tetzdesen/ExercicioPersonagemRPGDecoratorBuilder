package com.br.exerciciorpgdecoratorbuilder.decorator;

import com.br.exerciciorpgdecoratorbuilder.builder.MagoBuilder;

/**
 *
 * @author tetzner
 */
public class ArmaduraDecorator extends PersonagemDecorator {

    public ArmaduraDecorator(Componente componenteDecorado) {
        super(componenteDecorado);
        if (componenteDecorado.getTipo().equalsIgnoreCase("Mago")) {
            throw new IllegalArgumentException("Um mago não pode receber uma armadura");
        }
    }

    @Override
    public void definirItem(String nome, Double valor) {
        componenteDecorado.definirItem(nome, valor);
    }

    @Override
    public String toString() {
        return componenteDecorado.toString();
    }

    @Override
    public String getTipo() {
        return "Armadura dos Deuses";
    }

}
