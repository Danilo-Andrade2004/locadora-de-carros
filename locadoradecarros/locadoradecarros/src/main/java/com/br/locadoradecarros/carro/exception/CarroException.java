package com.br.locadoradecarros.carro.exception;

public class CarroException extends RuntimeException{
    public CarroException(Long id){
        super("Carro não encontrado: "+id);
    }
}