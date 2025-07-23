package com.solid.domain.services;

import com.solid.domain.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void register(User user) { // responsabilidade unica: registrar usuario
        System.out.println("Usuário registrado: " + user.getName());
    }
}
