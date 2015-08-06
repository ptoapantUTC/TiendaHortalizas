package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Usuario extends Model {
	public String email;
	public String Nombre;
	public String Apellido;
	public long Cedula;
	public String Direccion;
	public long telefono;
	public String Password;
	public boolean isAdmin;
	
	
	//Constructor
	public Usuario(String email, String nombre, String apellido, long cedula, String direccion, long telefono,String password) {
		super();
		this.email = email;
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Cedula= cedula;
		this.Direccion = direccion;
		this.telefono= telefono;
		this.Password = password;
		this.isAdmin=false;
	}
	
	
    
}
