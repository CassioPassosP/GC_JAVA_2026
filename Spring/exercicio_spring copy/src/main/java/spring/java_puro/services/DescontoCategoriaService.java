package spring.java_puro.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import spring.java_puro.entities.Pedido;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class DescontoCategoriaService implements ICalculadoraDescontoService {

    @Value("${desconto.percentual}")
    private double desconto;

    @Override
    public double calcular(double valorPedido) throws IOException {
        return valorPedido * desconto;
    }

}
