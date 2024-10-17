package com.prueba.dam02_loto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.prueba.dam02_loto.service.LotoService;

@Controller
public class LotoController {
	
	@Autowired
	LotoService lotoService;
	
	@GetMapping({"/loto", "/loto/menu"})
	public String menuLoto(Model model) {
		model.addAttribute("cabecera", "¡Bienvenidos al menu de Loterias!");
		model.addAttribute("seleciona", "Selecciona un pais: ");
		return "loto/menu";
	}
	
	@GetMapping({"/loto/genera/49/6/{pais}", "/loto/genera/59/5/{pais}", "/loto/genera/90/6/{pais}"})
	public String menuLotoSp(Model model, @PathVariable String pais) {
		
			model.addAttribute("cabecera", "Loteria de " + pais);
			model.addAttribute("generaloto", "Los " + lotoService.getLoteria(pais).size() + " numeros son: \n"
					+ lotoService.getLoteria(pais));
		
		
		return "loto/genera";
	}
	
}
