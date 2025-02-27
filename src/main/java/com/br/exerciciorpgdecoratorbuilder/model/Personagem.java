package com.br.exerciciorpgdecoratorbuilder.model;

import com.br.exerciciorpgdecoratorbuilder.decorator.Componente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tetzner
 */
public class Personagem implements Componente {

    private final String nome;
    private String classe;
    private String raca;
    private int nivel;
    private Map<String, Double> itens;

    public Personagem(String nome) {
        this.nome = nome;
        this.itens = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public String getRaca() {
        return raca;
    }

    public int getNivel() {
        return nivel;
    }

    public Map<String, Double> getItens() {
        return itens;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    // setNivel pode receber uma chain
    public void setNivel(int nivel) {
        if (nivel < 1) {
            throw new IllegalArgumentException("O nível deve ser maior ou igual a 1");
        }
        this.nivel = nivel;
    }

    @Override
    public void definirItem(String nome, Double valor) {
        itens.put(nome, valor);
    }

    @Override
    public String toString() {
        return "Personagem [nome=" + nome + ", classe=" + classe + ", raca=" + raca + ", nivel=" + nivel + ", itens="
                + itens + "]";
    }

    @Override
    public String getTipo() {
        return classe;
    }

}
