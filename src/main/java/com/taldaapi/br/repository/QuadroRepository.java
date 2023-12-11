package com.taldaapi.br.repository;

import com.taldaapi.br.model.Quadro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface QuadroRepository extends JpaRepository<Quadro, Integer> {

    List<Quadro> findQuadroByCriador(Integer criador);

    List<Quadro> findByCriadorAndStatus(Integer criador, String status);

    List<Quadro> findByStatus(String status);

    @Transactional
    @Modifying
    @Query("UPDATE Quadro q SET q.descricao = :#{#quadro.descricao}, q.maxLista = :#{#quadro.maxLista} WHERE q.id = :#{#quadro.id}")
    void updateById(@Param("quadro")Quadro quadro);
}
