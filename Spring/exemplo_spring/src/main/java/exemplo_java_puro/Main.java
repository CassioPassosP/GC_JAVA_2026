package exemplo_java_puro;

import exemplo_java_puro.controller.HelloController;
import exemplo_java_puro.service.GCService;
import exemplo_java_puro.service.IHelloService;

public class Main {
    public static void main(String[] args) {
        IHelloService helloService = new GCService();
        HelloController controller = new HelloController(helloService);

        controller.execute();
    }
}
