package com.taldaapi.br.controller;

import com.taldaapi.br.model.Lista;
import com.taldaapi.br.repository.ListaRepository;
import com.taldaapi.br.services.ListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lista")
public class ListaController {

    ListaService listaService;
    ListaRepository listaRepository;

    @PostMapping("/criar")
    public Lista inserirLista(@RequestBody Lista lista){
        return listaService.insertLista(lista);
    }

    @GetMapping("/todos")
    public List<Lista> getAll(){
        return listaRepository.findAll();
    }

    @GetMapping("/id/{id}")
    public Optional<Lista> getById(@PathVariable Integer id){
        return listaRepository.findById(id);
    }

    @GetMapping("/criador/{criador}")
    public List<Lista> getByCriador(@PathVariable Integer criador){
        return listaService.getByCriador(criador);
    }

    @GetMapping("/quadro/{quadro}")
    public List<Lista> getQuadro(@PathVariable Integer quadro){
        return listaService.getByQuadro(quadro);
    }

    @PatchMapping("/update")
    public Lista updateLista(@RequestBody Lista lista){
        return listaService.updateLista(lista);
    }
}
