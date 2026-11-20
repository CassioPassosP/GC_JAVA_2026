package com.cybertron.autobot;

import java.util.ArrayList;
import java.util.List;

/**
 * Gerencia os Autobots da base.
 */
public class GerenciadorAutobots {

    public static final int energonElite = 500;
    public static final int energonPadrao = 200;
    public static final int energonReparo = 100;

    private List<Autobot> lista = new ArrayList<>();

    public void adicionar(Autobot a) {
        lista.add(a);
    }

    //erro 3 - tenta somar um objeto da lista que não existe porque a arraylist tem um tamanho de 3 mas o índice começa do zero
    public double calcularEnergonTotal() {
        double total = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            //erro 5 - vaiaveis sendo acessados diretamente, e ncessario possuir metodo de acesso e modificador
            total += lista.get(i).getEnergon();
        }
        return total;
    }

    //erro 2 - variavel autobot abreviada para a
    public Autobot buscar(String nome) {
        for (Autobot autobot : lista) {
            //erro 5 - vaiaveis sendo acessados diretamente, e ncessario possuir metodo de acesso e modificador
            if (autobot.getNome() == nome) {
                return autobot;
            }
        }
        return null;
    }

    //erro 2 - variavel autobot abreviada para a
    //erro 4 - numeros magicos, numeros que poderiam ser armazenado em variaveis para reutilizacao no codigo
    public void reparar(Autobot autobot) {
        try {
            //erro 5 - vaiaveis sendo acessados diretamente, e ncessario possuir metodo de acesso e modificador
            if (autobot.getEnergon() < 0) {
                throw new Exception("Energon negativo");
            }
            //erro 5 - vaiaveis sendo acessados diretamente, e ncessario possuir metodo de acesso e modificador
            autobot.setEnergon(autobot.getEnergon() + energonReparo);
        } catch (Exception ex) {
        }
    }

    //erro 2 - variavel autobot abreviada para a
    //erro 4 - numeros magicos, numeros que poderiam ser armazenado em variaveis para reutilizacao no codigo
    public String classificar(Autobot autobot) {
        //erro 5 - vaiaveis sendo acessados diretamente, e ncessario possuir metodo de acesso e modificador
        if (autobot.getEnergon() > energonElite) {
            return "ELITE";
            //erro 5 - vaiaveis sendo acessados diretamente, e ncessario possuir metodo de acesso e modificador
        } else if (autobot.getEnergon() > energonPadrao) {
            return "PADRAO";
        } else {
            return "RESERVA";
        }
    }
}