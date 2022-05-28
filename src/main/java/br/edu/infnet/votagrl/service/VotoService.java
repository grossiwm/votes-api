package br.edu.infnet.votagrl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votagrl.model.domain.Eleitor;
import br.edu.infnet.votagrl.model.domain.Voto;
import br.edu.infnet.votagrl.model.repository.EleitorRepository;
import br.edu.infnet.votagrl.model.repository.VotoRepository;

@Service
public class VotoService {

	@Autowired
	private VotoRepository votoRepository;
	
	public void incluir(Voto voto) {
		votoRepository.save(voto);
	}
}
