package com.company.api.psicologo;

import com.company.api.psiquiatra.Endereco;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "psicologo")
@Entity(name = "PsicologoEntity")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")


public class PsicologoEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NotNull @NotBlank
    private String nome;
    private String telefone;
    @NotNull @Email
    private String email;
    private String crp;
    @Embedded
    private Endereco endereco;

    //SFVMKEHS AIFIV

    public PsicologoEntity(PsicologoEntity json) {

        this.nome = json.nome;
        this.telefone = json.telefone;
        this.email = json.email;
        this.crp = json.crp;
        this.endereco = new Endereco(json.endereco);

    }

    public void updateInfo(PsicUpdateDTO json) {

        if(json.nome() != null){
            this.nome = json.nome();
        }

        if(json.telefone() != null){
            this.telefone = json.telefone();
        }

        if(json.email() != null){
            this.email = json.email();
        }

        if(json.crp() != null){
            this.crp = json.crp();
        }

        if(json.endereco() != null){
            this.endereco.novoEndereco(endereco);
        }

    }
}
