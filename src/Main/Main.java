package Main;

import org.hibernate.Session;

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
		VerMenu.menuPrincipal(session);		
		session.close();
		Mensajes.sesionTerminada();

	}

}



