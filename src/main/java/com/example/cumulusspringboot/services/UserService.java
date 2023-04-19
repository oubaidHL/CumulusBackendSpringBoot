package com.example.cumulusspringboot.services;

import com.example.cumulusspringboot.entities.User;
import com.example.cumulusspringboot.interfaces.IUserService;
import com.example.cumulusspringboot.repositories.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService  implements IUserService {
    @Autowired
    UserRepo userRepo;
    @Override
    public List<User> retrieveAllUsers() {
        return userRepo.findAll();
    }
}
