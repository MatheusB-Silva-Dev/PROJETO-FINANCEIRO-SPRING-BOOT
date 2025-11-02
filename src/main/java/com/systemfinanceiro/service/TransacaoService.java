package com.systemfinanceiro.service;

import com.systemfinanceiro.model.Transacao;
import com.systemfinanceiro.repository.TransacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoService {
    private final TransacaoRepository transacaoRepository;

    public TransacaoService(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    public Transacao adicionarTransacao(Transacao transacao) {
        return transacaoRepository.save(transacao);
    }

    public List<Transacao> listarTodas() {
        return transacaoRepository.findAll();
    }

    public void removerTransacao(Long id) {
        transacaoRepository.deleteById(id);
    }
}
