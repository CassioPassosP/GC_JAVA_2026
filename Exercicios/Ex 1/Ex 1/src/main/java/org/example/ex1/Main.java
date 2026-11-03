package org.example.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome:");

        String name = scanner.nextLine();

        System.out.println("Seu nome e: " + name);

        scanner.close();
    }
}