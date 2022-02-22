package modelo;

import javax.persistence.*;


@Entity
@Table(name = "Telefono")
public class Telefono {
	@Id
	private String telefono;


	public Telefono() {}
	
	public Telefono(String telefono) {
		this.telefono=telefono;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


}
