package MODELOS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Accesorios.Accesorios;

public class AccesoriosBD {
	
	public static ArrayList<Accesorios> obtenerAccesorios() {
        Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
        if(conexion == null)
        {
            return null;
        }
        ArrayList<Accesorios> listaAccesorios = new ArrayList<Accesorios>();
        try {
            Statement sentencia = conexion.createStatement();
            String ordenSQL = "SELECT * FROM accesorios ORDER BY acople";
            ResultSet resultado = sentencia.executeQuery(ordenSQL);
            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String acople = resultado.getString("acople");
                int precio = resultado.getInt("precio");
                Accesorios a = new Accesorios(nombre,acople,precio);
                listaAccesorios.add(a);
            }
            resultado.close();
            sentencia.close();
            conexion.close();
            return listaAccesorios;
        } catch (SQLException e) {
            e.printStackTrace();
            return listaAccesorios;
        }
    }
	
	public static ArrayList<Accesorios> buscarAccesorios(String texto) {
        Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
        if(conexion == null)
        {
            return null;
        }
        ArrayList<Accesorios> listaAccesorios = new ArrayList<Accesorios>();
        try {
        	
            String ordensql = "SELECT * FROM accesorios WHERE nombre LIKE ? ;";
            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
            String textobusqueda = "%"+texto+"%";
            sentencia.setString(1, textobusqueda);
            
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String acople = resultado.getString("acople");
                int precio = resultado.getInt("precio");
                Accesorios a = new Accesorios(nombre,acople,precio);
                listaAccesorios.add(a);
            }
            resultado.close();
            sentencia.close();
            conexion.close();
            return listaAccesorios;
        } catch (SQLException e) {
            e.printStackTrace();
            return listaAccesorios;
        }
    }

	public static boolean insertarAccesorios(Accesorios a) {
	       Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
	        if(conexion == null)
	        {
	            return false;
	        }
	        try {
	            String ordensql = "INSERT INTO accesorios (nombre,acople,precio) VALUES (?,?,?);";
	            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
	            sentencia.setString(1, a.getNombre());
	            sentencia.setString(2, a.getAcople());
	            sentencia.setInt(3, a.getPrecio());

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
	
	public static boolean eliminarAccesorio(Accesorios a) {
	       Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
	        if(conexion == null)
	        {
	            return false;
	        }
	        try {
	            String ordensql = "DELETE FROM accesorios WHERE Nombre LIKE ? ;";
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

	public static boolean actualizarAccesorio(Accesorios a) {
	       Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
	        if(conexion == null)
	        {
	            return false;
	        }
	        try {
	            String ordensql = "UPDATE accesorios SET Nombre = ?, Acople = ?, Precio = ? WHERE nombre LIKE ? ;";
	            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
	            sentencia.setString(1, a.getNombre());
	            sentencia.setString(2, a.getAcople());
	            sentencia.setInt(3, (int) a.getPrecio());
	            sentencia.setString(4, a.getNombre());
	            
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
