package spring_xml.controller;

import spring_xml.service.IHelloService;

public class HelloController {

    private IHelloService helloService;

    //o spring framework usa o set como construtor
    public void setHelloService(IHelloService helloService) {
        this.helloService = helloService;
    }

    public void execute(){
        System.out.println(helloService.hello());
    }
}
