package com.taldaapi.br.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lista")
public class Lista {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "lista_nome")
    private String nome;

    @Column(name = "criador_id")
    private Integer criador;

    @Column(name = "status")
    private String status;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    @Column(name = "quadro_id")
    private Integer quadro;

    public Integer getQuadro() {
        return quadro;
    }

    public void setQuadro(Integer quadro) {
        this.quadro = quadro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCriador() {
        return criador;
    }

    public void setCriador(Integer criador) {
        this.criador = criador;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
