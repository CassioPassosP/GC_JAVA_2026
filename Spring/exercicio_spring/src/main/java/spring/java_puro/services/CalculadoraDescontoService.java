package spring.java_puro.services;

import spring.java_puro.entities.Pedido;

import java.io.IOException;

public interface CalculadoraDescontoService {
    int calcular(Pedido pedido) throws IOException;
}
