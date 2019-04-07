package com.serviciorest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
//http://localhost:8080/ServicioREST/hola/amigo
@Path("/hola/{nombre}")
public class HolaMundoRest {
	@GET 
	@Produces("text/html")	
	public String holaMundo(@PathParam("nombre") String nombre) {
		return "Hola mono "+nombre;
	}
}
