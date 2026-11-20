package com.cybertron.autobot;

/**
 * Representa um Autobot da base.
 */
public class Autobot {

    //erro 5 - vaiaveis sendo acessados diretamente, e ncessario possuir metodo de acesso e modificador
    private String nome;
    private double energon;
    private int nivel;

    //erro 1 - nome e energon abreviados para n e e
    public Autobot(String nome, double energon, int nivel) {
        this.nome = nome;
        this.energon = energon;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getEnergon() {
        return energon;
    }

    public void setEnergon(double energon) {
        this.energon = energon;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}