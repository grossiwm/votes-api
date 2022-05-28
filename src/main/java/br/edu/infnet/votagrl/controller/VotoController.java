package br.edu.infnet.votagrl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/voto")
public class VotoController {

	@GetMapping
	public String cadastra() {
		return "voto/cadastro";
	}
}
