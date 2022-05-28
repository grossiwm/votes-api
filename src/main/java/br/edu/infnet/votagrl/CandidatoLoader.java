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
import br.edu.infnet.votagrl.service.CandidatoService;
import br.edu.infnet.votagrl.service.EleicaoService;
import br.edu.infnet.votagrl.service.EleitorService;
import br.edu.infnet.votagrl.service.VotoService;

public class CandidatoLoader implements ApplicationRunner {

	
	@Autowired
	private CandidatoService candidatoService;
	
	@Autowired
	private EleicaoService eleicaoService;
	
	@Autowired
	private EleitorService eleitorService;
	
	@Autowired
	private VotoService votoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		Candidato candidato = new Candidato();
		candidato.setNome("Fulano");
		candidato.setNumero(1877);
		candidatoService.incluir(candidato);
		
		Eleicao eleicao = new Eleicao();
		eleicao.setDescricao("sksdahjksdaj");
		eleicaoService.incluir(eleicao);
		
		Eleitor eleitor = new Eleitor();
		eleitor.setCodigo("323223");
		eleitorService.incluir(eleitor);
		
		Voto voto = new Voto();
		voto.setLocalizacao("RJ");
		votoService.incluir(voto);
		
		
	}
	
	

}
