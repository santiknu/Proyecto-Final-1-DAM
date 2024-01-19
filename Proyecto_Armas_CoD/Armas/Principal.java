package Armas;

public class Principal extends Arma
{
	//ATRIBUTOS
	String camuflaje;
	boolean cadencia;//TRUE-automatica		FALSE-semiautomatica
	//CONSTRUCTOR
	public Principal(String nombre, String tipo, double precio, String camuflaje, boolean cadencia) 
	{
		super(nombre, tipo, precio);
		this.camuflaje = camuflaje;
		this.cadencia = cadencia;
	}
	public Principal(String nombre) 
	{
		super(nombre);
		this.camuflaje = null;
		this.cadencia = false;
	}
	//GETTER Y SETTERS
	public String getCamuflaje() {
		return camuflaje;
	}
	public boolean isCadencia() {
		return cadencia;
	}
	public void setCamuflaje(String camuflaje) {
		this.camuflaje = camuflaje;
	}
	public void setCadencia(boolean cadencia) {
		this.cadencia = cadencia;
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
		System.out.println("CAMUFLAJE: "+this.camuflaje);
		if(cadencia) {
			System.out.println("CADENCIA: AUTOMATICA");
		}
		else {
			System.out.println("CADENCIA: SEMI-AUTOMATICA");
		}
	}
}
