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
    private String caminhoArquivo;

    public Double lerComoDouble() throws IOException {
        Path path = Paths.get(caminhoArquivo);
        // Lê todo o conteúdo do arquivo como uma String
        String conteudo = Files.readString(path);

        // retorna em double
        return Double.parseDouble(conteudo);
    }

    @Override
    public double calcular(double valorPedido) throws IOException {
        return valorPedido * lerComoDouble();
    }
}
