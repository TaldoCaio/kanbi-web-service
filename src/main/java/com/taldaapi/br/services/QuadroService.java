package com.taldaapi.br.services;

import com.taldaapi.br.model.Quadro;
import com.taldaapi.br.repository.QuadroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface QuadroService {


    public Quadro insertQuadro(Quadro quadro);

    public List<Quadro> getByCriador(Integer criador);

    public List<Quadro> getQuadroAtivosCriador(Integer criador);

    public Quadro updateQuadro(Quadro updateRequest);
}
