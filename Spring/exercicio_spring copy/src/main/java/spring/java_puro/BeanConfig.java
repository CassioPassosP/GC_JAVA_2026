package spring.java_puro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import spring.java_puro.respositories.PedidoRepository;
import spring.java_puro.services.*;

@Configuration
public class BeanConfig {

//    @Bean
//    public PedidoService pedidoService(){
//        return new PedidoService();
//    }

    @Bean
    public PedidoRepository pedidoRepository() {
        return new PedidoRepository();
    }

    @Bean
    @Primary
    public INotificacaoService emailNotificacaoService(){
        return new EmailNotificacaoService();
    }

    @Bean
    public INotificacaoService smsNotificacaoService(){
        return new SmsNotificacaoService();
    }
    @Bean
    public ICalculadoraDescontoService descontoCategoriaService(){
        return new DescontoCategoriaService();
    }

//    @Bean
//    public PedidoService pedidoService() {
//        PedidoService pedidoServiceervice = new PedidoService(pedidoRepository, emailNotificacaoService);
//        EmailNotificacaoService emailNotificacaoService = new EmailNotificacaoService();
//        pedidoServiceervice.setPedidoService(pedidoRepository());
//
//        return service;
//    }
}
