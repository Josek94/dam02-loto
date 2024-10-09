package com.prueba.dam02_loto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
	public String infoLibro(Model model, @PathVariable int id) {
		model.addAttribute("titulo", "informacion del libro:");
		model.addAttribute("id", libroService.getLibroById(id).getId());
		model.addAttribute("titulolibro", libroService.getLibroById(id).getTitulo());
		model.addAttribute("autor", libroService.getLibroById(id).getAutor());
		model.addAttribute("genero", libroService.getLibroById(id).getGenero());
		model.addAttribute("cantidadejemplares", libroService.getLibroById(id).getCantidadEjemplares());
		return "libro/info-libro";
	}
}
