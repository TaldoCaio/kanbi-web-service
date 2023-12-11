package com.taldaapi.br.controller;

import com.taldaapi.br.model.Card;
import com.taldaapi.br.repository.CardRepository;
import com.taldaapi.br.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/card")
public class CardController {

    CardService cardService;
    CardRepository cardRepository;

    @PostMapping("/")
    public Card inserirCard(@RequestBody Card card){
        return cardRepository.save(card);
    }

    @GetMapping("/all")
    public List<Card> getAll(){
        return cardRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Card> getById(@PathVariable Integer id){
        return cardRepository.findById(id);
    }

    @GetMapping("/criador/{criador}")
    public List<Card> getByCriador(@PathVariable Integer criador){
        return cardService.findByCriador(criador);
    }

    @GetMapping("/lst/{lista}")
    public List<Card> getByLista(@PathVariable Integer lista){
        return cardService.findByLista(lista);
    }

    @GetMapping("/attbyCriador/{criador}")
    public List<Card> getAtt(@PathVariable Integer criador){
        return cardService.findByQuadroAndStatus(criador);
    }

    @GetMapping("/dtIni/{dtInicio}")
    public List<Card> getDtIni(@PathVariable Date dtInicio){
        return cardService.findByDtInicio(dtInicio);
    }

    @GetMapping("/dtTer")
    public List<Card> getDtTerm(@RequestParam("dtTermino") Date dtTermino){
        return cardService.findByDtTermino(dtTermino);
    }
}
