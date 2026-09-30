package com.br.locadoradecarros.cliente.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.br.locadoradecarros.cliente.model.Cliente;

@Repository
public class ClienteRepository {
    
    private final List<Cliente> clientes = new ArrayList<>();
    private long id=1;

    public Cliente salvar(Cliente cliente){
        cliente.setId(id++);
        clientes.add(cliente);
        return cliente;
    }

    public List<Cliente> buscarTodos(){
        return clientes;
    }
}