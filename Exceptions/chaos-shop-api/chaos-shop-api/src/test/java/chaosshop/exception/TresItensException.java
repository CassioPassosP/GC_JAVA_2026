package chaosshop.exception;

/** Exceção de exemplo: filha da RegraNegocioCaosException. */
public class TresItensException extends RegraNegocioCaosException {

    public TresItensException() {
        super("CAOS-001", "Três é demais! O sistema aceita 1, 2, 4... mas três? Jamais.");
    }
}
