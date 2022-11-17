package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	

	
	private Consola () {
		
	}
	
	
	
	public static void mostrarMenu() {
		System.out.println("REINA AJEDREZ");
		System.out.println("**************");
		System.out.println("              ");
		System.out.println("1. Crear Reina por defecto.");
		System.out.println("2. Crear Reina eligiendo color.");
		System.out.println("3. Mover.");
		System.out.println("4. Salir.");
		
	}
	
	public static int elegirOpcionMenu() {
		int numIntroducido;
		
		System.out.println("Introduce una opción válida: ");
		numIntroducido = Entrada.entero();
		
		while (numIntroducido < 1 || numIntroducido > 4) {
			System.out.println("Introduce una opción válida: ");
			numIntroducido = Entrada.entero();
		}
		
		return numIntroducido;
		
	}
	
	public static Color elegirColor() {
		
		int numIntroducidoColor;
		
		
		System.out.println("1. Blanco. ");
		System.out.println("2. Negro. ");
		
		System.out.println("Elige el color de la Reina:");
		numIntroducidoColor = Entrada.entero();
		
		while (numIntroducidoColor < 1 || numIntroducidoColor > 2) {
			System.out.println("Introduce una opción válida: ");
			numIntroducidoColor = Entrada.entero();
		}
		
		if(numIntroducidoColor == 1) {
			return Color.BLANCO;
		} else {
			return Color.NEGRO;
		}
		
	}
	
	
	
	
	
	public static void mostrarMenuDirecciones() {
		
		System.out.println("1. Norte. ");
		System.out.println("2. Sur. ");
		System.out.println("3. Este. ");
		System.out.println("4. Oeste. ");
		System.out.println("5. Noreste. ");
		System.out.println("6. Noroeste. ");
		System.out.println("7. Sureste. ");
		System.out.println("8. Suroeste. ");
		
		
	}
	
	public static Direccion elegirDireccion() {
		
		int numIntroducidoDireccion;
		
		System.out.println("Elige la direccion de la Reina:");
		numIntroducidoDireccion = Entrada.entero();
		
		while (numIntroducidoDireccion < 1 || numIntroducidoDireccion > 8) {
			System.out.println("Introduce una opción válida: ");
			numIntroducidoDireccion = Entrada.entero();
		}
		
		Direccion direccionIntroducida = null;
		
		switch(numIntroducidoDireccion) {
		
		case 1:
			direccionIntroducida = Direccion.NORTE;
			break;
			
		case 2:
			direccionIntroducida = Direccion.SUR;
			break;
			
		case 3:
			direccionIntroducida = Direccion.ESTE;
		
		
		case 4:
			direccionIntroducida = Direccion.OESTE;
			break;
			
		case 5:
			direccionIntroducida = Direccion.NORESTE;
			break;
			
		case 6:
			direccionIntroducida = Direccion.SURESTE;
			break;
			
		case 7:
			direccionIntroducida = Direccion.SUROESTE;
			break;
		}
		
		return direccionIntroducida;
	}
	
	public static int elegirPasos() {
		
		int numPasos;
		
		System.out.println("Elige el numero de pasos entre 1 y 7. ");
		numPasos = Entrada.entero();
		
		while (numPasos < 1 || numPasos > 7) {
			System.out.println("Introduce una opción válida: ");
			numPasos = Entrada.entero();
		}
		
		return numPasos;
		
	}
	
	public static void despedirse() {
		
		System.out.println("Hasta luego. ");
		
	}
	
	
}
