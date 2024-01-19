package Personaje;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

import Accesorios.Accesorios;
import Armamento.Armamento;

public class Personaje 
{
	//ATRIBUTOS
	String codp;
	double fondos;
	LinkedList<Armamento> armamentos;
	//CONTRUCTORES
	public Personaje(String codp, double dinero, LinkedList<Armamento> armamentos) 
	{
		this.codp = codp;
		this.fondos = dinero;
		this.armamentos = armamentos;
	}
	public Personaje(String codp) 
	{
		this.codp = codp;
		this.fondos = 5000;
		this.armamentos = new LinkedList<Armamento>();
	}
	//GETTER Y SETTERS
	public String getCodp() {
		return codp;
	}
	public double getFondos() {
		return fondos;
	}
	public LinkedList<Armamento> getArmamentos() {
		return armamentos;
	}
	public void setCodp(String codp) {
		this.codp = codp;
	}
	public void setFondos(double dinero) {
		this.fondos = dinero;
	}
	public void setArmamentos(LinkedList<Armamento> armamentos) {
		this.armamentos = armamentos;
	}
	//HASH CODE
	@Override
	public int hashCode() {
		return Objects.hash(codp);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(codp, other.codp);
	}
	//TO STRING 
	@Override
	public String toString() {
		return "Personaje [codp=" + codp + ", fondos=" + fondos + ", armamentos=" + armamentos + "]";
	}
	//METODOS
	public void mostrarPersonaje() {
		System.out.println("==========================");
		System.out.println("CODIGO DE PERSONAJE: "+this.codp);
		System.out.println("FONDOS:"+this.fondos);
		System.out.println("ARMAMENTOS: ");
		for (Armamento armamento : armamentos) 
		{
			armamento.mostrarArmamento();
		}
	}
	public void añadirFondos(double dinero) 
	{
		this.setFondos(this.getFondos()+dinero);
	}
	public void restarFondos(double dinero) {
		this.setFondos(this.getFondos()-dinero);
	}
	public boolean añadirArmamento(Armamento armamento) 
	{
		armamentos.add(armamento);
		return true;
	}
	public void borrarArmamentoArma(String nombre) {
		String arma=null;
		Iterator<Armamento> it=armamentos.iterator();
		while(it.hasNext()) {
			Armamento casilla=it.next();
			for (Armamento armamento : armamentos) 
			{
				if(armamento.getArmap().getNombre().equalsIgnoreCase(nombre)) {
					arma=nombre;
				}
			}
			if(casilla.getArmap().getNombre().equalsIgnoreCase(arma)) {
				it.remove();
			}
		}
	}
	
	public boolean borrarArmamento(String nombre) {
		boolean borrado=false;
		for (Armamento armamento : armamentos) {
			if(armamento.getNombre().equalsIgnoreCase(nombre)) {
				armamentos.remove(armamento);
				borrado=true;
			}
		}
		return borrado;
	}
	
	public double valorArmamentos() {
		double suma=0;
		for (Armamento armamento : armamentos) {
			suma=suma+armamento.getArmap().getPrecio()+armamento.getArmas().getPrecio();
			for (Accesorios armamento2 : armamento.getAccesorios()) 
			{
				suma+=armamento2.getPrecio();
			}
		}
		return suma;
	}
	
	public double valorArmamento(Armamento armamento) {
		double suma=0;
		suma=suma+armamento.getArmap().getPrecio()+armamento.getArmas().getPrecio();
		for (Accesorios accesorio : armamento.getAccesorios()) 
		{
			suma=suma+accesorio.getPrecio();
		}
		return suma;
	}
	
	public void buscarPorArma(String nombre) {
		for (Armamento armamento : armamentos) 
		{
			if(armamento.getArmap().getNombre().equalsIgnoreCase(nombre)) {
				armamento.mostrarArmamento();
			}
		}
	}
	
	public boolean cambiarNombreArmamento(String armamento, String nombreN) {
		boolean mod=false;
		for (Armamento armamento1 : armamentos) {
			if(armamento1.getNombre().equalsIgnoreCase(armamento)) {
				armamento1.setNombre(nombreN);
				mod=true;
			}
		}
		return mod;
	}
	
	public boolean cambiarArmaP(String armamento, String arma) {
		boolean mod=false;
		for (Armamento armamento1 : armamentos) {
			if(armamento1.getNombre().equalsIgnoreCase(armamento)) {
				armamento1.getArmap().setNombre(arma);
				mod=true;
			}
		}
		return mod;
	}
	
	public boolean cambiarArmaS(String  armamento, String arma) {
		boolean mod=false;
		for (Armamento armamento1 : armamentos) {
			if(armamento1.getNombre().equalsIgnoreCase(armamento)) {
				armamento1.getArmas().setNombre(arma);
				mod=true;
			}
		}
		return mod;
	}
	
	public boolean añadirMunicion(String  armamento, int numero) {
		boolean mod=false;
		for (Armamento armamento1 : armamentos) {
			if(armamento1.getNombre().equalsIgnoreCase(armamento)) {
				armamento1.setMunicion(numero);
				mod=true;
			}
		}
		return mod;
	}
	
	public boolean cambiarAccesorios(String  armamento, LinkedList<Accesorios> accesorios) {
		boolean mod=false;
		for (Armamento armamento1 : armamentos) {
			if(armamento1.getNombre().equalsIgnoreCase(armamento)) {
				armamento1.setAccesorios(accesorios);
				mod=true;
			}
		}
		return mod;
	}
	
	public boolean crearArmamento(Armamento armamento) {
		boolean creado=false;
		if(this.valorArmamento(armamento)>this.getFondos()) {
			System.out.println("Fondos insuficientes. Añada mas fondos.");
		}
		else {
			creado=true;
		}
		return creado;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
