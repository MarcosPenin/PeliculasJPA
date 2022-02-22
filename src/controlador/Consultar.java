package controlador;

import java.util.List;

import org.hibernate.Session;

import modelo.Actor;
import modelo.Director;
import modelo.Pelicula;
import vista.Mensajes;

public class Consultar {

//Ver una pelicula
	public static void verPelicula(Session session) {
		int codigo=1;
		String c="select i from Pelicula i";
		List<Pelicula> peliculas=session.createQuery(c).list();
		
		if (peliculas.isEmpty()) {
			System.out.println("Todavía no se han añadido películas");
	
		}		
		boolean flag=true;
		for (Pelicula i : peliculas) {
			if (i.getIdPelicula()==codigo) {
				System.out.println(i.toString());
				flag=false;
			}
		}
		if (flag) {
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
		String c = "select i from Actor i";
		List<Actor> actores = session.createQuery(c).list();
		if (actores.isEmpty()) {
			System.out.println("sin actores");
		}
		boolean flag = true;
		for (Actor i : actores) {
			if (i.getDniActor().equalsIgnoreCase(dniActor)) {
				System.out.println(i.getPeliculas().toString());
				flag = false;
			}
		}
		if (flag) {
			System.out.println("actor no encontrado");
		}
	}
	

	
//Ver los actores de una película	
	
	public static void actoresPelicula(Session session) {
		int codigo=1;
		String c="select i from Pelicula i";
		List<Pelicula> peliculas=session.createQuery(c).list();
		boolean flag = true;
		for (Pelicula i : peliculas) {
			if (i.getIdPelicula()==codigo) {
				System.out.println(i.getActores().toString());
				flag = false;
			}
		}
		if (flag) {
			System.out.println("pelicula no encontrada");
		}
		
	}
	
	
//Ver las películas de un director
	
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
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
}
