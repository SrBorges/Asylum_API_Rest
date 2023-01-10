package com.company.api.pacientes;

import com.company.api.psiquiatra.Endereco;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "pacientes")
@Entity(name = "PacienteEntity")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")


public class PacienteEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NotNull @NotBlank
    private String nome;
    private String telefone;
    private String nivel;
    private String condicao;
    @Enumerated(EnumType.STRING)
    private Encaminhado encaminhado;
    @Enumerated(EnumType.STRING)
    private Tratamento tratamento;
    @Enumerated(EnumType.STRING)
    private Medicacao medicacao;
    @Embedded
    private Endereco endereco;


    public PacienteEntity(PacienteEntity json) {

        this.nome = json.nome;
        this.telefone = json.telefone;
        this.nivel = json.nivel;
        this.condicao = json.condicao;
        this.encaminhado = json.encaminhado;
        this.tratamento = json.tratamento;
        this.medicacao = json.medicacao;
        this.endereco = new Endereco(json.endereco);

    }

    public void updateInfo(PacUpdateDTO json) {

        if(json.nome() != null){
            this.nome = json.nome();
        }

        if(json.telefone() != null){
            this.telefone = json.telefone();
        }

        if(json.nivel() != null){
            this.nivel = json.nivel();
        }

        if(json.condicao() != null){
            this.condicao = json.condicao();
        }

        if(json.encaminhado() != null){
            this.encaminhado = json.encaminhado();
        }

        if(json.tratamento() != null){
            this.tratamento = json.tratamento();
        }

        if(json.medicacao() != null){
            this.medicacao = json.medicacao();
        }

        if(json.endereco() != null){
            this.endereco.novoEndereco(endereco);
        }

    }
}
