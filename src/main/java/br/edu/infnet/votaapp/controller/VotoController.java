package br.edu.infnet.votaapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.votaapp.model.domain.Voto;
import br.edu.infnet.votaapp.service.VotoService;

@RestController
public class VotoController {

    @Autowired
    private VotoService votoService;

    @GetMapping(value = "/voto")
    public List<Voto> retornaVotos() {
        return votoService.obterLista();
    }


    @PostMapping(value = "/voto")
    public void incluiVoto(@RequestBody Voto voto) {
        votoService.incluir(voto);
    }

    @DeleteMapping(value = "/voto/{id}")
    public void excluiVoto(@PathVariable Integer id) {
        votoService.excluir(id);
    }
}
