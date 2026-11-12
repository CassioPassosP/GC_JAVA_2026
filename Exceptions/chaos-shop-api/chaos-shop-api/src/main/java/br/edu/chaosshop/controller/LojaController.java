package br.edu.chaosshop.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.chaosshop.dto.CheckoutRequest;
import br.edu.chaosshop.service.LojaService;

@RestController
@RequestMapping("/api/loja")
public class LojaController {

    private final LojaService lojaService;

    public LojaController(LojaService lojaService) {
        this.lojaService = lojaService;
    }

    @PostMapping("/checkout")
    public Map<String, String> checkout(@RequestBody CheckoutRequest pedido) {
        String resultado = lojaService.fazerCheckout(pedido);
        return Map.of("mensagem", resultado);
    }
}
