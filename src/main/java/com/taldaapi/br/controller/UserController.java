package com.taldaapi.br.controller;

import com.taldaapi.br.model.User;
import com.taldaapi.br.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/criar")
    public User createUser(@RequestBody User user) {
        userRepository.save(user);
        return user;
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/updateU")
    public ResponseEntity<String> updateUser(@RequestBody User user) {
        userRepository.save(user);
        return ResponseEntity.ok("Atualizações salvas");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            userRepository.delete(user.get());
            return ResponseEntity.ok("Conta deletada!");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não encontrado");
    }
}
