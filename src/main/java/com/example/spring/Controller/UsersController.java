package com.example.spring.Controller;

import com.example.spring.Model.Users;
import com.example.spring.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping
    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

    @PostMapping
    public Users save(@RequestBody Users users) {
        return usersRepository.save(users);
    }
}
