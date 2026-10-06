package spring.java_puro.services;

import spring.java_puro.entities.Pedido;

import java.io.IOException;

public interface ICalculadoraDescontoService {
    double calcular(double valorPedido) throws IOException;
}
