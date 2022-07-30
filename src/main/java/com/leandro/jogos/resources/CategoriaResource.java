package com.leandro.jogos.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leandro.jogos.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> mostrar() {
		
		Categoria cat1 = new Categoria(1, "Esportes");
		Categoria cat2 = new Categoria(2, "Luta");
		Categoria cat3 = new Categoria(3, "Guerra");
		Categoria cat4 = new Categoria(4, "Plataforma");
		Categoria cat5 = new Categoria(5, "RPG");
		
		List<Categoria> lista = new ArrayList<>();
		
		lista.add(cat1);
		lista.add(cat2);
		lista.add(cat3);
		lista.add(cat4);
		lista.add(cat5);
		
		
		return lista;
	}

}
