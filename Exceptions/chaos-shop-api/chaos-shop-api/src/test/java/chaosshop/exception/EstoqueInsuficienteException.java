package chaosshop.exception;

/**
 * Exceção CHECADA (checked): estende Exception, e não RuntimeException.
 * Por isso, quem chama um método que a declara com "throws"
 * é OBRIGADO pelo compilador a tratar (try-catch) ou repassar (throws).
 */
public class EstoqueInsuficienteException extends Exception {

    public EstoqueInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
