package com.prueba.dam02_loto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prueba.dam02_loto.model.Loto;

@Service
public class LotoService {

	private Loto loteriaAElegir;

	/*public Loto getLoteriaEspana() {
		return loteriaAElegir.SP;
	}
	
	public Loto getLoteriaFrancia() {
		return loteriaAElegir.FR;
	}
	
	public Loto getLoteriaAlemania() {
		return loteriaAElegir.GE;
	}
	
	public Loto getLoteriaItalia() {
		return loteriaAElegir.IT;
	}*/

	public List<Integer> getLoteria(String pais) {
		if(pais.equals(loteriaAElegir.SP.getNombre())) {
			return loteriaAElegir.SP.generarCombinacion();
		} else if(pais.equals(loteriaAElegir.FR.getNombre())) {
			return loteriaAElegir.FR.generarCombinacion();
		} else if(pais.equals(loteriaAElegir.GE.getNombre())) {
			return loteriaAElegir.GE.generarCombinacion();
		} else {
			return loteriaAElegir.IT.generarCombinacion();
		}
		
	}
	
	
	
}
