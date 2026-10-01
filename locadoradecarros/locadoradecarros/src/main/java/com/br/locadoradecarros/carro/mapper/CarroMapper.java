package com.br.locadoradecarros.carro.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.br.locadoradecarros.carro.dto.CarroRequestDTO;
import com.br.locadoradecarros.carro.model.Carro;

@Mapper(componentModel = "spring")
public interface CarroMapper {

    CarroMapper INSTANCE = Mappers.getMapper(CarroMapper.class);
    
    @Mapping(target = "id", ignore = true)
    Carro toEntity(CarroRequestDTO dto);
    CarroRequestDTO toDto(Carro model);
}