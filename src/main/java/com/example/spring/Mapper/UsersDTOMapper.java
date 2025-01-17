package com.example.spring.Mapper;

import com.example.spring.DTO.UsersDTO;
import com.example.spring.Model.Users;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(componentModel = "spring")
public interface UsersDTOMapper extends Converter<UsersDTO, Users> {

    @Override
    Users convert(UsersDTO source);

}
