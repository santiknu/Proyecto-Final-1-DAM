package Accesorios;

import java.util.Objects;

public class Accesorios 
{
	//ATRIBUTOS
	String nombre,acople;
	int precio;
	//CONSTRUCTORES
	public Accesorios(String nombre, String acople, int precio) 
	{
		this.nombre = nombre;
		this.acople = acople;
		this.precio = precio;
	}
	public Accesorios(String nombre) 
	{
		this.nombre = nombre;
		this.acople = null;
		this.precio = 0;
	}
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public String getAcople() {
		return acople;
	}
	public int getPrecio() {
		return precio;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setAcople(String acople) {
		this.acople = acople;
	}
	public void setPrecio(int precio) {
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
		Accesorios other = (Accesorios) obj;
		return Objects.equals(nombre, other.nombre);
	}
	//TO STRING
	@Override
	public String toString() {
		return "nombre= " + nombre;
	}
	//METODOS
	public void mostrarAccesorio() {
		System.out.println("==========================");
		System.out.println("NOMBRE: "+this.nombre);
		System.out.println("ACOPLE: "+this.acople);
		System.out.println("PRECIO: "+this.precio);
	}
	public void mostrarNombre() {
		System.out.println("NOMBRE: "+this.nombre);
	}
	
	
	
}
