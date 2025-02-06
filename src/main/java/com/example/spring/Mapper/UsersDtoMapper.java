package com.example.spring.Mapper;

import com.example.spring.DTO.UsersDTO;
import com.example.spring.Model.Users;
import org.mapstruct.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public class UsersDtoMapper {

    private final ModelMapper modelMapper;

    public UsersDtoMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    // Model a DTO
    public Users toResponseEntity(UsersDTO usersDTO) {
        return modelMapper.map(usersDTO, Users.class);
    }

    public List<Users> toResponseEntityList(List<UsersDTO> usersDTO) {
        return usersDTO.stream()
                .map(this::toResponseEntity)
                .toList();
    }

    // DTO a Model
    public UsersDTO toResponseDto(Users users) {
        return modelMapper.map(users, UsersDTO.class);
    }

    public List<UsersDTO> toResponseDtoList(List<Users> users) {
        return users.stream()
                .map(this::toResponseDto)
                .toList();
    }
}
