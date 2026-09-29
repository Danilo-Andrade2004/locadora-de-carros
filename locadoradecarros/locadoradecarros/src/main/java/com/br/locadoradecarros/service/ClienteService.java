package com.br.locadoradecarros.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.br.locadoradecarros.dto.ClienteRequestDTO;
import com.br.locadoradecarros.mapper.ClienteMapper;
import com.br.locadoradecarros.model.Cliente;
import com.br.locadoradecarros.repository.ClienteRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ClienteService {

    private final ClienteRepository repository;

    public Cliente cadastrar(ClienteRequestDTO dto){
        Cliente cliente = ClienteMapper.INSTANCE.toEntity(dto);
        return repository.salvar(cliente);
    }

    public List<Cliente> listar(){
        return repository.buscarTodos();
    }
}