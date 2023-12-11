package com.taldaapi.br.services;

import com.taldaapi.br.model.User;
import com.taldaapi.br.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    UserRepository userRepository;
    @Override
    public User login(String email, String senha) {
        return userRepository.findByEmailAndSenha(email,senha);
    }
}
