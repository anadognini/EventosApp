package com.entra21.eventoapp.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Evento implements Serializable {
	
	// Atributos
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String local;
	
	@NotBlank
	private String data;
	
	@NotBlank
	private String horario;
	
	@OneToMany
	private List<Convidado> convidados;

	// Getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	public List<Convidado> getConvidados() {
		return convidados;
	}

	public void setConvidados(List<Convidado> convidados) {
		this.convidados = convidados;
	}
}

/*
 * Serializable:
 * https://www.oracle.com/br/technical-resources/articles/java/serialversionuid.
 * html
 * https://pt.stackoverflow.com/questions/88270/qual-a-finalidade-da-interface-
 * serializable
 * https://www.devmedia.com.br/use-a-serializacao-em-java-com-seguranca/29012
 */

// Todo model vai se tornar uma tabela no banco de dados