package com.taldaapi.br.services;

import com.taldaapi.br.model.Lista;
import com.taldaapi.br.repository.ListaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ListaService {

    public Lista insertLista(Lista lista);

    public List<Lista> getByCriador(Integer criador);

    public List<Lista> getByQuadro(Integer quadro);

    public Lista updateLista(Lista updateRequest);
}
