package br.edu.infnet.votaapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.votaapp.model.domain.Eleicao;
import br.edu.infnet.votaapp.service.EleicaoService;

@RestController
public class EleicaoController {

    @Autowired
    private EleicaoService eleicaoService;

    @GetMapping(value = "/eleicao")
    public List<Eleicao> retornaEleicoes() {
        return eleicaoService.obterLista();
    }

    @PostMapping(value = "/eleicao")
    public void incluiEleicao(@RequestBody Eleicao eleicao) {
        eleicaoService.incluir(eleicao);
    }

    @DeleteMapping(value = "/eleicao/{id}")
    public void excluiEleicao(@PathVariable Integer id) {
        eleicaoService.excluir(id);
    }
}
