package com.prueba.dam02_loto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prueba.dam02_loto.model.Genero;
import com.prueba.dam02_loto.model.Libro;

@Service
public class LibroService implements ILibroService{
	private List<Libro> listaDeLibros = generarLista();
	
	
	
	private List<Libro> generarLista(){
		List<Libro> lista = new ArrayList<>();
        lista.add(new Libro("1984", "George Orwell", 5, Genero.FICCION));
        lista.add(new Libro("El Hobbit", "J.R.R. Tolkien", 3, Genero.FANTASIA));
        lista.add(new Libro("Cien Años de Soledad", "Gabriel García Márquez", 7, Genero.FICCION));
        lista.add(new Libro("Matar a un ruiseñor", "Harper Lee", 4, Genero.HISTORIA));
        lista.add(new Libro("Crimen y Castigo", "Fiódor Dostoyevski", 6, Genero.MISTERIO));
        lista.add(new Libro("La Odisea", "Homero", 2, Genero.AVENTURA));
        lista.add(new Libro("Drácula", "Bram Stoker", 4, Genero.TERROR));
        lista.add(new Libro("Frankenstein", "Mary Shelley", 3, Genero.TERROR));
        lista.add(new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 9, Genero.FANTASIA));
        lista.add(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 10, Genero.FANTASIA));
        lista.add(new Libro("Los Miserables", "Victor Hugo", 7, Genero.HISTORIA));
        lista.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 5, Genero.AVENTURA));
        lista.add(new Libro("El Código Da Vinci", "Dan Brown", 8, Genero.MISTERIO));
        lista.add(new Libro("Los Juegos del Hambre", "Suzanne Collins", 6, Genero.AVENTURA));
        lista.add(new Libro("El Principito", "Antoine de Saint-Exupéry", 12, Genero.FICCION));
        lista.add(new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 5, Genero.MISTERIO));
        lista.add(new Libro("It", "Stephen King", 4, Genero.TERROR));
        lista.add(new Libro("Cumbres Borrascosas", "Emily Brontë", 3, Genero.ROMANCE));
        lista.add(new Libro("La Divina Comedia", "Dante Alighieri", 2, Genero.POESIA));
        lista.add(new Libro("Un Mundo Feliz", "Aldous Huxley", 7, Genero.CIENCIA_FICCION));
        lista.add(new Libro("El Alquimista", "Paulo Coelho", 8, Genero.FICCION));
        lista.add(new Libro("Juego de Tronos", "George R.R. Martin", 11, Genero.FANTASIA));
        lista.add(new Libro("La Iliada", "Homero", 3, Genero.HISTORIA));
        lista.add(new Libro("El Viejo y el Mar", "Ernest Hemingway", 4, Genero.AVENTURA));
        
        return lista;
	}
	
	public List<Libro> getListLibros(){
		return listaDeLibros;
	}
	
	public Libro getLibroById(int id) {
		Libro libroById = listaDeLibros.stream().filter(l -> l.getId() == id).findFirst().orElse(null);
		return libroById;
	}
	
	public List<Libro> getListByGenero(Genero genero){
		return listaDeLibros.stream().filter(l -> l.getGenero() == genero).toList();
		
		
	}
	
}
