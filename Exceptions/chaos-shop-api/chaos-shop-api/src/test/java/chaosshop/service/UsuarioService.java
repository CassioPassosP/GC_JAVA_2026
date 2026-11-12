package chaosshop.service;

import chaosshop.dto.CadastroRequest;
import chaosshop.exception.NomeDePalindromoException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private final List<String> usuarios = new ArrayList<>();

    public String cadastrar(CadastroRequest pedido) {

        if (pedido.nome() == null || pedido.nome().isBlank()) {
            throw new IllegalArgumentException("Informe o nome do usuário.");
        }
        if (pedido.senha() == null || pedido.senha().isBlank()) {
            throw new IllegalArgumentException("Informe a senha.");
        }

        String nome = pedido.nome().trim().toLowerCase();

        String invertido = new StringBuilder(nome).reverse().toString();
        if (nome.length() >= 3 && nome.equals(invertido)) {
            throw new NomeDePalindromoException(nome);
        }

        // ===== ESPAÇO PARA AS NOVAS REGRAS DO CAOS (Fase 2) =====
        // Ex: if (pedido.senha().length() < 8) { throw new SuaExcecaoException(); }
        // ========================================================

        usuarios.add(nome);
        return "Usuário '" + nome + "' cadastrado com sucesso!";
    }
}
