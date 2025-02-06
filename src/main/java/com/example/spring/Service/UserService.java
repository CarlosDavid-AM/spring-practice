package com.example.spring.Service;

import com.example.spring.DTO.UsersDTO;
import com.example.spring.Mapper.UsersDtoMapper;
import com.example.spring.Model.Users;
import com.example.spring.Repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UsersRepository repository;
    private final UsersDtoMapper usersDtoMapper;

    public UserService(UsersRepository repository, UsersDtoMapper usersDtoMapper) {
        this.repository = repository;
        this.usersDtoMapper = usersDtoMapper;
    }

    public List<UsersDTO> getAllUsers() {
        List<Users> users = repository.findAll();

        return usersDtoMapper.toResponseDtoList(users);

    }

    public UsersDTO save(UsersDTO usersDTO) {
        Users transformed = usersDtoMapper.toResponseEntity(usersDTO);
        Users result = repository.save(transformed);

        return usersDtoMapper.toResponseDto(result);
    }

}
