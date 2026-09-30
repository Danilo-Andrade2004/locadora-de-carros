package com.br.locadoradecarros.carro.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarroRequestDTO {
    @NotBlank(message = "Por favor informe a marca do veículo")
    private String marca;

    @NotNull(message = "O modelo do carro é uma informação obrigatória!")
    private String modelo;

    @NotEmpty @Positive
    private Integer ano;

    @NotEmpty
    private Integer qntPassageiros;
}