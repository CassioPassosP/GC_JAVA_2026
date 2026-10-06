package spring.java_puro.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.java_puro.entities.Pedido;
import spring.java_puro.respositories.PedidoRepository;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PedidoService {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private DescontoCategoriaService descontoCategoriaService;

    @Autowired
    private final PedidoRepository pedidoRepository;

    @Autowired
    private final INotificacaoService notificacaoService;

    public PedidoService(PedidoRepository pedidoRepository, INotificacaoService notificacaoService) {
        this.pedidoRepository = pedidoRepository;
        this.notificacaoService = notificacaoService;
    }

    public void criarPedidoComDesconto(Pedido pedido) throws IOException {
        pedidoRepository.salvar(pedido);
        notificacaoService.notificar(pedido);
    }

    public void criarPedido(Pedido pedido) throws IOException {
        pedidoRepository.salvar(pedido);
        notificacaoService.notificar(pedido);

    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.getPedidos();
    }

}
