package br.edu.infnet.votaapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.votaapp.model.domain.Voto;
import br.edu.infnet.votaapp.service.VotoService;

@Component
@Order(value = 5)
public class VotoLoader implements ApplicationRunner {
	
	@Autowired
	private VotoService votoService;
	
	@Override
	public void run(ApplicationArguments args) {
		
		Voto voto = new Voto();
		voto.setLocalizacao("Web");
		
		try {
			votoService.incluir(voto);
			System.out.println("[Sucesso - Voto] Inclusão realizada!");
		} catch (Exception e) {
			System.out.println("Erro " + e);
		}
	}
	
	

}
