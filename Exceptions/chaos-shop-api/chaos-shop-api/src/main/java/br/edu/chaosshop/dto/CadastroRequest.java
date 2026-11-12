package br.edu.chaosshop.dto;

// Corpo esperado no POST /api/usuarios/cadastrar
// Exemplo: { "nome": "maria", "senha": "abc12345" }
public record CadastroRequest(String nome, String senha) {
}
