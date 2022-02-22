package modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;



@Entity
@Table(name = "Director")
public class Director {
	@Id
	@Column(name = "dniDirector", updatable = false, nullable = false)
	private String dniDirector;
	private String nombre;
	private String apellidos;

	
	 @OneToMany(cascade= CascadeType.ALL)
	    @JoinColumn(name="dniDirector")
	    private List<Pelicula> peliculas=new ArrayList<>();

	 @OneToOne(cascade = CascadeType.ALL)
		@PrimaryKeyJoinColumn
		private Telefono telefono;
	 
	 

	public Director(String dniDirector, String nombre, String apellidos) {
		super();
		this.dniDirector = dniDirector;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	
	public Telefono getTelefono() {
		return telefono;
	}


	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}


	public void addPelicula(Pelicula pelicula) {
		peliculas.add(pelicula);
	}
	
	

	public String getDniDirector() {
		return dniDirector;
	}


	public void setDniDirector(String dniDirector) {
		this.dniDirector = dniDirector;
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


	public List<Pelicula> getPeliculas() {
		return peliculas;
	}


	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	

	 
	 
	 
	 
	 
	}
	