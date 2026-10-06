package spring.java_puro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.java_puro.respositories.PedidoRepository;
import spring.java_puro.services.DescontoCategoriaService;
import spring.java_puro.services.EmailNotificacaoService;
import spring.java_puro.services.PedidoService;

@Configuration
public class BeanConfig {

    @Bean
    public PedidoRepository pedidoRepository() {
        return new PedidoRepository();
    }

    @Bean
    public DescontoCategoriaService descontoCategoriaService(){
        return new DescontoCategoriaService();
    }

//    @Bean
//    public PedidoService pedidoService() {
//        PedidoService pedidoServiceervice = new PedidoService();
//        EmailNotificacaoService emailNotificacaoService = new EmailNotificacaoService();
//        service.setPedidoService(pedidoRepository());
//
//        return service;
//    }
}
