package com.br.locadoradecarros.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente {
    private Long id;
    private String nome;
    private Integer idade;
    private String contaBancaria;
}