package chaosshop.service;

import chaosshop.dto.CheckoutRequest;
import chaosshop.estoque.Estoque;
import chaosshop.exception.*;
import org.springframework.stereotype.Service;

@Service
public class LojaService {

    private final Estoque estoque;

    public LojaService(Estoque estoque) {
        this.estoque = estoque;
    }

    public String fazerCheckout(CheckoutRequest pedido) {

        if (pedido.produto() == null || pedido.produto().isBlank()) {
            throw new IllegalArgumentException("Informe o nome do produto.");
        }
        if (pedido.quantidade() == null || pedido.quantidade() <= 0) {
            throw new IllegalArgumentException("A quantidade precisa ser maior que zero.");
        }

        String produto = pedido.produto().trim().toLowerCase();
        int quantidade = pedido.quantidade();

        if (quantidade == 3) {
            throw new TresItensException();
        }

        // ===== ESPAÇO PARA AS NOVAS REGRAS DO CAOS (Fase 2) =====
        // Ex: if (produto.equals("peixe")) { throw new SuaExcecaoException(); }
        // ========================================================

        if (produto.equals("playstation 5")) {
            throw new gta6Exception("FAULT01", "VOCE VAI FICAR SEM GRANA PARA O GTA");
        }

        try {
            estoque.reservar(produto, quantidade);
        } catch (chamarPraJogar | EstoqueInsuficienteException e) {
            throw new RegraNegocioCaosException("FAULT02", e.getMessage());
        }

        try {
            estoque.reservar(produto, quantidade);
        } catch (EstoqueInsuficienteException e) {
            throw new RegraNegocioCaosException("CAOS-003", e.getMessage());
        }

        return "Compra aprovada: " + quantidade + "x " + produto + ". Volte sempre!";
    }
}
