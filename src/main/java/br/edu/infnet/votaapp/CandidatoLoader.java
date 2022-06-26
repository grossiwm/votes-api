package br.edu.infnet.votaapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.votaapp.model.domain.Candidato;
import br.edu.infnet.votaapp.service.CandidatoService;

@Component
@Order(value=4)
public class CandidatoLoader implements ApplicationRunner {

	@Autowired
	private CandidatoService candidatoService;

	
	@Override
	public void run(ApplicationArguments args) {


		
		Candidato candidato = new Candidato();
		candidato.setNome("Gabriel");
		candidato.setNumero(123);
		
		try {
			candidatoService.incluir(candidato);
			System.out.println("[Sucesso - Candidato] Inclusão realizada!");
		} catch (Exception e) {
			System.out.println("Erro " + e);
		}
		
		
		
	}
	
	

}
