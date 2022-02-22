package Main;

import org.hibernate.Session;

import controlador.Consultar;
//import Vista.VerMenu;
import controlador.CrearTablas;
import controlador.Sesion;
import vista.Mensajes;
import vista.VerMenu;

public class Main {

	public static void main(String[] args) {
		Session session = Sesion.abrirSesion();
		session.beginTransaction();
//		CrearTablas.crearTablas(session);	
//		VerMenu.menuPrincipal(session);	
//		System.out.println("--------------------------");
//		Consultar.verPeliculas(session);
//		System.out.println("--------------------------");
//		Consultar.verPelicula(session);
//		System.out.println("--------------------------");
		Consultar.peliculasActor(session);
//		System.out.println("--------------------------");
//		Consultar.peliculasDirector(session);
//		System.out.println("--------------------------");
//		Consultar.actoresPelicula(session);
		session.close();
		Mensajes.sesionTerminada();

	}

}



