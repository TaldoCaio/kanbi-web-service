package com.taldaapi.br.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "card_desc")
    private String descricao;

    @Column(name = "criador_id")
    private Integer criador;

    @Column(name = "lista_id")
    private Integer lista;

    @Column(name = "status")
    private String status;

    @Column(name = "card_data_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtInicio;

    @Column(name = "card_data_termino")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtTermino;

    // Getters e setters para os campos da entidade Card

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCriador() {
        return criador;
    }

    public void setCriador(Integer criador) {
        this.criador = criador;
    }

}
