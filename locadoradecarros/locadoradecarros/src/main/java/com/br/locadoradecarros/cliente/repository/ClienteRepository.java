package com.br.locadoradecarros.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.locadoradecarros.cliente.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}