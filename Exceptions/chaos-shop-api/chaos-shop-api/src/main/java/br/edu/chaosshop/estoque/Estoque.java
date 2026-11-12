package br.edu.chaosshop.estoque;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.edu.chaosshop.exception.EstoqueInsuficienteException;

@Component
public class Estoque {

    private final Map<String, Integer> itens = new HashMap<>();

    public Estoque() {
        itens.put("caneta", 10);
        itens.put("caderno", 5);
        itens.put("mochila", 2);
        itens.put("cafe", 20);
    }


    public void reservar(String produto, int quantidade) throws EstoqueInsuficienteException {
        Integer disponivel = itens.get(produto);

        if (disponivel == null) {
            throw new EstoqueInsuficienteException("O produto '" + produto + "' não existe nesta loja.");
        }
        if (quantidade > disponivel) {
            throw new EstoqueInsuficienteException(
                    "Só temos " + disponivel + " unidade(s) de '" + produto + "'. Você pediu " + quantidade + ".");
        }

        itens.put(produto, disponivel - quantidade);
    }
}
