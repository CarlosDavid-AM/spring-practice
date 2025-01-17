package com.example.spring.Mapper;

import com.example.spring.DTO.UsersDTO;
import com.example.spring.Model.Users;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ListUsersMapper extends Converter<List<Users>, List<UsersDTO>> {

    @Override
    List<UsersDTO> convert(List<Users> source);

}
