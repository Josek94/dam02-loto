package com.prueba.dam02_loto.service;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;


@Service
public class ImagenService implements IImagenService{

	private List<String> listaDeImagenes = generaLista();
	private Map<String, String> mapaDePaises = generaMapaPaises();
	private int contador = 0;
	
	
	private List<String> generaLista(){
		List<String> lista = new ArrayList<>();
		lista.add("atenas-grecia.jpg");
		lista.add("berlin-alemania.jpg");
		lista.add("bucarest-rumania.jpg");
		lista.add("estocolmo-suecia.jpg");
		lista.add("helsinki-finlandia.jpg");
		lista.add("londres-reino_unido.jpg");
		lista.add("malta-la_valeta.jpg");
		lista.add("madrid-españa.jpg");
		lista.add("paris-francia.jpg");
		lista.add("sofia-bulgaria.jpg");
		return lista;
	}
	
	 private Map<String, String> generaMapaPaises() {
	        Map<String, String> mapa = new HashMap<>();
	        mapa.put("atenas-grecia.jpg", "Grecia");
	        mapa.put("berlin-alemania.jpg", "Alemania");
	        mapa.put("bucarest-rumania.jpg", "Rumania");
	        mapa.put("estocolmo-suecia.jpg", "Suecia");
	        mapa.put("helsinki-finlandia.jpg", "Finlandia");
	        mapa.put("londres-reino_unido.jpg", "Reino Unido");
	        mapa.put("malta-la_valeta.jpg", "Malta");
	        mapa.put("madrid-españa.jpg", "España");
	        mapa.put("paris-francia.jpg", "Francia");
	        mapa.put("sofia-bulgaria.jpg", "Bulgaria");
	        return mapa;
	    }
	
	public String getImagenRandom() {
		return listaDeImagenes.get(new Random().nextInt(listaDeImagenes.size()));
	}
	
	public String getPaisDeImagen(String nombreImagen) {
        return mapaDePaises.getOrDefault(nombreImagen, "");
    }
	
	public void sumarContador(int cantidad) {
		contador += cantidad;
	}
	
	public void setContadorTo0() {
		contador = 0;
	}
	
	public int getContador() {
		return contador;
	}
}
