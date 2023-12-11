package com.taldaapi.br.services;

import com.taldaapi.br.model.Card;
import com.taldaapi.br.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class CardServiceImpl implements CardService{
    CardRepository cardRepository;

    @Override
    public List<Card> findByCriador(Integer criador) {
        return cardRepository.findByCriador(criador);
    }

    @Override
    public List<Card> findByLista(Integer lista) {
        return cardRepository.findByLista(lista);
    }

    @Override
    public List<Card> findByQuadroAndStatus(Integer criador) {
        return cardRepository.findByCriadorAndStatus(criador,"A");
    }

    @Override
    public List<Card> findByDtInicio(Date dtInicio) {
        return cardRepository.findByDtInicio(dtInicio);
    }

    @Override
    public List<Card> findByDtTermino(Date dtTermino) {
        return cardRepository.findByDtTermino(dtTermino);
    }
}
