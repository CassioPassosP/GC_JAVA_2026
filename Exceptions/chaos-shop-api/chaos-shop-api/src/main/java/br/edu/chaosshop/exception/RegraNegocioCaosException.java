package br.edu.chaosshop.exception;

/**
 * Classe base de TODAS as exceções do caos.
 *
 * Estende RuntimeException, ou seja, é uma exceção NÃO CHECADA (unchecked):
 * o compilador não obriga ninguém a usar try-catch ou "throws".
 *
 * Cada exceção filha precisa informar:
 *  - um código único (ex: "CAOS-001")
 *  - uma mensagem irônica
 */
public class RegraNegocioCaosException extends RuntimeException {

    private final String codigo;

    public RegraNegocioCaosException(String codigo, String mensagem) {
        super(mensagem);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
