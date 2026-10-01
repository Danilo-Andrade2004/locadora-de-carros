package com.br.locadoradecarros.carro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarroResponseDTO {
    private Long id;
    private String marca;
    private String modelo;
    private Integer ano;
    private Integer qntPassageiros;
}