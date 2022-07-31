package com.leandro.jogos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandro.jogos.domain.Pessoa;
import com.leandro.jogos.repository.PessoaRepository;
import com.leandro.jogos.service.exceptions.ObjetoNaoEncontradoException;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repo;
	
	public Pessoa find(Integer id) {
		Optional<Pessoa> obj = repo.findById(id);
		return obj.orElseThrow(()-> new ObjetoNaoEncontradoException("Objeto não encontrado.ID: "+ id +",Tipo: "+ Pessoa.class.getName()));
		
	}
}
