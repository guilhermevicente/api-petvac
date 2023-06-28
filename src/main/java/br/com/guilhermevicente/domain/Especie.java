package br.com.guilhermevicente.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Especie {

	@Id
	private Integer id;
	private String nome;

	public Especie() {
		super();
	}

	public Especie(final Integer id, final String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Especie [id=" + id + ", nome=" + nome + "]";
	}
}