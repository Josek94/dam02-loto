package com.prueba.dam02_loto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.dam02_loto.service.ImagenService;


@Controller
public class ImagenController {

	@Autowired
	ImagenService imagenService;
	
	
	
	@GetMapping("/imagen")
	public String imagenes(Model model, 
			@RequestParam(name = "pais", required = false)String pais, 
			@RequestParam(name = "imagenActual", required = false) String imagenActual) {
		if(pais != null && imagenActual != null) {
			String paisCorrecto = imagenService.getPaisDeImagen(imagenActual);
			if(pais.equalsIgnoreCase(paisCorrecto)) {
				imagenService.sumarContador(1);
			} else {
				imagenService.setContadorTo0();
			}
		}
		
		model.addAttribute("titulo", "Juego de Imagenes");
		model.addAttribute("titular", "Juego de las imagenes");
		model.addAttribute("score", imagenService.getContador());
		model.addAttribute("imagenRandom", imagenService.getImagenRandom());
		
		return "imagen/menu";
	}
	
}
