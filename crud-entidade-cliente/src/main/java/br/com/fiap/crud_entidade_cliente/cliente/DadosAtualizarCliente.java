package br.com.fiap.crud_entidade_cliente.cliente;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record DadosAtualizarCliente(
        @NotBlank
        @Size(min = 3, max = 100)
        String nome,

        @NotBlank
        @Column(unique = true)
        String email,

        @Size(max = 20)
        String telefone, Long id) {


}