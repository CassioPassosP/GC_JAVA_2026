package spring.java_puro.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import spring.java_puro.entities.Pedido;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class DescontoCategoriaService implements CalculadoraDescontoService{

    @Value("${arquivo.externo.caminho}")
    private String caminhoArquivo;

    public Double lerComoDouble() throws IOException {
        Path path = Paths.get(caminhoArquivo);
        // Lê todo o conteúdo do arquivo como uma String
        String conteudo = Files.readString(path);

        // retorna em double
        return Double.parseDouble(conteudo);
    }

    @Override
    public int calcular(Pedido pedido) throws IOException {
        int valorProduto = pedido.getPreco();
        double valorProdutoComDesconto = valorProduto - (valorProduto * lerComoDouble());
        return (int) valorProdutoComDesconto;
    }
}
