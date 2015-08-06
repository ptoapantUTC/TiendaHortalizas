package models;

import play.*;

import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Compra extends Model {
	@ManyToOne
    public Usuario cliente;
    public Date fecha;
   
    public int cantidad;
	public Compra(Usuario cliente, int cantidad) {
		super();
		this.cliente = cliente;
		this.cantidad = cantidad;
		this.fecha=new Date();
	}    
}
