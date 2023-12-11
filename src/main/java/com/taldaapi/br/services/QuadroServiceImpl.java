package com.taldaapi.br.services;

import com.taldaapi.br.model.Quadro;
import com.taldaapi.br.repository.QuadroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuadroServiceImpl implements QuadroService{
    QuadroRepository quadroRepository;
    @Override
    public Quadro insertQuadro(Quadro quadro) {
        return quadroRepository.save(quadro);
    }

    @Override
    public List<Quadro> getByCriador(Integer criador) {
        return quadroRepository.findQuadroByCriador(criador);
    }

    @Override
    public List<Quadro> getQuadroAtivosCriador(Integer criador) {
        return quadroRepository.findByCriadorAndStatus(criador,"A");
    }

    @Override
    public Quadro updateQuadro(Quadro updateRequest) {
        quadroRepository.updateById(updateRequest);
        return updateRequest;
    }
}
