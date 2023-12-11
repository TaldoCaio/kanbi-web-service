package com.taldaapi.br.model;

import jakarta.persistence.*;

@Entity
@Table(name = "QUADROS")
public class Quadro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "QUADRO_DESCRICAO")
    private String descricao;
    @Column(name = "CRIADOR_ID")
    private Integer criador;
    @Column(name = "MAX_LISTA")
    private int maxLista;
    @Column(name = "STATUS")
    private String status;

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

    public int getMaxLista() {
        return maxLista;
    }

    public void setMaxLista(int maxLista) {
        this.maxLista = maxLista;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Quadro{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", criador='" + criador + '\'' +
                ", maxLista=" + maxLista +
                ", status='" + status + '\'' +
                '}';
    }
}
