package com.taldaapi.br.repository;

import com.taldaapi.br.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmailAndSenha(String email, String senha);
}
