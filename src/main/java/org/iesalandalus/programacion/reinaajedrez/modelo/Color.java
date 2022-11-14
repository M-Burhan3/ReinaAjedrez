package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Color {
	
	
	BLANCO("Blanco"),
	NEGRO("Negro");
	
	
	
	String cadenaAMostrar;
	
	private Color(String cadena) {
		this.cadenaAMostrar = cadena;
	}
	
	public String toString() {
		return this.cadenaAMostrar;
	}
	
	
	
}
