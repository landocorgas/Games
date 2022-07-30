package com.leandro.jogos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandro.jogos.domain.Categoria;
import com.leandro.jogos.repository.CategoriaRepository;
import com.leandro.jogos.service.exceptions.ObjetoNaoEncontradoException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(()-> new ObjetoNaoEncontradoException("Objeto não encontrado.ID: "+ id +",Tipo: "+ Categoria.class.getName()));
		
	}
}
