package modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;




@Entity
@Table(name = "Pelicula")
public class Pelicula {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idPelicula", updatable = false, nullable = false)
	private int idPelicula;
	private String titulo;
	private String ano;

	@ManyToMany(cascade = { CascadeType.ALL }, mappedBy = "peliculas")
	private Set<Actor> actores = new HashSet();
	
	@ManyToOne
	@JoinColumn(name="dniDirector")
	private Director director;

	
	public Pelicula(){}
	
	public Pelicula(String titulo, String ano) {
		this.titulo = titulo;
		this.ano = ano;
	}
	
	
	
	
	public void addActor(Actor actor) {
		actores.add(actor);
	}
	

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Set<Actor> getActores() {
		return actores;
	}

	public void setActores(Set<Actor> actores) {
		this.actores = actores;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
	 
 
	public String toString() {
		return titulo;
	}

	

	
	
}
