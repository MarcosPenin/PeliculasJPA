package controlador;

import org.hibernate.Session;

import modelo.Actor;
import modelo.Director;
import modelo.Pelicula;

public class CrearTablas {

	public static void crearTablas(Session session) {

		Pelicula p1 = new Pelicula("aaaaaaaa", "2000");
		Pelicula p2 = new Pelicula("bbbbbbbbbbbb", "2000");
		Pelicula p3=new Pelicula("cccccccccccccccc", "2000");
		Pelicula p4 = new Pelicula("dddddddddddddd", "2000");
		Pelicula p5 = new Pelicula("eeeeeeeeeeee", "2000");
		Pelicula p6=new Pelicula("ffffffffffffffff", "2000");
		
		Actor a1=new Actor("1","actor","primero");
		Actor a2=new Actor("2","actor","segundo");
		Actor a3=new Actor("3","actor","tercero");
		Actor a4=new Actor("4","actor","cuarto");
		
		Director d1=new Director("1","director","primero");
		Director d2=new Director("2","director","segundo");
		Director d3=new Director("3","director","tercero");
		Director d4=new Director("4","director","cuarto");
		
		p1.addActor(a1);
		a1.addPelicula(p1);
		a1.addPelicula(p2);
		a1.addPelicula(p3);
		d1.addPelicula(p1);
		d2.addPelicula(p3);
				
		session.save(a1);
		session.save(a2);
		session.save(d1);
		session.save(d2);

		session.getTransaction().commit();
	}

}
