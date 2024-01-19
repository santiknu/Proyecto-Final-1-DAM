package Programa;

import java.util.ArrayList;
import java.util.LinkedList;

import Accesorios.Accesorios;
import Armamento.Armamento;
import Armas.Arma;
import Armas.Principal;
import Armas.Secundaria;
import MODELOS.AccesoriosBD;
import MODELOS.ArmaPrincipalBD;
import MODELOS.ArmaSecundariaBD;
import MODELOS.ArmamentoBD;
import MODELOS.PersonajeBD;
import Personaje.Personaje;

public class progama_prueba {
	
	public static void main(String[] args) 
	{
	/*	Principal armap1=new Principal("M4A1","Fusil de asalto",240,"Azul",true);
		Principal armap2=new Principal("M16A4","Fusil de asalto",190,"Hexagonal",false);
		Principal armap3=new Principal("Scar-L","Fusil de asalto",370,"Oro",true);
		Principal armap4=new Principal("CM901","Fusil de asalto",210,"Azul",true);
		Principal armap5=new Principal("Type 95","Fusil de asalto",150,"Serpiente",false);
		Principal armap6=new Principal("G36C","Fusil de asalto",260,"Nieve",true);
		Principal armap7=new Principal("ACR 6.8","Fusil de asalto",490,"Oro",true);
		Principal armap8=new Principal("MK-14","Fusil de asalto",130,"Clasico",false);
		Principal armap9=new Principal("AK-47","Fusil de asalto",380,"Oro",true);
		Principal armap10=new Principal("FAD","Fusil de asalto",210,"Otoño",true);
		
		Principal armap11=new Principal("MP5","Subfusil",130,"Azul",true);
		Principal armap12=new Principal("UMP45","Subfusil",240,"Oro",true);
		Principal armap13=new Principal("PP90M1","Subfusil",350,"Rojo",true);
		Principal armap14=new Principal("P90","Subfusil",230,"Otoño",true);
		Principal armap15=new Principal("PM-9","Subfusil",120,"Nieve",true);
		Principal armap16=new Principal("MP7","Subfusil",380,"Oro",true);
		
		Principal armap17=new Principal("L86 LSW","Ametralladora ligera",200,"Azul",true);
		Principal armap18=new Principal("MG36","Ametralladora ligera",200,"Rojo",true);
		Principal armap19=new Principal("PKP Pecheneg","Ametralladora ligera",200,"Oro",true);
		Principal armap20=new Principal("MK46","Ametralladora ligera",200,"Clasico",true);
		Principal armap21=new Principal("M60E4","Ametralladora ligera",200,"Digital urbano",true);
		
		Principal armap22=new Principal("Barrett .50CAL","Francotirador",550,"Digital urbano",false);
		Principal armap23=new Principal("L118A","Francotirador",570,"Rojo",false);
		Principal armap24=new Principal("Dragunov","Francotirador",450,"Serpiente",false);
		Principal armap25=new Principal("MSR","Francotirador",600,"Oro",false);
		
		Principal armap26=new Principal("SPAS 12","Escopeta",340,"Rojo",false);
		Principal armap27=new Principal("AA-12","Escopeta",250,"Nieve",true);
		Principal armap28=new Principal("Striker","Escopeta",230,"Serpiente",false);
		Principal armap29=new Principal("Model 1887","Escopeta",170,"Otoño",false);
		
		Principal armap30=new Principal("Escudo antidisturbios","Cuerpo a cuerpo",50,"Rojo",false);
		
		
		Secundaria armas1=new Secundaria("USP .45", "Pistola", 120, "Medio-Corto");
		Secundaria armas2=new Secundaria("Magnum .44", "Pistola", 150, "Medio");
		Secundaria armas3=new Secundaria("P99", "Pistola", 100, "Medio-Corto");
		Secundaria armas4=new Secundaria("Desert Eagle", "Pistola", 170, "Largo-Medio");
		
		Secundaria armas5=new Secundaria("FMG9", "Pistola Ametralladora", 150, "Corto");
		Secundaria armas6=new Secundaria("MP9", "Pistola Ametralladora", 140, "Corto");
		Secundaria armas7=new Secundaria("Skorpion", "Pistola Ametralladora", 150, "Corto");
		Secundaria armas8=new Secundaria("G18", "Pistola Ametralladora", 160, "Corto");
		
		Secundaria armas9=new Secundaria("Javelin", "Lanza cohetes", 80, "Larga");
		Secundaria armas10=new Secundaria("Stinger", "Lanza cohetes", 80, "Larga");
		Secundaria armas11=new Secundaria("RPG-7", "Lanza cohetes", 90, "Larga");
		
		LinkedList<Arma> armas=new LinkedList<Arma>();
		armas.add(armap1);
		armas.add(armap2);
		armas.add(armap3);
		armas.add(armap4);
		armas.add(armap5);
		armas.add(armap6);
		armas.add(armap7);
		armas.add(armap8);
		armas.add(armap9);
		armas.add(armap10);
		armas.add(armap11);
		armas.add(armap12);
		armas.add(armap13);
		armas.add(armap14);
		armas.add(armap15);
		armas.add(armap16);
		armas.add(armap17);
		armas.add(armap18);
		armas.add(armap19);
		armas.add(armap20);
		armas.add(armap21);
		armas.add(armap22);
		armas.add(armap23);
		armas.add(armap24);
		armas.add(armap25);
		armas.add(armap26);
		armas.add(armap27);
		armas.add(armap28);
		armas.add(armap29);
		armas.add(armap30);
		armas.add(armas1);
		armas.add(armas2);
		armas.add(armas3);
		armas.add(armas4);
		armas.add(armas5);
		armas.add(armas6);
		armas.add(armas7);
		armas.add(armas8);
		armas.add(armas9);
		armas.add(armas10);
		armas.add(armas11);
		
		/*for (Arma arma : armas) 
		{
			arma.mostrarArma();
		}
		
		System.out.println("\n");
		System.out.println("\n");
		
		Accesorios a1=new Accesorios("Punto rojo", "Mira", 10);
		Accesorios a2=new Accesorios("ACOG", "Mira", 15);
		Accesorios a3=new Accesorios("Hibrida", "Mira", 20);
		Accesorios a4=new Accesorios("Termica", "Mira", 20);
		Accesorios a5=new Accesorios("Holografica", "Mira", 25);
		Accesorios a6=new Accesorios("Variable", "Mira", 30);
		
		Accesorios a7=new Accesorios("Silenciador", "Cañon", 20);
		Accesorios a8=new Accesorios("Fuego rapido", "Cañon", 10);
		Accesorios a9=new Accesorios("Lanzagranadas", "Cañon", 15);
		
		Accesorios a10=new Accesorios("Cargadores ampliados", "Otros", 20);
		Accesorios a11=new Accesorios("Cargadores dobles", "Otros", 25);
		Accesorios a12=new Accesorios("Empuñadura", "Otros", 20);
		Accesorios a13=new Accesorios("Sensor cardiaco", "Otros", 30);
		
		LinkedList<Accesorios> accesorios=new LinkedList<Accesorios>();
		
		accesorios.add(a1);
		accesorios.add(a2);
		accesorios.add(a3);
		accesorios.add(a4);
		accesorios.add(a5);
		accesorios.add(a6);
		accesorios.add(a7);
		accesorios.add(a8);
		accesorios.add(a9);
		accesorios.add(a10);
		accesorios.add(a11);
		accesorios.add(a12);
		accesorios.add(a13);
		
		/*for (Accesorios accesorio : accesorios) 
		{
			accesorio.mostrarAccesorio();
		}
		
		System.out.println("\n");
		System.out.println("\n");
		
		LinkedList<Accesorios> accesoriosA1=new LinkedList<Accesorios>();
		accesoriosA1.add(a1);
		accesoriosA1.add(a7);
		accesoriosA1.add(a10);
		Armamento A1=new Armamento("Armamento1",armap7,armas2, 100, accesoriosA1);
		//A1.mostrarArmamento();
		
		/*System.out.println("\n");
		System.out.println("\n");
		
		LinkedList<Accesorios> accesoriosA2=new LinkedList<Accesorios>();
		accesoriosA2.add(a12);
		accesoriosA2.add(a7);
		Armamento A2=new Armamento("Armamento2",armap16,armas4, 200, accesoriosA2);
		//A2.mostrarArmamento();
		
		/*System.out.println("\n");
		System.out.println("\n");
		
		LinkedList<Accesorios> accesoriosA3=new LinkedList<Accesorios>();
		accesoriosA3.add(a8);
		accesoriosA3.add(a10);
		Armamento A3=new Armamento("Armamaneto3",armap25, armas4, 100, accesoriosA3);
		//A3.mostrarArmamento();
		
		LinkedList<Accesorios> accesoriosA4=new LinkedList<Accesorios>();
		accesoriosA4.add(a8);
		accesoriosA4.add(a10);
		Armamento A4=new Armamento("Armamento4",armap28, armas7, 140, accesoriosA4);
		
		LinkedList<Armamento> armamento1=new LinkedList<Armamento>();
		armamento1.add(A1);
		armamento1.add(A2);
		armamento1.add(A3);
		
		/*System.out.println("\n");
		System.out.println("\n");
		
		Personaje P1=new Personaje("Personaje1", 0, armamento1);
		P1.añadirFondos(5000);
		P1.añadirArmamento(A4);
		P1.mostrarPersonaje();
		
		System.out.println("\n");
		System.out.println("\n");
		
		for (Arma arma : armas) 
		{
			if(arma instanceof Principal)
			{
				arma.mostrarNombre();
			}
		}
		
		System.out.println("\n");
		System.out.println("\n");
		
		for (Arma arma : armas) 
		{
			if(arma instanceof Secundaria)
			{
				arma.mostrarNombre();
			}
		}
		
		/*P1.getArmamentos().remove(P1.borrarArmamento("Armamento2"));
		P1.mostrarPersonaje();	
		
		System.out.println("\n");
		System.out.println("\n");
		
		P1.borrarArmamentoArma("ACR 6.8");
		P1.mostrarPersonaje();
		
		System.out.println("\n");
		System.out.println("\n");
		
		double suma=P1.valorArmamentos();
		System.out.println(suma);
		
		System.out.println("\n");
		System.out.println("\n");
		
		P1.restarFondos(100);
		System.out.println(P1.getFondos());*/
		
		/*ArrayList<Principal> armas = ArmaPrincipalBD.obtenerArmasPrincipal();
		for (Principal principal : armas) {
			//principal.mostrarArma();
		}
		
		ArrayList<Secundaria> armasS = ArmaSecundariaBD.obtenerArmasSecundarias();
		for (Secundaria secundaria : armasS) {
			//secundaria.mostrarArma();
		}
		
		ArrayList<Secundaria> armasS1 = ArmaSecundariaBD.buscarArmaSecundaria("Skorpion");
		for (Secundaria secundaria : armasS1) {
			//secundaria.mostrarArma();
		}
		ArrayList<Accesorios> a=AccesoriosBD.obtenerAccesorios();
		for (Accesorios ac : a) {
			//ac.mostrarAccesorio();
		}
		
		/*LinkedList<Accesorios> accesoriosA2=new LinkedList<Accesorios>();
		accesoriosA2.add(new Accesorios("Punto rojo"));
		accesoriosA2.add(new Accesorios("Sensor cardiaco"));
		
		Armamento A2=new Armamento("ww1234",new Principal("M4A1"),new Secundaria("FMG9"), 200, accesoriosA2);
		
		boolean a2 = ArmamentoBD.insertarArmamento(A2);
		
		//boolean a2 = ArmamentoBD.eliminarArmamento(A2);
		
		System.out.println(a2);
		
		ArrayList<Armamento> A=ArmamentoBD.obtenerArmamento();
		for (Armamento ar : A) {
			ar.mostrarArmamento();	
		}*/
		
		//ArmamentoBD.buscarArmamento("Armamento2").mostrarArmamento();
		
		
		//PersonajeBD.obtenerPersonaje().mostrarPersonaje();
		
		
		ventana_crear_personaje.frame = new ventana_crear_personaje();
		ventana_crear_personaje.frame.setVisible(true);	
		
	}
}
