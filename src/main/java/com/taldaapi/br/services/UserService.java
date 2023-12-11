package com.taldaapi.br.services;

import com.taldaapi.br.model.User;
import com.taldaapi.br.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserService {

    public User login(String email, String senha);
}
