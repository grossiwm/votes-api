package br.edu.infnet.votagrl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votagrl.model.domain.Candidato;
import br.edu.infnet.votagrl.model.domain.Eleicao;
import br.edu.infnet.votagrl.model.domain.Eleitor;
import br.edu.infnet.votagrl.model.repository.EleicaoRepository;
import br.edu.infnet.votagrl.model.repository.EleitorRepository;

@Service
public class EleitorService {

	@Autowired
	private EleitorRepository eleitorRepository;
	
	public void incluir(Eleitor eleitor) {
		eleitorRepository.save(eleitor);
	}
	
	public List<Eleitor> obterLista() {
		return (List<Eleitor>) eleitorRepository.findAll();
	}
}
