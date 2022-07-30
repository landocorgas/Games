package com.leandro.jogos.utils;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.leandro.jogos.domain.Categoria;
import com.leandro.jogos.repository.CategoriaRepository;

@Component
public class PopulaDados {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@PostConstruct
	public  void cadastrar() {
		Categoria cat1 = new Categoria(null, "Esportes");
		Categoria cat2 = new Categoria(null, "Luta");
		Categoria cat3 = new Categoria(null, "Guerra");
		Categoria cat4 = new Categoria(null, "Plataforma");
		Categoria cat5 = new Categoria(null, "RPG");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5));
	}
}
