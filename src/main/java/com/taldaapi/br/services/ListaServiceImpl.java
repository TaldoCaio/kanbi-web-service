package com.taldaapi.br.services;

import com.taldaapi.br.model.Lista;
import com.taldaapi.br.repository.ListaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ListaServiceImpl implements ListaService{
    ListaRepository listaRepository;
    @Override
    public Lista insertLista(Lista lista) {
        return listaRepository.save(lista);
    }

    @Override
    public List<Lista> getByCriador(Integer criador) {
        return listaRepository.findByCriador(criador);
    }

    @Override
    public List<Lista> getByQuadro(Integer quadro) {
        return listaRepository.findByQuadro(quadro);
    }

    @Override
    public Lista updateLista(Lista updateRequest) {
        return listaRepository.updateById(updateRequest);
    }
}
