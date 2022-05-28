package br.edu.infnet.votagrl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votagrl.model.domain.Candidato;
import br.edu.infnet.votagrl.model.domain.Eleicao;
import br.edu.infnet.votagrl.model.repository.CandidatoRepository;

@Service
public class CandidatoService {

	@Autowired
	private CandidatoRepository candidatoRepository;
	
	public void incluir(Candidato candidato) {
		candidatoRepository.save(candidato);
	}
	
	public List<Candidato> obterList() {
		return (List<Candidato>) candidatoRepository.findAll();
	}
	
	public List<Candidato> obterList(Eleicao eleicao) {
		return (List<Candidato>) candidatoRepository.findAll();
	}
}
