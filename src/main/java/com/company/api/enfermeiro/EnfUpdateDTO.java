package com.company.api.enfermeiro;

import com.company.api.psiquiatra.Endereco;
import jakarta.validation.constraints.NotNull;

public record EnfUpdateDTO(@NotNull Long id, String nome, String telefone, String email, String coren, Especialidade especialidade, Endereco endereco) {


}
