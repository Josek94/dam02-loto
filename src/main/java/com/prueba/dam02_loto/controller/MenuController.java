package com.prueba.dam02_loto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.prueba.dam02_loto.service.MenuService;

@Controller
public class MenuController {

	// @value sirve para colocar el valor añadido en esta etiqueta a todos los
	// metodos handler.
	@Value("titulo")
	private String titulo = "Inicio";
	
	@Autowired
	MenuService menuService;

	@GetMapping({ "/home", "/", "" })
	public String inicio(Model model) {
		model.addAttribute("cabecera", "¡Bienvenidos al menu principal!");
		model.addAttribute("lorem",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis commodo lacus id suscipit pellentesque. "
				+ "Ut consequat molestie interdum. Aenean egestas leo ut varius feugiat. Interdum et malesuada fames ac ante ipsum primis "
				+ "in faucibus. Sed vitae nisi sed sem pulvinar tristique. Sed non arcu in arcu commodo pretium at hendrerit massa. "
				+ "Proin risus mi, faucibus et pellentesque nec, accumsan vitae ipsum. Vivamus porttitor ut magna quis scelerisque. "
				+ "Proin id turpis posuere, mollis felis fermentum, fringilla dui. Aliquam at metus tellus. "
				+ "Aliquam congue tellus ut suscipit blandit. Vivamus vel ex felis. Etiam enim metus, egestas nec mauris ut, "
				+ "ultricies lacinia lectus. Quisque luctus elementum diam, et rutrum odio vulputate eget. Nam ultrices ante erat. "
				+ "Cras tempus odio sed egestas condimentum.");
		model.addAttribute("proverbio", menuService.getProverbioRandom());

		return "home";
	}

}
