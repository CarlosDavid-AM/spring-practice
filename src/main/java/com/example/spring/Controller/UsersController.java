package com.example.spring.Controller;

import com.example.spring.DTO.UsersDTO;
import com.example.spring.Model.Users;
import com.example.spring.Repository.UsersRepository;
import com.example.spring.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<UsersDTO>> getUsers() {
        List<UsersDTO> response = service.getAllUsers();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UsersDTO> save(@RequestBody UsersDTO usersDTO) {
        UsersDTO response = service.save(usersDTO);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
