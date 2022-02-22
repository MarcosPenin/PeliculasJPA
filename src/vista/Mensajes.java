package vista;

import java.util.Scanner;

public class Mensajes {

	static Scanner sc = new Scanner(System.in);

	public static void dniNoEncontrado() {
		System.out.println("No se ha encontrado ning�n autor con ese DNI");
	}

	public static void codigoNoEncontrado() {
		System.out.println("No se ha encontrado ning�n libro con ese c�digo");

	}

	public static void sesionTerminada() {
		System.out.println("Sesi�n terminada. �Hasta la pr�xima!");

	}

	public static void libroNoEncontrado() {
		System.out.println("No se ha encontrado ning�n libro con ese titulo");

	}

	public static void autorNoEncontrado() {
		System.out.println("No se ha encontrado ning�n autor con ese nombre");

	}

	public static void sinLibros() {
		System.out.println("A�n no se ha registrado ning�n libro");

	}

	public static void sinAutores() {
		System.out.println("A�n no se ha registrado ning�n autor");
		
	}

	public static void actorNoEncontrado() {
		System.out.println("No existe ning�n actor con ese dni");
		
	}

	public static void peliculaNoEncontrada() {
		System.out.println("No existe ninguna pel�cula con ese c�digo");
		
	}

	public static void directorNoEncontrado() {
		System.out.println("No existe ning�n director con ese dni");
		
	}

	public static void sinPeliculas() {
		System.out.println("Todav�a no se ha a�adido ninguna pel�cula;");
		
	}

	public static void sinActores() {
		System.out.println("Todav�a no se ha registrado ning�n actor");
		
	}

}
