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

}
