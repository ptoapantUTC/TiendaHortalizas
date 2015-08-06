package controllers;

import java.util.List;

import models.Compra;
import models.Estadistica;
import models.Notaventa;
import models.Producto;
import models.Promocion;
import models.Usuario;
import play.mvc.Before;
import play.mvc.Controller;

public class Compras extends Controller {
	@Before
	public static void mostrarUsuario(){
		try{
			Usuario user = Usuario.find("byEmail", Security.connected()).first();
			//obteniendo datos del usuario que ha iniciado sesion
			if(Security.isConnected()) {
		        renderArgs.put("conectado", user.Nombre+" "+user.Apellido); 
		    }
			}catch(Exception ex){
				
			}
	}

    public static void index() {
        render();
    }
    
    
    
    public static void listaPromociones(){
    	List<Promocion> promociones=Promocion.findAll();
    	
    	render(promociones);
    }
    
    public static void listaProductos(){
    	List<Producto> productos=Producto.findAll();
    	render(productos);
    }
    
    public static void stock(){
    	List<Producto> productos=Producto.findAll();
    	render(productos);
    }
    

    public static void prods(Long id) {
    	System.out.println("se llamo");
    	Producto p = Producto.findById(id);    
        render(p);
    }
    

    
    public static void repo(){
		Usuario usu = Usuario.find("byEmail", Security.connected()).first();
		List<Compra> com= Compra.find("cliente_id=?",usu.id).fetch();
		//res.get(1).lista.valor
		render(com);
	}


    public static void estadisticas(){
    	List<Usuario> usuarios=Usuario.findAll();
    	List<Estadistica> estadisticas=Estadistica.findAll();
    	
    	
    	render(usuarios,estadisticas);
    }
    
    public static void estadisticasCliente(long id){
    	Usuario usuario=Usuario.findById(id);
    	List<Estadistica> estadisticas=Estadistica.find("byUsuario_id",usuario.id).fetch();
    	List<Compra> com= Compra.find("cliente_id=?",usuario.id).fetch();
		//res.get(1).lista.valor
    	
    	render(estadisticas,usuario,com);  
    }

    

}
