package vista;


import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;

import controlador.Insertar;
import utilidades.Menu;
import utilidades.ControlData;

public class VerMenu {

	static Scanner sc = new Scanner(System.in);
	static Menu menuTablas = new Menu(tablas());
	static Menu menuConsultas=new Menu(consultas());
	static byte op;
	static Session session;

	public static void menuPrincipal(Session sesion) {
		session = sesion;
		Menu menuPrincipal = new Menu(opciones());
		byte opMenu;
		System.out.println("*********************************************************************");
		System.out.println("****************************BIENVENIDO*********************** ");

		do {
			System.out.println("*********************************************************************");
			System.out.println("Introduzca la opci�n que desee realizar:");
			menuPrincipal.printMenu();
			opMenu = ControlData.lerByte(sc);
			switch (opMenu) {
			case 1:
				menuInsertar();
				break;
			case 2:
//				menuBorrar();
				break;
			case 3:
//				menuConsultar();
				break;
			}
		} while (opMenu != 4);
	}

	public static void menuInsertar() {
		System.out.println("*********************************************************************");
		System.out.println("�Que desea a�adir?");
		menuTablas.printMenu();
		op = ControlData.lerByte(sc);
		switch (op) {
		case 1:
			Insertar.insertarPelicula(session);
			break;
		case 2:
			Insertar.insertarDirector(session);
			break;
		case 3: 
			Insertar.insertarActor(session);
			break;

		}

	}

//	public static void menuBorrar() {
//		System.out.println("*********************************************************************");
//		System.out.println("�Que desea borrar?");
//		menuTablas.printMenu();
//		op = ControlData.lerByte(sc);
//		switch (op) {
//		case 1:
//			Borrar.borrarAutor(session);
//			break;
//		case 2:
//			Borrar.borrarLibro(session);
//			break;	
//		}
//
//	}
//
//	public static void menuConsultar() {
//		System.out.println("*********************************************************************");
//		System.out.println("�Que desea consultar?");
//		menuConsultas.printMenu();
//		op = ControlData.lerByte(sc);
////		switch (op) {
//		case 1:
//			Consultar.libro(session);
//			break;
//		case 2:
//			Consultar.librosAutor(session);
//			break;
//		case 3:
//			Consultar.libros(session);
//			break;
//		case 4:
//			Consultar.todo(session);
//			break;
//		}
//	}
//}

	static ArrayList<String> opciones() {
		ArrayList<String> opciones = new ArrayList<String>();
		opciones.add("Inserciones");
		opciones.add("Borrados");
		opciones.add("Consultas");
		opciones.add("Salir");
		return opciones;
	}

	static ArrayList<String> tablas() {
		ArrayList<String> opciones = new ArrayList<String>();
		opciones.add("Pelicula");
		opciones.add("Director");
		opciones.add("Actor");
		opciones.add("Volver");
		return opciones;
	}

	static ArrayList<String> consultas() {
		ArrayList<String> opciones = new ArrayList<String>();
		opciones.add("Buscar libro por t�tulo");
		opciones.add("Buscar libros de un autor");
		opciones.add("Ver todos los libros");
		opciones.add("Ver todos los autores con sus libros");
		opciones.add("Volver");
		return opciones;
	}

}
