package br.com.fiap.crud_entidade_cliente.cliente;

public record DadosListagemCliente(Long id, String nome, String email) {

    public DadosListagemCliente(Cliente cliente) {
        this(cliente.getId(), cliente.getNome(), cliente.getEmail());
    }

}
