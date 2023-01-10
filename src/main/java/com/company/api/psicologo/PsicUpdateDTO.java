package com.company.api.psicologo;

import com.company.api.psiquiatra.Endereco;
import jakarta.validation.constraints.NotNull;

public record PsicUpdateDTO(@NotNull Long id, String nome, String telefone, String email, String crp, Endereco endereco) {


}
