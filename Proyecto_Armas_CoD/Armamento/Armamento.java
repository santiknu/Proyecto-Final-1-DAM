package Armamento;

import java.util.LinkedList;
import java.util.Objects;

import Accesorios.Accesorios;
import Armas.Principal;
import Armas.Secundaria;

public class Armamento 
{
	//ATRIBUTOS
	String nombre;
	Principal armap;
	Secundaria armas;
	int municion;
	LinkedList<Accesorios> accesorios;
	//CONSTRUCTORES
	public Armamento(String nombre,Principal armap, Secundaria armas, int municion, LinkedList<Accesorios> accesorios) 
	{
		this.nombre=nombre;
		this.armap = armap;
		this.armas = armas;
		this.municion = municion;
		this.accesorios = accesorios;
	}
	public Armamento(String nombre) 
	{
		this.nombre=nombre;
		this.armap = null;
		this.armas = null;
		this.municion = 0;
		this.accesorios = null;
	}
	//GETTER Y SETTERS
	public Principal getArmap() {
		return armap;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Secundaria getArmas() {
		return armas;
	}
	public int getMunicion() {
		return municion;
	}
	public LinkedList<Accesorios> getAccesorios() {
		return accesorios;
	}
	public void setArmap(Principal armap) {
		this.armap = armap;
	}
	public void setArmas(Secundaria armas) {
		this.armas = armas;
	}
	public void setMunicion(int municion) {
		this.municion = municion;
	}
	public void setAccesorios(LinkedList<Accesorios> accesorios) {
		this.accesorios = accesorios;
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
		Armamento other = (Armamento) obj;
		return Objects.equals(nombre, other.nombre);
	}
	//TO STRING
	@Override
	public String toString() {
		return "Armamento [armap=" + armap + ", armas=" + armas + ", municion=" + municion + ", accesorios="
				+ accesorios + "]";
	}
	//METODOS
	public void mostrarArmamento() {
		System.out.println("==========================");
		System.out.println("NOMBRE: "+this.nombre);
		System.out.println("ARMA PRINCIPAL: ");
		armap.mostrarArma();
		System.out.println("ARMA SECUNDARIA: ");
		if(armas==null) {
			System.out.println("NO EQUIPADA");
		}
		else {
			armas.mostrarArma();
		}
		System.out.println("MUNICION: "+this.municion);
		System.out.println("ACCESORIOS: ");
		for (Accesorios accesorio : accesorios) 
		{
			accesorio.mostrarAccesorio();
		}
	}
	
}
