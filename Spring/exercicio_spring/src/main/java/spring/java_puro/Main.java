package spring.java_puro;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.java_puro.controller.PedidoController;
import spring.java_puro.respositories.PedidoRepository;
import spring.java_puro.services.EmailNotificacaoService;
import spring.java_puro.services.NotificacaoService;
import spring.java_puro.services.PedidoService;

public class Main {
    public static void main(String[] args) {



//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        PedidoController pedidoController = (PedidoController) context.getBean("pedidoController");
        //pedidoController.criarPedido();



//        PedidoRepository repository =
//                new PedidoRepository();
//
//        NotificacaoService notificacao =
//                new EmailNotificacaoService();
//
//        PedidoService pedidoService =
//                new PedidoService(
//                        repository,
//                        notificacao
//                );
//
//
//        PedidoController pedidoController = new PedidoController(pedidoService);
//
//        pedidoController.criarPedido(123, "Notebook","Informática",500);
//        pedidoController.listarPedidos();
    }
}
