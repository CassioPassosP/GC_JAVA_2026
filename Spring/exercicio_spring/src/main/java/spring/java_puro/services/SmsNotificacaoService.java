package spring.java_puro.services;

import org.springframework.stereotype.Service;
import spring.java_puro.entities.Pedido;

@Service
public class SmsNotificacaoService implements NotificacaoService{
    @Override
    public void notificar(Pedido pedido) {
        System.out.println("Notificando pedido via sms...");
    }
}
