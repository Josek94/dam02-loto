package com.prueba.dam02_loto.model;

public class Libro {
	
	private String titulo;
	private String autor;
	private int cantidadEjemplares;
	private Genero genero;
	private int id; 
	private static int nextId = 1;
	
	
	public Libro(String titulo, String autor, int cantidadEjemplares, Genero genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.cantidadEjemplares = cantidadEjemplares;
		this.genero = genero;
		id = nextId++;
	}


	public String getTitulo() {
		return titulo;
	}


	public String getAutor() {
		return autor;
	}


	public int getCantidadEjemplares() {
		return cantidadEjemplares;
	}


	public Genero getGenero() {
		return genero;
	}


	public int getId() {
		return id;
	}
	
	
	
	
}
