package com.systemfinanceiro.service;

import com.systemfinanceiro.model.Divida;
import com.systemfinanceiro.repository.DividaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DividaService {
    private final DividaRepository dividaRepository;

    public DividaService(DividaRepository dividaRepository) {
        this.dividaRepository = dividaRepository;
    }

    public List<Divida> listaDividas() {
        return dividaRepository.findAll();
    }

    public Divida adicionarDivida(Divida divida) {
        return dividaRepository.save(divida);
    }

    public void removerDivida(Long id) {
        dividaRepository.deleteById(id);
    }
}
