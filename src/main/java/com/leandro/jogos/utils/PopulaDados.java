package com.leandro.jogos.utils;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.leandro.jogos.domain.Categoria;
import com.leandro.jogos.domain.Cidade;
import com.leandro.jogos.domain.Estado;
import com.leandro.jogos.domain.Produto;
import com.leandro.jogos.repository.CategoriaRepository;
import com.leandro.jogos.repository.CidadeRepository;
import com.leandro.jogos.repository.EstadoRepository;
import com.leandro.jogos.repository.ProdutoRepository;

@Component
public class PopulaDados {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@Autowired
	EstadoRepository estadoRepository;
	
	@Autowired
	CidadeRepository cidadeRepository;
	
	
	@PostConstruct
	public  void cadastrar() {
		Categoria cat1 = new Categoria(null, "Esportes");
		Categoria cat2 = new Categoria(null, "Luta");
		Categoria cat3 = new Categoria(null, "Guerra");
		Categoria cat4 = new Categoria(null, "Plataforma");
		Categoria cat5 = new Categoria(null, "RPG");
		
		Produto p1 = new Produto(null, "SNES", 80.00);
		Produto p2 = new Produto(null, "Playstation", 380.00);
		Produto p3 = new Produto(null, "X-BOX", 280.00);
		Produto p4 = new Produto(null, "MegaDrive", 70.00);
		Produto p5 = new Produto(null, "Nintendo64", 90.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3,p4,p5));
		cat2.getProdutos().addAll(Arrays.asList(p1,p2,p3,p4,p5));
		cat3.getProdutos().addAll(Arrays.asList(p1,p2,p3,p4,p5));
		cat4.getProdutos().addAll(Arrays.asList(p1,p2,p3,p4,p5));
		cat5.getProdutos().addAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		p1.getCategorias().addAll(Arrays.asList(cat1,cat2,cat3,cat4,cat5));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2,cat3,cat4,cat5));
		p3.getCategorias().addAll(Arrays.asList(cat1,cat2,cat3,cat4,cat5));
		p4.getCategorias().addAll(Arrays.asList(cat1,cat2,cat3,cat4,cat5));
		p5.getCategorias().addAll(Arrays.asList(cat1,cat2,cat3,cat4,cat5));
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3,cat4,cat5));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		Estado est1 = new Estado(null, "Paraná");
		Estado est2 = new Estado(null, "São Paulo");
		
		Cidade c1 = new Cidade(null, "Curitiba", est1);
		Cidade c2 = new Cidade(null, "Londrina", est1);
		Cidade c3 = new Cidade(null, "São José", est1);
		Cidade c4 = new Cidade(null, "Foz do Iguaçu", est1);
		Cidade c5 = new Cidade(null, "São Paulo", est2);
		Cidade c6 = new Cidade(null, "Campinas", est2);
		Cidade c7 = new Cidade(null, "São Bernardo", est2);
		Cidade c8 = new Cidade(null, "São Caetano", est2);
		
		est1.getCidades().addAll(Arrays.asList(c1,c2,c3,c4));
		est2.getCidades().addAll(Arrays.asList(c5,c6,c7,c8));
		
		estadoRepository.saveAll(Arrays.asList(est1,est2));
		cidadeRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8));
		
				
	}
}
