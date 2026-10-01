package com.br.locadoradecarros.carro.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.br.locadoradecarros.carro.dto.CarroRequestDTO;
import com.br.locadoradecarros.carro.mapper.CarroMapper;
import com.br.locadoradecarros.carro.model.Carro;
import com.br.locadoradecarros.carro.repository.CarroRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service 
public class CarroService {
    
    private final CarroRepository repository;

    public Carro cadastrar(CarroRequestDTO dto){
        Carro carro = CarroMapper.INSTANCE.toEntity(dto);
        return repository.save(carro);
    }

    public List<Carro> listar(){
        return repository.findAll();
    }
}