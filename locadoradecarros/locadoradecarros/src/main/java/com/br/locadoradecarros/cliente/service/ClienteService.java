package com.br.locadoradecarros.cliente.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.br.locadoradecarros.cliente.dto.ClienteRequestDTO;
import com.br.locadoradecarros.cliente.mapper.ClienteMapper;
import com.br.locadoradecarros.cliente.model.Cliente;
import com.br.locadoradecarros.cliente.repository.ClienteRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ClienteService {

    private final ClienteRepository repository;

    public Cliente cadastrar(ClienteRequestDTO dto){
        Cliente cliente = ClienteMapper.INSTANCE.toEntity(dto);
        return repository.save(cliente);
    }

    public List<Cliente> listar(){
        return repository.findAll();
    }
}