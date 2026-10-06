package spring_xml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spring_xml.service.IHelloService;

@Controller
public class HelloController {

    @Autowired
    private IHelloService helloService;

    //o spring framework usa o set para inserir o helloService no controller
    public void setHelloService(IHelloService helloService) {
        this.helloService = helloService;
    }

    public void execute(){
        System.out.println(helloService.hello());
    }
}
