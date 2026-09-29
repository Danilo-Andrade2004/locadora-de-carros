package com.br.locadoradecarros.cliente.mapper;

import com.br.locadoradecarros.cliente.dto.ClienteRequestDTO;
import com.br.locadoradecarros.cliente.dto.ClienteResponseDTO;
import com.br.locadoradecarros.cliente.model.Cliente;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);
    
    @Mapping(target = "id", ignore = true)
    Cliente toEntity(ClienteRequestDTO dto);
    ClienteResponseDTO toDto(Cliente model);
}