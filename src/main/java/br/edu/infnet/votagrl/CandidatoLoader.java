package br.edu.infnet.votagrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import br.edu.infnet.votagrl.model.domain.Candidato;
import br.edu.infnet.votagrl.model.domain.Eleicao;
import br.edu.infnet.votagrl.model.domain.Eleitor;
import br.edu.infnet.votagrl.model.domain.Voto;
import br.edu.infnet.votagrl.model.repository.CandidatoRepository;
import br.edu.infnet.votagrl.model.repository.EleicaoRepository;
import br.edu.infnet.votagrl.model.repository.EleitorRepository;
import br.edu.infnet.votagrl.model.repository.VotoRepository;

public class CandidatoLoader implements ApplicationRunner {

	
	@Autowired
	private CandidatoRepository candidatoRepository;
	
	@Autowired
	private EleicaoRepository eleicaoRepository;
	
	@Autowired
	private EleitorRepository eleitorRepository;
	
	@Autowired
	private VotoRepository votoRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		Candidato candidato = new Candidato();
		candidato.setNome("Fulano");
		candidato.setNumero(1877);
		candidatoRepository.save(candidato);
		
		Eleicao eleicao = new Eleicao();
		eleicao.setDescricao("sksdahjksdaj");
		eleicaoRepository.save(eleicao);
		
		Eleitor eleitor = new Eleitor();
		eleitor.setCodigo("323223");
		eleitorRepository.save(eleitor);
		
		Voto voto = new Voto();
		voto.setLocalizacao("RJ");
		votoRepository.save(voto);
		
		
	}
	
	

}
