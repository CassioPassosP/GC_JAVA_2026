package spring_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import spring_xml.controller.HelloController;
import spring_xml.service.GCService;
import spring_xml.service.IHelloService;
import spring_xml.service.ResidenciaService;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("exemplo_annotation") // scaneia automaticamente classes que precisam ser gerenciaveis pelo spring
public class BeanConfig {

//    @Bean
//    public HelloController helloController(IHelloService gcService){
//        return new HelloController();
//    }
//
//    @Bean
//    @Primary // prioriza esse bean
//    public IHelloService gcService(){
//        return new GCService();
//    }
//
//    @Bean
//    public IHelloService residenciaService(){
//        return new ResidenciaService();
//    }

}
