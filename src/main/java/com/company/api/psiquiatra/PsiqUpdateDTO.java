package com.company.api.psiquiatra;

import jakarta.validation.constraints.NotNull;

public record PsiqUpdateDTO(@NotNull Long id, String nome, String telefone, String email, String crm, Endereco endereco) {

}
