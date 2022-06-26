package br.edu.infnet.votaapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.votaapp.model.domain.Eleitor;
import br.edu.infnet.votaapp.service.EleitorService;

@Component 
@Order(value =3)
public class EleitorLoader implements ApplicationRunner {

	@Autowired
	private EleitorService eleitorService;
	
	@Override
	public void run(ApplicationArguments args){
		
		Eleitor eleitor = new Eleitor();
		eleitor.setNome("Fulano da Silva");
		eleitor.setEmail("fulano.silva@aol.com");
		
		try {
			eleitorService.incluir(eleitor);
			System.out.println("[Sucesso - Eleitor] Inclusão realizada!");
		} catch (Exception e) {
			System.out.println("Erro " + e);
		}
		
		
	}
	
	

}
