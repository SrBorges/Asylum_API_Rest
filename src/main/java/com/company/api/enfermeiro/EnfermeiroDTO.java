package com.company.api.enfermeiro;

import com.company.api.psiquiatra.Endereco;
import jakarta.validation.constraints.NotNull;

public record EnfermeiroDTO(@NotNull Long id, String nome, String telefone, String email, String coren, Especialidade especialidade, Endereco endereco) {

    public EnfermeiroDTO(EnfermeiroEntity json){

        this(json.getId(), json.getNome(), json.getTelefone(), json.getEmail(), json.getCoren(), json.getEspecialidade(), json.getEndereco());

    }

}
