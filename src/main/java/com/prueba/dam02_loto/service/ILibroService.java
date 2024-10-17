package com.prueba.dam02_loto.service;

import java.util.List;

import com.prueba.dam02_loto.model.Genero;
import com.prueba.dam02_loto.model.Libro;

public interface ILibroService {
	Libro getLibroById(int id);
	List<Libro> getListByGenero(Genero genero);

}
