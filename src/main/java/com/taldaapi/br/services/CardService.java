package com.taldaapi.br.services;

import com.taldaapi.br.model.Card;

import java.util.Date;
import java.util.List;

public interface CardService {

    List<Card> findByCriador(Integer criador);

    List<Card> findByLista(Integer lista);

    List<Card> findByQuadroAndStatus(Integer criador);

    List<Card> findByDtInicio(Date dtInicio);

    List<Card> findByDtTermino(Date dtTermino);
}
