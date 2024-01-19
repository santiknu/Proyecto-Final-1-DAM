package Armas;

import java.util.Objects;

public class Arma 
{
	//ATRIBUTOS 
	String nombre, tipo;
	double precio;
	//CONSTRUCTORES
	public Arma(String nombre, String tipo, double precio) 
	{
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
	}
	public Arma(String nombre) 
	{
		this.nombre = nombre;
		this.tipo = null;
		this.precio = 0;
	}
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	//HASH CODE
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arma other = (Arma) obj;
		return Objects.equals(nombre, other.nombre);
	}
	//TO STRING 
	@Override
	public String toString() {
		return "nombre= " + nombre;
	}
	//METODOS
	public void mostrarArma() {
		System.out.println("==========================");
		System.out.println("NOMBRE: "+this.nombre);
		System.out.println("TIPO: "+this.tipo);
		System.out.println("PRECIO: "+this.precio);
	}
	public void mostrarNombre() {
		System.out.println("NOMBRE: "+this.nombre);
	}
	
	
	
	
	
}
