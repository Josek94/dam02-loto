package com.prueba.dam02_loto.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Loto {
	SP("spain",49,6),FR("france",90,6),GE("germany",49,6),IT("italy",59,5);
	
	private String nombre;
	private int numMax;
	private int numerosAEscoger;
	
	
	private Loto(String nombre, int numMax, int numerosAEscoger) {
		this.nombre = nombre;
		this.numMax = numMax;
		this.numerosAEscoger = numerosAEscoger;
	}


	public String getNombre() {
		return nombre;
	}


	public int getNumMax() {
		return numMax;
	}


	public int getNumerosAEscoger() {
		return numerosAEscoger;
	}
	
	
	public List<Integer> generarCombinacion() {
		List<Integer> listaCombinacion = new ArrayList<>();
		for(int i = 0; i < numerosAEscoger; i++) {
			listaCombinacion.add(new Random().nextInt(numMax)+1);
		}
		return listaCombinacion;
	}
	
}
