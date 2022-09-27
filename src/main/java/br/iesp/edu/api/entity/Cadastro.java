package br.iesp.edu.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Cadastro {

    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    private Integer dataNascimento;
    private String email;
    private String senha;
    private String confimarSenha;
    private Integer numeroCartao;
    private Integer validadeCartao;
    private Integer codSeguranca;
    private String nomeTitular;
    private Integer CPF;
}
