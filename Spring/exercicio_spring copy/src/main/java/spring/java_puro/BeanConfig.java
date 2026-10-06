package spring.java_puro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import spring.java_puro.controller.PedidoController;
import spring.java_puro.respositories.PedidoRepository;
import spring.java_puro.services.*;

@Configuration
@PropertySource("classpath:config.properties")
public class BeanConfig {

    @Bean
    public PedidoRepository pedidoRepository() {
        return new PedidoRepository();
    }

    @Bean
    public ICalculadoraDescontoService descontoCategoriaService(){
        return new DescontoCategoriaService();
    }

    @Bean
    public PedidoService pedidoService(PedidoRepository pedidoRepository, INotificacaoService NotificacaoService){
        return new PedidoService(pedidoRepository, NotificacaoService);
    }

    @Bean
    public PedidoController pedidoController(){
        return new PedidoController();
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

}
