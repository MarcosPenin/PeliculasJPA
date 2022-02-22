package controlador;

import java.util.List;

import org.hibernate.Session;

import modelo.Actor;
import modelo.Director;
import modelo.Pelicula;

public class Consultar {

//Ver una pelicula
	public static void verPelicula(Session session) {
		int codigo=9;
		String c="select i from Pelicula i where idPelicula='"+codigo+"'";
		Pelicula pelicula=(Pelicula) session.createQuery(c).uniqueResult();		
		if(pelicula!=null) {
			System.out.println(pelicula.toString());
		}else {
			System.out.println("No se ha encontrado la película");
		}
	}
	
//Ver todas las películas
	
	public static void verPeliculas(Session session) {
		String c="select i from Pelicula i";
		List<Pelicula> peliculas=session.createQuery(c).list();

		if (peliculas.isEmpty()) {
			System.out.println("Todavía no se han añadido películas");
		}
		for (Pelicula x : peliculas) {
			System.out.println(x.toString());
		}
	}
	
	
//Ver las películas de un actor 
		
	public static void peliculasActor(Session session) {
		String dniActor="1";
		String c = "select i from Actor i where dniActor='"+dniActor+"'";
		Actor actor = (Actor) session.createQuery(c).uniqueResult();		
		if(actor!=null) {
			System.out.println(actor.getPeliculas().toString());
		}else {
			System.out.println("No se ha encontrado ningún actor con ese dni");
		}
			
	}
	

	
//Ver los actores de una película	
	
	public static void actoresPelicula(Session session) {
		int codigo=1;
		String c="select i from Pelicula i where idPelicula='"+codigo+"'";
		Pelicula pelicula = (Pelicula) session.createQuery(c).uniqueResult();	
		if(pelicula!=null) {
			System.out.println(pelicula.getActores().toString());
		}else {
			System.out.println("No se ha encontrado ninguna película con ese código");
		}
		
	}
	
	
//Ver las películas de un director, alternativa poco eficiente
	
	public static void peliculasDirector(Session session) {
		String dniDirector="1";
		String c = "select i from Director i";
		List<Director> directores = session.createQuery(c).list();
		if (directores.isEmpty()) {
			System.out.println("sin directores");
		}
		boolean flag = true;
		for (Director i : directores) {
			if (i.getDniDirector().equalsIgnoreCase(dniDirector)) {
				System.out.println(i.getPeliculas().toString());
				flag = false;
			}
		}
		if (flag) {
			System.out.println("director no encontrado");
		}
	}
	
	//Ver teléfono de un director
	
	public static void telefonoDirector(Session session) {
		String dniDirector="1";
		String c = "select i from Director i where dniDirector="+dniDirector+"'";
		Director director = (Director) session.createQuery(c).uniqueResult();
		
		if(director!=null) {
			System.out.println(director.getTelefono().toString());
		}else {
			System.out.println("Director no encontrado");
		}
		
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
}
