package br.edu.infnet.votaapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.votaapp.model.domain.Eleitor;
import br.edu.infnet.votaapp.service.EleitorService;

@RestController
public class EleitorController {

	@Autowired
	private EleitorService eleitorService;
	
	@GetMapping(value = "/eleitor")
	public List<Eleitor> retornaEleitores() {
		return eleitorService.obterLista();
	}

	@PostMapping(value = "/eleitor")
	public void incluiEleitor(@RequestBody Eleitor eleitor) {
		eleitorService.incluir(eleitor);
	}

	@DeleteMapping(value = "/eleitor/{id}")
	public void excluirEleitor(@PathVariable Integer id) {
		eleitorService.excluir(id);
	}
}
