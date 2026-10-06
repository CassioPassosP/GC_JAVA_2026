package spring.java_puro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.java_puro.controller.PedidoController;
import spring.java_puro.entities.Pedido;
import spring.java_puro.entities.Produto;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Produto carro = new Produto("Carro","Automovel");

        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        PedidoController pedidoController =
                context.getBean(PedidoController.class);

        pedidoController.criarPedido(10,"Carro hb20", "Automovel", 60000);

        pedidoController.criarPedido(11,"Carro sandero", "Automovel", 40000);

        //pedidoController.aplicarDesconto();
    }
}
