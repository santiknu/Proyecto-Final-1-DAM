package MODELOS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Armas.Principal;

public class ArmaPrincipalBD {
	
	public static ArrayList<Principal> obtenerArmasPrincipal() {
        Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
        if(conexion == null)
        {
            return null;
        }
        ArrayList<Principal> listaArmasP = new ArrayList<Principal>();
        try {
            Statement sentencia = conexion.createStatement();
            String ordenSQL = "SELECT * FROM principal ORDER BY nombre";
            ResultSet resultado = sentencia.executeQuery(ordenSQL);
            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String tipo = resultado.getString("tipo");
                int precio = resultado.getInt("precio");
                String camuflaje = resultado.getString("camuflaje");
                boolean cadencia = resultado.getBoolean("cadencia");
                Principal a = new Principal(nombre,tipo,precio,camuflaje,cadencia);              
                listaArmasP.add(a);
            }
            resultado.close();
            sentencia.close();
            conexion.close();
            return listaArmasP;
        } catch (SQLException e) {
            e.printStackTrace();
            return listaArmasP;
        }
    }
	
	public static ArrayList<Principal> buscarArmaPrincipal(String texto) {
        Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
        if(conexion == null)
        {
            return null;
        }
        ArrayList<Principal> listaArmasP = new ArrayList<Principal>();
        try {
        	
            String ordensql = "SELECT * FROM principal WHERE nombre LIKE ? ;";
            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
            String textobusqueda = "%"+texto+"%";
            sentencia.setString(1, textobusqueda);
            
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
            	String nombre = resultado.getString("nombre");
                String tipo = resultado.getString("tipo");
                int precio = resultado.getInt("precio");
                String camuflaje = resultado.getString("camuflaje");
                boolean cadencia = resultado.getBoolean("cadencia");
                Principal a = new Principal(nombre,tipo,precio,camuflaje,cadencia);              
                listaArmasP.add(a);
            }
            resultado.close();
            sentencia.close();
            conexion.close();
            return listaArmasP;
        } catch (SQLException e) {
            e.printStackTrace();
            return listaArmasP;
        }
    }
	
	public static Principal buscarArmaPrincipalSola(String texto) {
        Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
        if(conexion == null)
        {
            return null;
        }
        Principal a = null;
        try {
        	
            String ordensql = "SELECT * FROM principal WHERE nombre LIKE ? ;";
            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
            String textobusqueda = "%"+texto+"%";
            sentencia.setString(1, textobusqueda);
            
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
            	String nombre = resultado.getString("nombre");
                String tipo = resultado.getString("tipo");
                int precio = resultado.getInt("precio");
                String camuflaje = resultado.getString("camuflaje");
                boolean cadencia = resultado.getBoolean("cadencia");
                a = new Principal(nombre,tipo,precio,camuflaje,cadencia);
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

	public static boolean insertarArmaPrincipal(Principal a) {
	       Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
	        if(conexion == null)
	        {
	            return false;
	        }
	        try {
	            String ordensql = "INSERT INTO principal (nombre,tipo,precio,camuflaje,cadencia) VALUES (?,?,?,?,?);";
	            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
	            sentencia.setString(1, a.getNombre());
	            sentencia.setString(2, a.getTipo());
	            sentencia.setInt(3, (int) a.getPrecio());
	            sentencia.setString(4, a.getCamuflaje());
	            sentencia.setBoolean(5, a.isCadencia());
     

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
	
	public static boolean eliminarArmaPrincipal(Principal a) {
	       Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
	        if(conexion == null)
	        {
	            return false;
	        }
	        try {
	            String ordensql = "DELETE FROM principal WHERE Nombre LIKE ? ;";
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

	public static boolean actualizarArmaPrincipal(Principal a) {
	       Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
	        if(conexion == null)
	        {
	            return false;
	        }
	        try {
	            String ordensql = "UPDATE principal SET nombre = ?, tipo = ?, precio = ?, camuflaje = ?, cadencia = ? WHERE nombre LIKE ? ;";
	            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
	            sentencia.setString(1, a.getNombre());
	            sentencia.setString(2, a.getTipo());
	            sentencia.setInt(3, (int) a.getPrecio());
	            sentencia.setString(4, a.getCamuflaje());
	            sentencia.setBoolean(5, a.isCadencia());
	            sentencia.setString(6, a.getNombre());
	            
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
