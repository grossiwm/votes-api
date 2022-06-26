package br.edu.infnet.votaapp.model.domain;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "TCandidato", uniqueConstraints =@UniqueConstraint(columnNames={"numero"})
 )
public class Candidato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numero;
	private String nome;
	
	@OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JoinColumn(name = "idCandidato")
	@JsonManagedReference(value = "voto-candidato")
	private List<Voto> votos;
	@ManyToOne
	@JoinColumn(name = "idEleicao")
	@JsonBackReference(value= "candidato-eleicao")
	private Eleicao eleicao;
	
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Eleicao getEleicao() {
		return eleicao;
	}
	public void setEleicao(Eleicao eleicao) {
		this.eleicao = eleicao;
	}
	public List<Voto> getVotos() {
		return votos;
	}
	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
