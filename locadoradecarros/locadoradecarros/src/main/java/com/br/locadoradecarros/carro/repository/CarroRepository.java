package com.br.locadoradecarros.carro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.locadoradecarros.carro.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
    
}