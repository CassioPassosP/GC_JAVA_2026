package spring_xml.service;

public class GCService implements IHelloService {

    public GCService() {
        System.out.println("Instancia criada!");
    }

    @Override
    public String hello() {
        return "Hello GC 26!";
    }
}
