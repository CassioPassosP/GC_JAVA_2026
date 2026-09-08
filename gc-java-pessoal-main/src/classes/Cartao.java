package classes;

import interfaces.MetodoPagamento;

public class Cartao implements MetodoPagamento {
    @Override
    public String Pagar() {
        return "Pagamento aprovado via Cartao";
    }
}
