package org.example.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira sua primeira pontuacao:");

        int primeiraPontuacao = scanner.nextInt();

        System.out.println("Insira sua segunda pontuacao:");

        int segundaPontuacao = scanner.nextInt();

        System.out.println("Sua primeira pontuacao e: " + primeiraPontuacao + "\n" + "Sua segunda pontuacao e: " + segundaPontuacao);

        scanner.close();
    }
}