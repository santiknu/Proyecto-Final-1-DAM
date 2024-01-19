package Armas;

public class Secundaria extends Arma
{
	//ATRIBUTOS
	String alcance;
	//CONSTRUCTORES
	public Secundaria(String nombre, String tipo, double precio, String alcance) {
		super(nombre, tipo, precio);
		this.alcance = alcance;
	}
	public Secundaria(String nombre) {
		super(nombre);
		this.alcance = null;
	}
	//GETTERS Y SETTERS
	public String getAlcance() {
		return alcance;
	}
	public void setAlcance(String alcance) {
		this.alcance = alcance;
	}
	//TO STRING
	@Override
	public String toString() {
		return super.toString();
	}
	//METODOS
	@Override
	public void mostrarArma() {
		super.mostrarArma();
		System.out.println("ALCANCE: "+this.alcance);
	}
	
	
	
}
