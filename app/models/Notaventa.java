package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class Notaventa  extends Model{
	@ManyToOne
    public Usuario cliente;
	public Producto producto;
    public Date fecha;
    public int cantidad;
    public String descripcion;
     
    
	public Notaventa(Usuario cliente, Producto producto,String descripcion, int cantidad) {
		super();
		this.cliente = cliente;
		this.producto = producto;
		this.descripcion= descripcion;
		this.cantidad = cantidad;
		this.fecha=new Date();
	} 

	
}
