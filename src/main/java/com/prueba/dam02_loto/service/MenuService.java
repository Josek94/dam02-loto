package com.prueba.dam02_loto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class MenuService {
	
	
	
	private String generaProverbioAleatorio() {
		List<String> listaProvervios = new ArrayList<>();
		listaProvervios.add("«Si te caes siete veces, levántate ocho»");
		listaProvervios.add("«Si quieres que algo se haga, encárgaselo a una persona ocupada»");
		listaProvervios.add("«El mejor momento para plantar un árbol fue hace 20 años. El segundo mejor momento es ahora»");
		listaProvervios.add("«Un caballo ciego siempre se asusta a sí mismo»");
		listaProvervios.add("«El sabio puede sentarse en un hormiguero, pero sólo el necio se queda sentado en él»");
		listaProvervios.add("«Distintas cerraduras se deben abrir con diferentes llaves»");
		listaProvervios.add("«Cava el pozo antes de tener sed»");
		listaProvervios.add("«Es más fácil variar el curso de un río que el carácter de un hombre»");
		listaProvervios.add("«Debes ingresar a la guarida del tigre para atrapar a sus cachorros»");
		listaProvervios.add("«Jamás se desvía uno tan lejos como cuando cree conocer el camino»");
		
		String proverbioSelecionado = listaProvervios.get(new Random().nextInt(10));
		
		return proverbioSelecionado;
	}
	
	public String getProverbioRandom() {
		return generaProverbioAleatorio();
	}
}
