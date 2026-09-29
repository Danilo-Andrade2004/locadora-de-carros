package com.br.locadoradecarros.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.br.locadoradecarros.dto.ClienteRequestDTO;
import com.br.locadoradecarros.model.Cliente;
import com.br.locadoradecarros.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping("/cadastrar")
    public Cliente cadastrar(@Valid @RequestBody ClienteRequestDTO dto){
        return clienteService.cadastrar(dto);
    }

    @GetMapping("/listarClientes")
    public List<Cliente> listar(){
        return clienteService.listar();
    }
}
