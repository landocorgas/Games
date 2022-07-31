package com.leandro.jogos.domain;

public class Visitante extends Pessoa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String tipo;
	
	public Visitante() {
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Visitante(Integer id, String nome, String email, String codNacional, String tipo) {
		super(id, nome, email, codNacional);
		this.tipo = tipo;
	}
	
}
