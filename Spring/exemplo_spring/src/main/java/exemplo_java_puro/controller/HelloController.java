package exemplo_java_puro.controller;

import exemplo_java_puro.service.IHelloService;

public class HelloController {

    private IHelloService helloService;

    public HelloController(IHelloService helloService) {
        this.helloService = helloService;
    }

    public void execute(){
        System.out.println(helloService.hello());
    }
}
