package br.edu.infnet.votagrl.model.domain;

import java.time.LocalDateTime;

public class Voto {

	private LocalDateTime data;
	
	private String localizacao;

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	
}
