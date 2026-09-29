package com.br.locadoradecarros.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ClienteRequestDTO {
    @NotBlank(message="Nome não pode ser vazio!")
    private String nome;

    @NotEmpty(message="Idade não pode ser vazia!")
    private Integer idade;

    @NotNull(message="Conta não pode ser vazia!")
    private String contaBancaria;
}