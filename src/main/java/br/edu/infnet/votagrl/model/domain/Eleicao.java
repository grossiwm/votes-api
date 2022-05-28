package br.edu.infnet.votagrl.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "TEleicao", uniqueConstraints =@UniqueConstraint(columnNames={"descricao"})
 )
public class Eleicao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private LocalDateTime data;
	
	private String descricao;
	
	@Transient
	private List<Candidato> candidatos;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}
	
	public Eleicao() {
		// TODO Auto-generated constructor stub
		this.data = LocalDateTime.now();
	}
	

	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

	public List<Voto> getVotos() {
		return votos;
	}

	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}

	@Transient
	private List<Voto> votos;

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
