package com.br.locadoradecarros.cliente.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteResponseDTO {
    private Long id;
    private String nome;
    private Integer idade;
    private String contaBancaria;
}