package com.br.locadoradecarros.cliente.exception;

public class ClienteException extends RuntimeException{
    public ClienteException(Long id){
        super("Cliente não encontrado: "+id);
    }
}