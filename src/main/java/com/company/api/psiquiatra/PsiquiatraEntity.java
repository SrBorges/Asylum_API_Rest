package com.company.api.psiquiatra;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "psiquiatra")
@Entity(name = "PsiquiatraEntity")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class PsiquiatraEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NotNull @NotBlank
    private String nome;
    private String telefone;
    @NotNull @Email
    private String email;
    private String crm;
    @Embedded
    private Endereco endereco;


    public PsiquiatraEntity(PsiquiatraEntity json) {

        this.nome = json.nome;
        this.telefone = json.telefone;
        this.email = json.email;
        this.crm = json.crm;
        this.endereco = new Endereco(json.endereco);

    }

    public void updateInfo(PsiqUpdateDTO json) {

        if(json.nome() != null){
            this.nome = json.nome();
        }

        if(json.telefone() != null){
            this.telefone = json.telefone();
        }

        if(json.email() != null){
            this.email = json.email();
        }

        if(json.crm() != null){
            this.crm = json.crm();
        }

        if(json.endereco() != null){
            this.endereco.novoEndereco(endereco);
        }

    }
}
