package br.com.guilhermevicente.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pet {

	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String dataNascimento;

	@ManyToOne
	@JoinColumn(name = "raca_id")
	private Raca raca;

	@ManyToOne
	@JoinColumn(name = "especie_id")
	private Especie especie;

	public Pet() {
		super();
	}

	public Pet(final Integer id, final String nome, final String dataNascimento, final Raca raca,
			final Especie especie) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.raca = raca;
		this.especie = especie;
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(final String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(final Raca raca) {
		this.raca = raca;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(final Especie especie) {
		this.especie = especie;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", raca=" + raca
				+ ", especie=" + especie + "]";
	}
}
