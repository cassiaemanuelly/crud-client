package br.com.fiap.crud_entidade_cliente.cliente;

public record DadosDetalhamentoCliente(
        Long id,
        String nome,
        String cpf,
        String email,
        String telefone
) {

    public DadosDetalhamentoCliente(Cliente cliente) {
        this(cliente.getId(), cliente.getNome(), cliente.getCpf(), cliente.getEmail(), cliente.getTelefone());
    }
}
