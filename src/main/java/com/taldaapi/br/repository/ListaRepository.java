package com.taldaapi.br.repository;

import com.taldaapi.br.model.Lista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ListaRepository extends JpaRepository<Lista, Integer> {

    List<Lista> findByCriador(Integer criador);

    List<Lista> findByQuadro(Integer quadro);
    @Transactional
    @Modifying
    @Query("UPDATE Lista l SET l.nome = :#{#lista.nome} WHERE l.id = :#{#lista.nome}")
    Lista updateById(@Param("lista") Lista lista);
}
