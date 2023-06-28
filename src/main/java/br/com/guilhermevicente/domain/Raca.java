package br.com.guilhermevicente.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Raca {

	@Id
	private Integer id;
	private String nome;
	private Integer especieId;

	public Raca() {
		super();
	}

	public Raca(final Integer id, final String nome, final Integer especieId) {
		super();
		this.id = id;
		this.nome = nome;
		this.especieId = especieId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public Integer getEspecieId() {
		return especieId;
	}

	public void setEspecieId(final Integer especieId) {
		this.especieId = especieId;
	}

	@Override
	public String toString() {
		return "Raca [id=" + id + ", nome=" + nome + ", especieId=" + especieId + "]";
	}
}
