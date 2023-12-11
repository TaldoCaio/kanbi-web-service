package com.taldaapi.br.repository;

import com.taldaapi.br.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {

    List<Card> findByCriador(Integer criador);

    List<Card> findByLista(Integer lista);

    List<Card> findByCriadorAndStatus(Integer criador, String status);

    List<Card> findByDtTermino(Date dtTermino);

    List<Card> findByDtInicio(Date dtInicio);
}
