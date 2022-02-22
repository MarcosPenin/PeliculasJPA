package controlador;

import org.hibernate.Session;

import modelo.Actor;
import modelo.Director;
import modelo.Pelicula;
import vista.*;

public class Insertar {

	public static void insertarPelicula(Session session) {
		Pelicula pelicula = new Pelicula("xxxxxxxxxxx","xxx");
		session.save(pelicula);
		session.getTransaction().commit();

	}
	public static void insertarDirector(Session session) {
		Director director = new Director("y","yyyy","xxx");
		session.save(director);
		session.getTransaction().commit();

	}
	public static void insertarActor(Session session) {
		Actor actor = new Actor("z","z","z");
		session.save(actor);
		session.getTransaction().commit();

	}
	
	
	
	
	
	

}