package spring.java_puro.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.java_puro.entities.Pedido;
import spring.java_puro.respositories.PedidoRepository;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private DescontoCategoriaService descontoCategoriaService;

    @Autowired
    private final PedidoRepository pedidoRepository;

    @Autowired
    private final NotificacaoService notificacaoService;

    public PedidoService(PedidoRepository pedidoRepository, NotificacaoService notificacaoService) {
        this.pedidoRepository = pedidoRepository;
        this.notificacaoService = notificacaoService;
    }

    //o spring framework usa o set para inserir no controller
    public void setDescontoCategoriaService(DescontoCategoriaService descontoCategoriaService) {
        this.descontoCategoriaService = descontoCategoriaService;
    }

    //o spring framework usa o set para inserir no controller
    public void setPedidoService(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    public void criarPedido(Pedido pedido) {
        pedidoRepository.salvar(pedido);
        notificacaoService.notificar(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.getPedidos();
    }
}
