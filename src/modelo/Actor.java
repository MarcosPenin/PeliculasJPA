package modelo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Actor")
public class Actor {
	@Id
	@Column(name = "dniActor", updatable = false, nullable = false)
	private String dniActor;
	private String nombre;
	private String apellidos;


	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="actor_pelicula", joinColumns={@JoinColumn(name="dniActor")}, inverseJoinColumns={@JoinColumn(name="idPelicula")})
	private Set<Pelicula> peliculas = new HashSet<>();
	
	public void addPelicula(Pelicula pelicula) {
		peliculas.add(pelicula);
	}
	
	
	
	public String getDniActor() {
		return dniActor;
	}



	public void setDniActor(String dniActor) {
		this.dniActor = dniActor;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public Set<Pelicula> getPeliculas() {
		return peliculas;
	}



	public void setPeliculas(Set<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}



	public Actor(String dniActor, String nombre, String apellidos) {
		super();
		this.dniActor = dniActor;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}


	 
	
}
