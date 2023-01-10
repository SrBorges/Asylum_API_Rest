package com.company.api.pacientes;

import com.company.api.psiquiatra.Endereco;
import jakarta.validation.constraints.NotNull;

public record PacUpdateDTO(

        @NotNull Long id,
        String nome,
        String telefone,
        String nivel,
        String condicao,
        Encaminhado encaminhado,
        Tratamento tratamento,
        Medicacao medicacao,
        Endereco endereco

) {
}
