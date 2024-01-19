package MODELOS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Armas.Secundaria;

public class ArmaSecundariaBD {
	
	public static ArrayList<Secundaria> obtenerArmasSecundarias() {
        Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
        if(conexion == null)
        {
            return null;
        }
        ArrayList<Secundaria> listaArmasS = new ArrayList<Secundaria>();
        try {
            Statement sentencia = conexion.createStatement();
            String ordenSQL = "SELECT * FROM secundaria ORDER BY tipo";
            ResultSet resultado = sentencia.executeQuery(ordenSQL);
            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String tipo = resultado.getString("tipo");
                int precio = resultado.getInt("precio");
                String alcance = resultado.getString("alcance");
                Secundaria a = new Secundaria(nombre,tipo,precio,alcance);              
                listaArmasS.add(a);
            }
            resultado.close();
            sentencia.close();
            conexion.close();
            return listaArmasS;
        } catch (SQLException e) {
            e.printStackTrace();
            return listaArmasS;
        }
    }
	
	public static ArrayList<Secundaria> buscarArmaSecundaria(String texto) {
        Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
        if(conexion == null)
        {
            return null;
        }
        ArrayList<Secundaria> listaArmasS = new ArrayList<Secundaria>();
        try {
        	
            String ordensql = "SELECT * FROM secundaria WHERE nombre LIKE ? ;";
            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
            String textobusqueda = "%"+texto+"%";
            sentencia.setString(1, textobusqueda);
            
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
            	String nombre = resultado.getString("nombre");
                String tipo = resultado.getString("tipo");
                int precio = resultado.getInt("precio");
                String alcance = resultado.getString("alcance");
                Secundaria a = new Secundaria(nombre,tipo,precio,alcance);              
                listaArmasS.add(a);
            }
            resultado.close();
            sentencia.close();
            conexion.close();
            return listaArmasS;
        } catch (SQLException e) {
            e.printStackTrace();
            return listaArmasS;
        }
    }
	
	public static Secundaria buscarArmaSecundariaSola(String texto) {
        Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
        if(conexion == null)
        {
            return null;
        }
        Secundaria a = null;
        try {
        	
            String ordensql = "SELECT * FROM secundaria WHERE nombre LIKE ? ;";
            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
            String textobusqueda = "%"+texto+"%";
            sentencia.setString(1, textobusqueda);
            
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
            	String nombre = resultado.getString("nombre");
                String tipo = resultado.getString("tipo");
                int precio = resultado.getInt("precio");
                String alcance = resultado.getString("alcance");
                a = new Secundaria(nombre,tipo,precio,alcance);              
            }
            resultado.close();
            sentencia.close();
            conexion.close();
            return a;
        } catch (SQLException e) {
            e.printStackTrace();
            return a;
        }
    }

	public static boolean insertarArmaSecundaria(Secundaria a) {
	       Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
	        if(conexion == null)
	        {
	            return false;
	        }
	        try {
	            String ordensql = "INSERT INTO secundaria (nombre,tipo,precio,alcance) VALUES (?,?,?,?);";
	            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
	            sentencia.setString(1, a.getNombre());
	            sentencia.setString(2, a.getTipo());
	            sentencia.setInt(3, (int) a.getPrecio());
	            sentencia.setString(4, a.getAlcance());
     

	            int filasafectadas = sentencia.executeUpdate();
	            if(filasafectadas > 0)
	            {
	                return true;
	            }
	            else {
	                return false;
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	}
	
	public static boolean eliminarArmaSecundaria(Secundaria a) {
	       Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
	        if(conexion == null)
	        {
	            return false;
	        }
	        try {
	            String ordensql = "DELETE FROM secundaria WHERE nombre LIKE ? ;";
	            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
	            sentencia.setString(1, a.getNombre());

	            int filasafectadas = sentencia.executeUpdate();
	            if(filasafectadas > 0)
	            {
	                return true;
	            }
	            else {
	                return false;
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	}

	public static boolean actualizarArmaSecundaria(Secundaria a) {
	       Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
	        if(conexion == null)
	        {
	            return false;
	        }
	        try {
	            String ordensql = "UPDATE secundaria SET nombre = ?, tipo = ?, precio = ?, alcance = ? WHERE nombre LIKE ? ;";
	            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
	            sentencia.setString(1, a.getNombre());
	            sentencia.setString(2, a.getTipo());
	            sentencia.setInt(3, (int) a.getPrecio());
	            sentencia.setString(4, a.getAlcance());
	            sentencia.setString(5, a.getNombre());
	            
	            int filasafectadas = sentencia.executeUpdate();
	            if(filasafectadas > 0)
	            {
	                return true;
	            }
	            else 
	            {
	                return false;
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	}
}
