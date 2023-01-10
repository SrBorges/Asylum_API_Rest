package com.company.api.pacientes;

import com.company.api.psiquiatra.Endereco;
import jakarta.validation.constraints.NotNull;

public record PacienteDTO(
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

    public PacienteDTO(PacienteEntity json){

        this(
                json.getId(),
                json.getNome(),
                json.getTelefone(),
                json.getNivel(),
                json.getCondicao(),
                json.getEncaminhado(),
                json.getTratamento(),
                json.getMedicacao(),
                json.getEndereco());

    }

}
