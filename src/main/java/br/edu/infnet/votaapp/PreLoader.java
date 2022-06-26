package br.edu.infnet.votaapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.votaapp.service.CandidatoService;
import br.edu.infnet.votaapp.service.EleicaoService;
import br.edu.infnet.votaapp.service.EleitorService;
import br.edu.infnet.votaapp.service.VotoService;

@Order(value = 1)
@Component
public class PreLoader implements ApplicationRunner{
	
	
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
		cleanDomainData();
		System.out.println("cleaned domain data");
		
	}
	
	private void cleanDomainData() {
		eleicaoService.deleteAll();
		candidatoService.deleteAll();
		eleitorService.deleteAll();
		votoService.deleteAll();
	}

}
