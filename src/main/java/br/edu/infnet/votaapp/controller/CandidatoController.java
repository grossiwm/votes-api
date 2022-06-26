package br.edu.infnet.votaapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.votaapp.model.domain.Candidato;
import br.edu.infnet.votaapp.model.domain.Eleicao;
import br.edu.infnet.votaapp.service.CandidatoService;
import br.edu.infnet.votaapp.service.EleicaoService;

@RestController
public class CandidatoController {
	
	
	@Autowired
	private CandidatoService candidatoService;

	@Autowired
	private EleicaoService eleicaoService;


	@GetMapping(value = "/candidato")
	public List<Candidato> retornaCandidatos() {
		return candidatoService.obterLista();
	}

	@GetMapping(value = "/candidato/{id}/candidatoPorEleicao")
	public List<Candidato> retornaCandidatosPorEleicao(@PathVariable Integer id) {
		Eleicao eleicao = eleicaoService.obterPorId(id);
		return candidatoService.obterLista(eleicao);
	}

	@PostMapping(value = "/candidato")
	public void incluiCandidator(@RequestBody Candidato candidato) {
		candidatoService.incluir(candidato);
	}

	@DeleteMapping(value = "/candidato/{id}")
	public void excluiCandidato(@PathVariable Integer id) {
		candidatoService.excluir(id);
	}
}
