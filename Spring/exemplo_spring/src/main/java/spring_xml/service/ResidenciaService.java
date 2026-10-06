package spring_xml.service;

import org.springframework.stereotype.Service;

@Service
public class ResidenciaService implements IHelloService {
    @Override
    public String hello() {
        return "Hello FS!";
    }
}
