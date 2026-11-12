package chaosshop.controller;

import chaosshop.dto.CadastroRequest;
import chaosshop.service.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/cadastrar")
    public Map<String, String> cadastrar(@RequestBody CadastroRequest pedido) {
        String resultado = usuarioService.cadastrar(pedido);
        return Map.of("mensagem", resultado);
    }
}
