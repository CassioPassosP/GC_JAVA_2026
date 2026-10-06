package spring.java_puro.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spring.java_puro.entities.Pedido;
import spring.java_puro.entities.Produto;
import spring.java_puro.services.DescontoCategoriaService;
import spring.java_puro.services.PedidoService;

import java.io.IOException;

@Controller
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private DescontoCategoriaService descontoCategoriaService;

    public void criarPedido(int numPedido, String nome, String categoria,int preco) throws IOException {
        pedidoService.criarPedido(new Pedido(numPedido, new Produto(nome, categoria), preco));
    }

    public void listarPedidos(){
        System.out.println(pedidoService.listarPedidos());
    }

    //o spring framework usa o set para inserir no controller
    public void setDescontoCategoriaService(DescontoCategoriaService descontoCategoriaService) {
        this.descontoCategoriaService = descontoCategoriaService;
    }

    //o spring framework usa o set para inserir no controller
    public void setPedidoService(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    public void aplicarDesconto(Pedido pedido) throws IOException {
        pedido.setPreco(descontoCategoriaService.calcular(pedido.getPreco()));
        System.out.println(pedido.getPreco());
    }
}
