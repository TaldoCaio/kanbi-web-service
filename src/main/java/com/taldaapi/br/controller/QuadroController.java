package com.taldaapi.br.controller;

import com.taldaapi.br.model.Quadro;
import com.taldaapi.br.repository.QuadroRepository;
import com.taldaapi.br.services.QuadroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/quadro")
public class QuadroController {
    @Autowired
    QuadroService quadroService;
    @Autowired
    QuadroRepository quadroRepository;


    @PostMapping("/post")
    public Quadro insertQuadro(@RequestBody Quadro quadro) {
        return quadroRepository.save(quadro);
    }

    @GetMapping("/all")
    public List<Quadro> getAll() {
        return quadroRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Quadro> getById(@PathVariable Integer id) {
        return quadroRepository.findById(id);
    }

    @GetMapping("/criador/{criador}")
    public List<Quadro> getByCriador(@PathVariable Integer criador) {
        return quadroService.getByCriador(criador);
    }

    @GetMapping("/ativosCriador/{criador}")
    public List<Quadro> getAtivoByCriador(@PathVariable Integer criador) {
        return quadroService.getQuadroAtivosCriador(criador);
    }

    @PutMapping("/{id}")
    public Quadro updateQuadro(@PathVariable Integer id, @RequestBody Quadro quadro) {
        return quadroRepository.save(quadro);
    }
}
