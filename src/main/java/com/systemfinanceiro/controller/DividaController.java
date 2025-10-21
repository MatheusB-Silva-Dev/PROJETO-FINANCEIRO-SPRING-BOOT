package com.systemfinanceiro.controller;

import com.systemfinanceiro.model.Divida;
import com.systemfinanceiro.service.DividaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Marca a classe como controller rest, todos os metodos retornam JSON
@RequestMapping("/dividas") // Definimos a url base para as requisicoes https
public class DividaController {
    private final DividaService dividaService; //injetando a service

    // construtor recebe a service e faz a injecao de dependencia via construtor
    public DividaController(DividaService dividaService) {
        this.dividaService = dividaService;
    }

    // metodo post cria objeto
    @PostMapping
    public Divida adicionarDivida(@RequestBody Divida divida) {// Anotacao @RequestBody indica que o spring espera um JSON, converte em objeto divida
        return dividaService.adicionarDivida(divida); // chama a service para add e retorna o objeto criado
    }

    // metodo para consulta/listar
    @GetMapping
    public List<Divida> listaDividas() { // retorna a lista de dividas, o spring controla toda a lista
        return dividaService.listaDividas(); // chama a service
    }

    // metodo de remover, recebe o ID na url atraves da requisicao
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerDivida(@PathVariable Long id) { // recebe o id via url
        return dividaService.removerDivida(id); // chama a service para remover e retorna somente o status http sem corpo void
    }
}

//@RequestBody -- Recebe JSON da requisição e converte em objeto Divida automaticamente
//@PathVariable -- Captura valor do ID da URL e converte automaticamente para Long

