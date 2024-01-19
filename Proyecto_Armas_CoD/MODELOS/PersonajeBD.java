package MODELOS;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import Accesorios.Accesorios;
import Armamento.Armamento;
import Armas.Principal;
import Armas.Secundaria;
import Personaje.Personaje;


public class PersonajeBD {
	
		public static Personaje obtenerPersonaje() {
	        Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
	        if(conexion == null)
	        {
	            return null;
	        }
	        Personaje P = null;
	        try {
	        	String nombre = null;
	        	double fondos = 0;
	        	
	        	String nombreA = null;
	        	int municion = 0;
	        	Principal p = null;
	        	Secundaria s = null;
	        	
	            Statement sentencia = conexion.createStatement();
	            String ordenSQL = "SELECT * FROM personaje";
	            ResultSet resultado = sentencia.executeQuery(ordenSQL);
	            
	            Statement sentencia2 = null;
	            String ordenSQL2 = null;
	            ResultSet resultado2 = null;
	            
	            Statement sentencia3 = null;
	            String ordenSQL3 = null;
	            ResultSet resultado3 = null;
	            
	            Statement sentencia4 = null;
	            String ordenSQL4 = null;
	            ResultSet resultado4 = null;
	            
	            Statement sentencia5 = null;
	            String ordenSQL5 = null;
	            ResultSet resultado5 = null;
	            
	            Statement sentencia6 = null;
	            String ordenSQL6 = null;
	            ResultSet resultado6 = null;
	            
	            Statement sentencia7 = null;
	            String ordenSQL7 = null;
	            ResultSet resultado7 = null;
	            
	            while (resultado.next()) {
	                nombre = resultado.getString("nombre");
	                fondos = resultado.getInt("fondos");
	                
	                LinkedList<Armamento> armamentos = new LinkedList<Armamento>();
	                
	                sentencia2 = conexion.createStatement();
	                ordenSQL2 = "SELECT * FROM usa WHERE nombre like '"+nombre+"'";
	                resultado2 = sentencia2.executeQuery(ordenSQL2);
	                
	                while (resultado2.next()) {
	                	
	                	sentencia3 = conexion.createStatement();
		                ordenSQL3 = "SELECT * FROM armamento WHERE nombre like '"+resultado2.getString("armamento")+"'";
		                resultado3 = sentencia3.executeQuery(ordenSQL3);
		                
		                while(resultado3.next()) {
		                	
		                	nombreA = resultado3.getString("nombre");
		                    municion = resultado3.getInt("municion");
		                    
		                    sentencia4 = conexion.createStatement();
		                    ordenSQL4 = "SELECT * FROM principal WHERE nombre like '"+resultado3.getString("principal")+"'";
		                    resultado4 = sentencia4.executeQuery(ordenSQL4);
		                    while (resultado4.next()) {
		                    	 p = new Principal(resultado4.getString("nombre"),resultado4.getString("tipo"),resultado4.getDouble("precio"),resultado4.getString("camuflaje"),resultado4.getBoolean("cadencia")); 
		                    }
		                    
		                    resultado4.close();
		                    sentencia4.close();
		                    
		                    sentencia5 = conexion.createStatement();
		                    ordenSQL5 = "SELECT * FROM secundaria WHERE nombre like '"+resultado3.getString("secundaria")+"'";
		                    resultado5 = sentencia5.executeQuery(ordenSQL5);
		                    while (resultado5.next()) {
		                    	s = new Secundaria(resultado5.getString("nombre"),resultado5.getString("tipo"),resultado5.getDouble("precio"),resultado5.getString("alcance"));
		                    }
		                    
		                    resultado5.close();
		                    sentencia5.close();
		                    
		                    LinkedList<Accesorios> accesorios = new LinkedList<Accesorios>();
		                    sentencia6 = conexion.createStatement();
		                    ordenSQL6 = "SELECT * FROM tiene WHERE armamento like '"+nombreA+"'";
		                    resultado6 = sentencia6.executeQuery(ordenSQL6);
		                    while (resultado6.next()) {
		                    	
		                    	sentencia7 = conexion.createStatement();
		                        ordenSQL7 = "SELECT * FROM accesorios WHERE nombre like '"+resultado6.getString("accesorios")+"'";
		                        resultado7 = sentencia7.executeQuery(ordenSQL7);		                        
		                        while (resultado7.next()) {
		                        	Accesorios a = new Accesorios(resultado7.getString("nombre"),resultado7.getString("acople"),resultado7.getInt("precio")); 
		                            accesorios.add(a);		                            		                            
		                        }
		                        
			                    		                                                
		                    }		                    
		                    	                  
		                    Armamento A  = new Armamento(nombreA,p,s,municion,accesorios);
		                    armamentos.add(A);
		                    
		                    resultado6.close();
		                    sentencia6.close();
		                    
		                }
		                
		                resultado3.close();
	                    sentencia3.close();
		                	                
	                }	              	                
	                
	                P = new Personaje(nombre,fondos,armamentos);
	                
	                resultado2.close();
	                sentencia2.close();
	                
	            }
	                        
	            resultado.close();
	            sentencia.close();	           	                                                                                                                                      
                conexion.close();
	            
	            return P;
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return P;
	        }
	    }

		public static boolean insertarPersonaje(Personaje p) {
		       Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
		        if(conexion == null)
		        {
		            return false;
		        }
		        try {
		            String ordensql = "INSERT INTO personaje (nombre,fondos) VALUES (?,?);";
		            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
		            sentencia.setString(1, p.getCodp());
		            sentencia.setDouble(2, p.getFondos());		        
		            
		            String ordensql2 = "INSERT INTO usa (armamento,nombre) VALUES (?,?);";
		            PreparedStatement sentencia2 = conexion.prepareStatement(ordensql2);
		            sentencia2.setString(2, p.getCodp());
		            
		            for (Armamento a : p.getArmamentos()) {
		            	sentencia2.setString(1, a.getNombre());
		            }

		            int filasafectadas = sentencia.executeUpdate();
		            int filasafectadas2 = sentencia2.executeUpdate();
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
		
		public static boolean eliminarPersonaje(Personaje p) {
		       Connection conexion = ConfiguracionBD.conectarConBaseDeDatos();
		        if(conexion == null)
		        {
		            return false;
		        }
		        try {
		            String ordensql = "DELETE FROM armamento WHERE Nombre LIKE ? ;";
		            PreparedStatement sentencia = conexion.prepareStatement(ordensql);
		            sentencia.setString(1, p.getCodp());

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

