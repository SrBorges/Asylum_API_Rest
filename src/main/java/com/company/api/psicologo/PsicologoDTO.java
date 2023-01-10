package com.company.api.psicologo;

import com.company.api.psiquiatra.Endereco;
import jakarta.validation.constraints.NotNull;

public record PsicologoDTO(@NotNull Long id, String nome, String telefone, String email, String crp, Endereco endereco) {

    public PsicologoDTO(PsicologoEntity json){

        this(json.getId(), json.getNome(), json.getTelefone(), json.getEmail(), json.getCrp(), json.getEndereco());

    }

}
