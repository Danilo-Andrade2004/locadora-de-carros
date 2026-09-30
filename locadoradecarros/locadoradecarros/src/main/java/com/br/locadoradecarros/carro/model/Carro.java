package com.br.locadoradecarros.carro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Carro {
    private Long id;
    private String marca;
    private String modelo;
    private Integer ano;
    private Integer qntPassageiros;
}
