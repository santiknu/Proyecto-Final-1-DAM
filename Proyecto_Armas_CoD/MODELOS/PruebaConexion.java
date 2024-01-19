package MODELOS;

import java.sql.Connection;

public class PruebaConexion {

	public static void main(String[] args) {
		
		Connection c =    ConfiguracionBD.conectarConBaseDeDatos();
		  if(c != null)
		  {
			  System.out.println("CONEXION OK");
		  }
		  else {
			  System.out.println("ERROR AL CONECTAR");
		  }
	}

}
