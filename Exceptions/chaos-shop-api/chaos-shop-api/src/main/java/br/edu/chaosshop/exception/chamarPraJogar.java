package br.edu.chaosshop.exception;

public class chamarPraJogar extends RuntimeException {
    public chamarPraJogar(String message) {
        super("vai ter que me chamar pra jogar, ass: dono do sistema.");
    }
}
