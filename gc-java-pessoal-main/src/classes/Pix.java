package classes;

import interfaces.MetodoPagamento;

public class Pix implements MetodoPagamento {
    @Override
    public String Pagar() {
        return "Pagamento aprovado via Pix";
    }
}
