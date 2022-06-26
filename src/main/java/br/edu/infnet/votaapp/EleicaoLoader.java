package br.edu.infnet.votaapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.votaapp.model.domain.Eleicao;
import br.edu.infnet.votaapp.service.EleicaoService;

@Component
@Order(value = 2)
public class EleicaoLoader implements ApplicationRunner {

	@Autowired
	private EleicaoService eleicaoService;
	
	@Override
	public void run(ApplicationArguments args){
		
		Eleicao eleicao = new Eleicao();
		eleicao.setDescricao("Descricao Teste");
		
		
		try {
			eleicaoService.incluir(eleicao);
			System.out.println("[Sucesso - Eleicao] Inclusão realizada!");
		} catch (Exception e) {
			System.out.println("Erro " + e);
		}
		
	}
	
	

}
