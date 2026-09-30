package com.br.locadoradecarros.carro.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.br.locadoradecarros.carro.model.Carro;

@Repository
public class CarroRepository {
    private final List<Carro> carros = new ArrayList<>();
    private long id = 1;

    public Carro salvar(Carro carro){
        carro.setId(id++);
        carros.add(carro);
        return carro;
    }

    public List<Carro> buscarCarro(){
        return carros;
    }
}
