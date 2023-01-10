package com.company.api.psiquiatra;

import jakarta.validation.constraints.NotNull;

public record PsiquiatraDTO(@NotNull Long id, String nome, String telefone, String email, String crm, Endereco endereco) {

    public PsiquiatraDTO(PsiquiatraEntity json){

        this(json.getId(), json.getNome(), json.getTelefone(), json.getEmail(), json.getCrm(), json.getEndereco());

    }

}
