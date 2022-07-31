package com.leandro.jogos.domain;

public class Administrador extends Pessoa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String funcao;
	
	public Administrador() {
		
	}

	public Administrador(Integer id, String nome, String email, String codNacional, String funcao) {
		super(id, nome, email, codNacional);
		this.setFuncao(funcao);
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
}
