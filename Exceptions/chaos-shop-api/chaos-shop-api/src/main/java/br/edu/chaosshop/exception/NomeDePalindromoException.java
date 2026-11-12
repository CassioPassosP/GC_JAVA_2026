package br.edu.chaosshop.exception;

/** Exceção de exemplo: filha da RegraNegocioCaosException. */
public class NomeDePalindromoException extends RegraNegocioCaosException {

    public NomeDePalindromoException(String nome) {
        super("CAOS-002", "O nome '" + nome + "' é igual de trás pra frente. Suspeito demais, tente outro.");
    }
}
