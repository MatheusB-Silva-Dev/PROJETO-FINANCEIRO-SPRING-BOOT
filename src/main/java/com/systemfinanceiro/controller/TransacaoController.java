package com.systemfinanceiro.controller;

import com.systemfinanceiro.model.Transacao;
import com.systemfinanceiro.service.TransacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // marca a classe como controller de uma api rest, fazendo com que todos os metodos retornem json
@RequestMapping("/transacoes") // definimos a url para requisicao http
public class TransacaoController {
    private final TransacaoService transacaoService; // Injetando bean TransacaoService

    public TransacaoController(TransacaoService transacaoService) { //Injetando atraves do construtor
        this.transacaoService = transacaoService;
    }

    @PostMapping //Metodo Post/adicionar cria objeto
    public Transacao adicionarTransacao(@RequestBody Transacao transacao) { // Anotacao @RequestBody indica que o spring espera um JSON, converte em objeto transcao
        return transacaoService.adicionarTransacao(transacao); //chama a service para adicionar
    }

    @GetMapping //Metodo Get para listar todas as transacoes
    public List<Transacao> listaTransacao() { // Passa o tipo de retorno List
       return transacaoService.listarTodas(); // chama a service para listar os objetos
    }

    @DeleteMapping ("/{id}") //Metodo delete atraves do id da transacao o spring controla toda a lista
    public ResponseEntity<Void> removerTransacao(@PathVariable Long id) { //@PathVariable: Captura valor do ID da URL e converte automaticamente para Long
        transacaoService.removerTransacao(id); //chama a service para remover o objeto passando o id
        return ResponseEntity.noContent().build();
    }

}


//@RequestBody -- Recebe JSON da requisição e converte em objeto Transacao automaticamente
//@PathVariable -- Captura valor do ID da URL e converte automaticamente para Long