package com.br.locadoradecarros.carro.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.br.locadoradecarros.carro.dto.CarroRequestDTO;
import com.br.locadoradecarros.carro.model.Carro;
import com.br.locadoradecarros.carro.service.CarroService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/carros")
public class CarroController {
    
    private final CarroService service;
    
    @PostMapping("/cadastrar")
    public Carro cadastrar(@Valid @RequestBody CarroRequestDTO dto){
        return service.cadastrar(dto);
    }

    @GetMapping("/listar")
    public List<Carro> listar(){
        return service.listar();
    }
}