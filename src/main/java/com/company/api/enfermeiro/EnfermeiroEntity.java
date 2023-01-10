package com.company.api.enfermeiro;

import com.company.api.psiquiatra.Endereco;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "enfermeiro")
@Entity(name = "EnfermeiroEntity")


@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")


public class EnfermeiroEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NotNull @NotBlank
    private String nome;
    private String telefone;
    @NotNull @Email
    private String email;
    private String coren;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;


    public EnfermeiroEntity(EnfermeiroEntity json) {

        this.nome = json.nome;
        this.telefone = json.telefone;
        this.email = json.email;
        this.coren = json.coren;
        this.especialidade = json.especialidade;
        this.endereco = new Endereco(json.endereco);

    }

    public void updateInfo(EnfUpdateDTO json) {

        if(json.nome() != null){
            this.nome = json.nome();
        }

        if(json.telefone() != null){
            this.telefone = json.telefone();
        }

        if(json.email() != null){
            this.email = json.email();
        }

        if(json.coren() != null){
            this.coren = json.coren();
        }

        if(json.especialidade() != null){
            this.especialidade = json.especialidade();
        }

        if(json.endereco() != null){
            this.endereco.novoEndereco(endereco);
        }

    }
}
