
package controllers;

import models.Producto;

import models.Usuario;
import play.mvc.Before;
import play.mvc.With;

@With(Secure.class)
@Check("isAdmin")
@CRUD.For(Producto.class)
public class Productos extends CRUD {
	



}

