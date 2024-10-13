package com.prueba.dam02_loto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.prueba.dam02_loto.model.Genero;
import com.prueba.dam02_loto.service.LibroService;

@Controller
public class LibroController {
	
	@Autowired
	LibroService libroService;
	
	@GetMapping("libros")
	public String homeLibro(Model model) {
		model.addAttribute("titulo", "Lista de libros");
		model.addAttribute("texto", "Mostrando la lista de libros");
		model.addAttribute("listaLibros", libroService.getListLibros());
		
		return "libro/lista-libro";
	}
	@GetMapping("libros/info/{id}")
	public String infoLibro(Model model, @PathVariable String id) {
	try {
		int id1 = Integer.parseInt(id);
		model.addAttribute("titulo", "informacion del libro:");
		model.addAttribute("libro", libroService.getLibroById(id1));

	}catch (Exception e) {
		
	}

		return "libro/info-libro";
	}

	@GetMapping("libros/lista/{genero}")
	public String infoListaGenero(Model model, @PathVariable Genero genero) {
		try {
			
			model.addAttribute("titulo", "informacion del libro:");
			model.addAttribute("listaGenero", libroService.getListByGenero(genero));

		}catch (Exception e) {
	
		}

		return "libro/lista-libro-filter-by-genero";
	}
}
