package MODELOS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;

import Accesorios.Accesorios;
import Armamento.Armamento;
import Armas.Principal;
import Armas.Secundaria;

public class ArmamentoBD {
	
	public static ArrayList<Armamento> obtenerArmamento() {
        Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
        if(conexion == null)
        {
            return null;
        }
        ArrayList<Armamento> listaArmamentos = new ArrayList<Armamento>();
        try {
        	String nombre = null;
        	int municion = 0;
        	Principal p = null;
        	Secundaria s = null;
        	
            Statement sentencia = conexion.createStatement();
            String ordenSQL = "SELECT * FROM armamento";
            ResultSet resultado = sentencia.executeQuery(ordenSQL);
            
            Statement sentencia2 = null;
            String ordenSQL2 = null;
            ResultSet resultado2 = null;
            
            while (resultado.next()) {
                nombre = resultado.getString("nombre");
                municion = resultado.getInt("municion");
                
                Statement sentencia3 = conexion.createStatement();
                String ordenSQL3 = "SELECT * FROM principal WHERE nombre like '"+resultado.getString("principal")+"'";
                ResultSet resultado3 = sentencia3.executeQuery(ordenSQL3);
                while (resultado3.next()) {
                	 p = new Principal(resultado3.getString("nombre"),resultado3.getString("tipo"),resultado3.getDouble("precio"),resultado3.getString("camuflaje"),resultado3.getBoolean("cadencia")); 
                }
                
                resultado3.close();
                sentencia3.close();
                
                Statement sentencia4 = conexion.createStatement();
                String ordenSQL4 = "SELECT * FROM secundaria WHERE nombre like '"+resultado.getString("secundaria")+"'";
                ResultSet resultado4 = sentencia4.executeQuery(ordenSQL4);
                while (resultado4.next()) {
                	s = new Secundaria(resultado4.getString("nombre"),resultado4.getString("tipo"),resultado4.getDouble("precio"),resultado4.getString("alcance"));
                }
                
                resultado4.close();
                sentencia4.close();
                
                LinkedList<Accesorios> accesorios = new LinkedList<Accesorios>();
                
                sentencia2 = conexion.createStatement();
                ordenSQL2 = "SELECT * FROM tiene WHERE armamento like '"+nombre+"'";
                resultado2 = sentencia2.executeQuery(ordenSQL2);
                
                while (resultado2.next()) {
                	Statement sentencia5 = conexion.createStatement();
                    String ordenSQL5 = "SELECT * FROM accesorios WHERE nombre like '"+resultado2.getString("accesorios")+"'";
                    ResultSet resultado5 = sentencia5.executeQuery(ordenSQL5);
                    
                    while (resultado5.next()) {
                    	Accesorios a = new Accesorios(resultado5.getString("nombre"),resultado5.getString("acople"),resultado5.getInt("precio")); 
                        accesorios.add(a);
                    }
                
                }
                
                Armamento A  = new Armamento(nombre,p,s,municion,accesorios);
                listaArmamentos.add(A); 
                
                resultado2.close();
                sentencia2.close();
            }
            
            resultado.close();
            sentencia.close();
            conexion.close();
            
            return listaArmamentos;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return listaArmamentos;
        }
    }
	
	public static Armamento buscarArmamento(String texto) {
        Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
        if(conexion == null)
        {
            return null;
        }
        Armamento A = null;
        try {
        	String nombre = null;
        	int municion = 0;
        	Principal p = null;
        	Secundaria s = null;
        	
            String ordensql = "SELECT * FROM armamento WHERE nombre LIKE ? ;";
            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
            String textobusqueda = "%"+texto+"%";
            sentencia.setString(1, textobusqueda);
            ResultSet resultado = sentencia.executeQuery();
            
            Statement sentencia2 = null;
            String ordenSQL2 = null;
            ResultSet resultado2 = null;
            
            while (resultado.next()) {
                nombre = resultado.getString("nombre");
                municion = resultado.getInt("municion");
                
                Statement sentencia3 = conexion.createStatement();
                String ordenSQL3 = "SELECT * FROM principal WHERE nombre like '"+resultado.getString("principal")+"'";
                ResultSet resultado3 = sentencia3.executeQuery(ordenSQL3);
                while (resultado3.next()) {
                	 p = new Principal(resultado3.getString("nombre"),resultado3.getString("tipo"),resultado3.getDouble("precio"),resultado3.getString("camuflaje"),resultado3.getBoolean("cadencia")); 
                }
                
                resultado3.close();
                sentencia3.close();
                
                Statement sentencia4 = conexion.createStatement();
                String ordenSQL4 = "SELECT * FROM secundaria WHERE nombre like '"+resultado.getString("secundaria")+"'";
                ResultSet resultado4 = sentencia4.executeQuery(ordenSQL4);
                while (resultado4.next()) {
                	s = new Secundaria(resultado4.getString("nombre"),resultado4.getString("tipo"),resultado4.getDouble("precio"),resultado4.getString("alcance"));
                }
                
                resultado4.close();
                sentencia4.close();
                
                LinkedList<Accesorios> accesorios = new LinkedList<Accesorios>();
                
                sentencia2 = conexion.createStatement();
                ordenSQL2 = "SELECT * FROM tiene WHERE armamento like '"+nombre+"'";
                resultado2 = sentencia2.executeQuery(ordenSQL2);
                
                while (resultado2.next()) {
                	Statement sentencia5 = conexion.createStatement();
                    String ordenSQL5 = "SELECT * FROM accesorios WHERE nombre like '"+resultado2.getString("accesorios")+"'";
                    ResultSet resultado5 = sentencia5.executeQuery(ordenSQL5);
                    
                    while (resultado5.next()) {
                    	Accesorios a = new Accesorios(resultado5.getString("nombre"),resultado5.getString("acople"),resultado5.getInt("precio")); 
                        accesorios.add(a);
                    }
                
                }
                
                A  = new Armamento(nombre,p,s,municion,accesorios);
                
                resultado2.close();
                sentencia2.close();
            }
            
            resultado.close();
            sentencia.close();
            conexion.close();
            
            return A;
        } catch (SQLException e) {
            e.printStackTrace();
            return A;
        }
    }

	public static boolean insertarArmamento(Armamento a) {
	       Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
	        if(conexion == null)
	        {
	            return false;
	        }
	        try {
	            String ordensql = "INSERT INTO armamento (nombre,principal,secundaria,municion) VALUES (?,?,?,?);";
	            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
	            sentencia.setString(1, a.getNombre());
	            sentencia.setString(2, a.getArmap().getNombre());
	            sentencia.setString(3, a.getArmas().getNombre());
	            sentencia.setInt(4, a.getMunicion());
	            
	            int filasafectadas = sentencia.executeUpdate();
	            
	            String ordensql2 = null;
	            PreparedStatement sentencia2 = null;
	            int filasafectadas2 = 0;
	            for (Accesorios ac : a.getAccesorios()) {
	            	ordensql2 = "INSERT INTO tiene (armamento,accesorios) VALUES (?,?);";
	 	            sentencia2 = conexion.prepareStatement(ordensql2);
	 	            sentencia2.setString(1, a.getNombre());
	 	            sentencia2.setString(2, ac.getNombre());
	 	           filasafectadas2 = sentencia2.executeUpdate();
	            }
	            
	            if(filasafectadas > 0 && filasafectadas2 > 0)
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
	
	public static boolean eliminarArmamento(Armamento a) {
	       Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
	        if(conexion == null)
	        {
	            return false;
	        }
	        try {
	            String ordensql = "DELETE FROM armamento WHERE nombre LIKE ? ;";
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
	
}
