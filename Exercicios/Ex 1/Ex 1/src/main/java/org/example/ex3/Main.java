package org.example.ex3;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> valoresInseridos = List.of();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira sua primeira pontuacao:");

        int primeiraPontuacao = scanner.nextInt();

        valoresInseridos.add(primeiraPontuacao);

        System.out.println("Insira sua segunda pontuacao:");

        int segundaPontuacao = scanner.nextInt();

        valoresInseridos.add(segundaPontuacao);

        System.out.println("Insira sua segunda pontuacao:");

        int terceiraPontuacao = scanner.nextInt();

        valoresInseridos.add(terceiraPontuacao);

        System.out.println("Sua primeira pontuacao e: " + primeiraPontuacao + "\n" +
                "Sua segunda pontuacao e: " + segundaPontuacao + "\n" +
                "Sua terceira pontuacao e: " + terceiraPontuacao);

        //System.out.println(getMaiorValor(valoresInseridos));

        scanner.close();
    }
}