package com.prueba.dam02_loto.service;

import java.util.List;

public interface IImagenService {
	String getImagenRandom();
	String getPaisDeImagen(String nombreImagen);
	void sumarContador(int cantidad);
}
