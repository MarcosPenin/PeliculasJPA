package controlador;

import org.hibernate.Session;

import modelo.Actor;
import modelo.Director;
import modelo.Pelicula;
import vista.Mensajes;

public class Borrar {

	
	public static void borrarPelicula(Session session) {

		int idPelicula = 3;
		session.get(Pelicula.class, idPelicula);
		Pelicula pelicula = session.get(Pelicula.class, idPelicula);
		try {
			session.remove(pelicula);
			session.getTransaction().commit();
		} catch (IllegalArgumentException e) {
			Mensajes.peliculaNoEncontrada();
		}
	}
	
	
	public static void borrarDirector(Session session) {

		String dniDirector = "ppppppp";
		session.get(Director.class, dniDirector);
		Director director = session.get(Director.class, dniDirector);
		try {
			session.remove(director);
			session.getTransaction().commit();
		} catch (IllegalArgumentException e) {
			Mensajes.directorNoEncontrado();
		}
	}
	
	
	public static void borrarActor(Session session) {

		String dniActor = "ffffff";
		session.get(Actor.class, dniActor);
		Actor actor = session.get(Actor.class, dniActor);
		try {
			session.remove(actor);
			session.getTransaction().commit();
		} catch (IllegalArgumentException e) {
			Mensajes.actorNoEncontrado();
		}
	}
	

	
	
	

}
