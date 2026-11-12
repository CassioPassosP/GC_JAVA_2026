package br.edu.chaosshop.dto;

// Corpo esperado no POST /api/loja/checkout
// Exemplo: { "produto": "caneta", "quantidade": 2 }
public record CheckoutRequest(String produto, Integer quantidade) {
}
