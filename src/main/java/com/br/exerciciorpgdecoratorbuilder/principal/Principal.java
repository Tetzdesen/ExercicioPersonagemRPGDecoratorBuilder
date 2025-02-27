package com.br.exerciciorpgdecoratorbuilder.principal;

import com.br.exerciciorpgdecoratorbuilder.builder.Diretor;
import com.br.exerciciorpgdecoratorbuilder.builder.MagoBuilder;
import com.br.exerciciorpgdecoratorbuilder.decorator.Componente;
import com.br.exerciciorpgdecoratorbuilder.decorator.ArmaduraDecorator;

/**
 *
 * @author tetzner
 */
public class Principal {

    public static void main(String[] args) {
       Componente mago = Diretor.build(new MagoBuilder("kaua mago"));

       mago = new ArmaduraDecorator(mago);
       mago.definirItem("Armadura", 15.0);
       System.out.println(mago);
    }
}
