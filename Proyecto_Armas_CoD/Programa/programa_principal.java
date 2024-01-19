package Programa;

import java.util.LinkedList;
import java.util.Scanner;

import Accesorios.Accesorios;
import Armamento.Armamento;
import Armas.Arma;
import Armas.Principal;
import Armas.Secundaria;
import MODELOS.PersonajeBD;
import Personaje.Personaje;

public class programa_principal {
	
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		/*LinkedList<Arma> armas=new LinkedList<Arma>();
		
		Principal armap1=new Principal("M4A1","Fusil de asalto",240,"Azul",true);
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
		
		ventana_crear_personaje.frame = new ventana_crear_personaje();
		ventana_crear_personaje.frame.setVisible(true);
		
		System.out.println("Bienvenido");
		System.out.println("Para comenzar el juego, deberas crear un personaje");
		System.out.println("¿Como quieres llamar a tu personaje?");
		String nombre=sc.nextLine();
		System.out.println("Se te añadiran unos fondos por defecto con valor de 5000");
		double fondos=5000;
		System.out.println("Ahora debes crear al menos un armamento, mas adelante podras crear mas");
		System.out.println("¿Como quieres llamar a tu armamento?");
		String nombreA=sc.nextLine();
		System.out.println("¿Que arma de las siguientes quieres como arma principal?");
		for (Arma arma : armas) 
		{
			if(arma instanceof Principal)
			{
				arma.mostrarNombre();
			}
		}
		String respuesta1=sc.nextLine();
		Principal armaP = null;
		boolean encontradaAP=false;
		for (Arma arma2 : armas) 
		{
			if(arma2.getNombre().equalsIgnoreCase(respuesta1))
			{
				armaP=(Principal) arma2;
				encontradaAP=true;
			}
		}
		if(encontradaAP) {
			System.out.println("Arma encontrada");
		}
		else {
			System.out.println("Error. Arma no encontrada");
			System.out.println("Se te agregara un arma por defecto: M4A1");
			armaP=armap1;
		}
		System.out.println("¿Que arma de las siguientes quieres como arma secundaria?");
		for (Arma arma : armas) 
		{
			if(arma instanceof Secundaria)
			{
				arma.mostrarNombre();
			}
		}
		String respuesta2=sc.nextLine();
		Secundaria armaS = null;
		boolean encontradaAS=false;
		for (Arma arma : armas) 
		{
			if(arma.getNombre().equalsIgnoreCase(respuesta2))
			{
				armaS=(Secundaria) arma;
				encontradaAS=true;
			}
		}
		if(encontradaAS) {
			System.out.println("Arma encontrada");
		}
		else {
			System.out.println("Error. Arma no encontrada");
			System.out.println("Se agregara un arma por defecto: USP .45");
			armaS=armas1;
		}
		System.out.println("Se te agregara una muncion por defecto con valor de 200");
		int municion=200;
		System.out.println("¿Que accesorios de los siguientes quieres añadir? Puedes añadir un maximo de 3");
		for (Accesorios accesorio : accesorios) 
		{
			accesorio.mostrarNombre();
		}
		String respuesta3=null;
		boolean encontradoAccesorio=false;
		int cont=0;
		LinkedList<Accesorios> accesoriosp1=new LinkedList<Accesorios>();
		for (int i = 0; i < 3; i++) {
			respuesta3=sc.nextLine();
			for (Accesorios accesorio : accesorios) 
			{
				if(accesorio.getNombre().equalsIgnoreCase(respuesta3))
				{
					accesoriosp1.add(accesorio);
					cont++;
					break;
				}
			}
		}
		if(cont==3) {
			encontradoAccesorio=true;
		}
		if(encontradoAccesorio) {
			System.out.println("Accesorios añadidos correctamente");
		}
		else {
			System.out.println("Error. Accesorios no encontrados");
			System.out.println("Se agragaran estos accesorios por defecto: Punto rojo, empuñadura, cargadores dobles");
			accesoriosp1.add(a1);
			accesoriosp1.add(a11);
			accesoriosp1.add(a12);
		}
		Armamento armamento1=new Armamento(nombreA,armaP,armaS,municion,accesoriosp1);
		LinkedList<Armamento> armamentop1=new LinkedList<Armamento>();
		armamentop1.add(armamento1);
		Personaje P1=new Personaje(nombre,fondos,armamentop1);
		System.out.println("Este es tu personaje: ");
		System.out.println("\t");
		P1.mostrarPersonaje();
		int opcion=0;
		do {
			mostrarMenu();
			opcion=sc.nextInt();
			sc.nextLine();
			switch(opcion) {
			case 1:
				System.out.println("¿Como quieres llamar a tu armamento?");
				String nombreA2=sc.nextLine();
				System.out.println("¿Que arma de las siguientes quieres como arma principal?");
				for (Arma arma : armas) 
				{
					if(arma instanceof Principal)
					{
						arma.mostrarNombre();
					}
				}
				String respuestaArmaP2=sc.nextLine();
				Principal armaP2=null;
				boolean encontradaAP2=false;
				for (Arma arma2 : armas) 
				{
					if(arma2.getNombre().equalsIgnoreCase(respuestaArmaP2))
					{
						armaP2=(Principal) arma2;
						encontradaAP2=true;
					}
				}
				if(encontradaAP2) {
					System.out.println("Arma encontrada");
				}
				else {
					System.out.println("Error. Arma no encontrada");
					System.out.println("Se te agregara un arma por defecto: M4A1");
					armaP2=armap1;
				}
				System.out.println("¿Que arma de las siguientes quieres como arma secundaria?");
				for (Arma arma : armas) 
				{
					if(arma instanceof Secundaria)
					{
						arma.mostrarNombre();
					}
				}
				String respuesta22=sc.nextLine();
				Secundaria armaS2=null;
				boolean encontradaAS2=false;
				for (Arma arma2 : armas) 
				{
					if(arma2.getNombre().equalsIgnoreCase(respuesta22))
					{
						armaS2=(Secundaria) arma2;
						encontradaAS2=true;
					}
				}
				if(encontradaAS2) {
					System.out.println("Arma encontrada");
				}
				else {
					System.out.println("Error. Arma no encontrada");
					System.out.println("Se agregara un arma por defecto: USP .45");
					armaS2=armas1;
				}
				System.out.println("Se te agregara una muncion por defecto con valor de 200");
				int municion1=200;
				System.out.println("¿Que accesorios de los siguientes quieres añadir? Puedes añadir un maximo de 3");
				for (Accesorios accesorio : accesorios) 
				{
					accesorio.mostrarNombre();
				}
				String respuesta32=null;
				int cont2=0;
				boolean encontradoAccesorio2=false;
				LinkedList<Accesorios> accesoriosp11=new LinkedList<Accesorios>();
				for (int i = 0; i < 3; i++) {
					respuesta32=sc.nextLine();
					for (Accesorios accesorio : accesorios) 
					{
						if(accesorio.getNombre().equalsIgnoreCase(respuesta32))
						{
							accesoriosp11.add(accesorio);
							cont2++;
							break;
						}
					}
				}
				if(cont2==3) {
					encontradoAccesorio2=true;
				}
				if(encontradoAccesorio2) {
					System.out.println("Accesorios añadidos correctamente");
				}
				else {
					System.out.println("Error. Accesorios no encontrados");
					System.out.println("Se agragaran estos accesorios por defecto: Punto rojo, empuñadura, cargadores dobles");
					accesoriosp1.add(a1);
					accesoriosp1.add(a11);
					accesoriosp1.add(a12);
				}
				Armamento armamento11=new Armamento(nombreA2,armaP2,armaS2,municion1,accesoriosp11);
				boolean añadido=P1.añadirArmamento(armamento11);
				if(añadido) {
					System.out.println("Armamento añadido correctamente");
					System.out.println("Se te restaran los fondos equivalentes al valor del armamento");
					P1.restarFondos(P1.valorArmamento(armamento11));
				}
				else {
					System.out.println("Error al añadir. Intentalo de nuevo");
				}				
				break;
			case 2:
				System.out.println("¿QUE ARMAMENTO QUIERES MODIFICAR?");
				String respuestaArmMod=sc.nextLine();
				System.out.println("QUE QUIERES CAMBIAR DE ESTE ARMAMENTO");
				String respuestaCambio=sc.nextLine();
				if(respuestaCambio.equalsIgnoreCase("Arma principal")) {
					System.out.println("¿Que arma de las siguientes quieres como arma principal?");
					for (Arma arma : armas) 
					{
						if(arma instanceof Principal)
						{
							arma.mostrarNombre();
						}
					}
					String respuestaAP=sc.nextLine();
					P1.cambiarArmaP(respuestaArmMod,respuestaAP);
				}
				if(respuestaCambio.equalsIgnoreCase("Arma secundaria")) {
					System.out.println("¿Que arma de las siguientes quieres como arma secundaria?");
					for (Arma arma : armas) 
					{
						if(arma instanceof Secundaria)
						{
							arma.mostrarNombre();
						}
					}
					String respuestaAS=sc.nextLine();
					P1.cambiarArmaP(respuestaArmMod,respuestaAS);
				}
				if(respuestaCambio.equalsIgnoreCase("Municion")) {
					System.out.println("¿CUANTA MUNICION QUIERES AÑADIR?");
					int respuestaMunicion=sc.nextInt();
					sc.nextLine();
					P1.añadirMunicion(respuestaArmMod, respuestaMunicion);
				}
				if(respuestaCambio.equalsIgnoreCase("Accesorios")) {
					System.out.println("¿Que accesorios de los siguientes quieres añadir? Puedes añadir un maximo de 3");
					for (Accesorios accesorio : accesorios) 
					{
						accesorio.mostrarNombre();
					}
					String respuestaAccesorios=null;
					LinkedList<Accesorios> accesoriosN=new LinkedList<Accesorios>();
					for (int i = 0; i < 3; i++) {
						respuestaAccesorios=sc.nextLine();
						for (Accesorios accesorio : accesorios) 
						{
							if(accesorio.getNombre().equalsIgnoreCase(respuestaAccesorios))
							{
								accesoriosN.add(accesorio);
							}
						}
					}
					P1.cambiarAccesorios(respuestaArmMod, accesoriosN);
				}
				break;
			case 3:
				System.out.println("¿QUE ARMAMENTO QUIERES BORRAR?");
				String respuestaBorrarArmamento=sc.nextLine();
				boolean borrado=P1.borrarArmamento(respuestaBorrarArmamento);
				if(borrado) {
					System.out.println("ARMAMENTO BORRADO CORRECTAMENTE");
				}
				else{
					System.out.println("ERROR AL BORRAR. INTENTALO DE NUEVO");
				}
				break;
			case 4:
				System.out.println("INTRODUCE EL ARMA QUIERAS BUSCAR");
				String respuestaBuscarArma=sc.nextLine();
				P1.buscarPorArma(respuestaBuscarArma);
				break;
			case 5:
				System.out.println("¿DE QUE ARMAMENTO QUIERES SABER EL VALOR?");
				String respuestaValorArmamento=sc.nextLine();
				double valorA=0;
				for (Armamento armamento : armamentop1) {
					if(armamento.getNombre().equalsIgnoreCase(respuestaValorArmamento)) {
						valorA=P1.valorArmamento(armamento);
					}
				}
				System.out.println("EL VALOR DEL ARMAMENTO "+respuestaValorArmamento+" ES: "+valorA);
				break;
			case 6:
				System.out.println("ESTE ES EL VALOR TOTAL DE LOS ARMAMENTOS");
				double valorTotalA=P1.valorArmamentos();
				System.out.println("EL VALOR TOTAL DE LOS ARMAMENTOS ES: "+valorTotalA);
				break;
			case 7:
				P1.mostrarPersonaje();
				break;
			case 8:
				System.out.println("LA PARTIDA EMPEZARA PRONTO ¡PREPARATE!");
				break;
			case 9:
				System.out.println("Saliendo del menu");
				break;
			default:
				System.out.println("Error");
				break;
			}
		}while(opcion!=9 && opcion!=8);*/
		
		if(PersonajeBD.obtenerPersonaje() == null) {
			
			ventana_crear_personaje.frame = new ventana_crear_personaje();
			ventana_crear_personaje.frame.setVisible(true);
		}
		else {
			ventana_menu.frame = new ventana_menu();
			ventana_menu.frame.setVisible(true);
		}
		
		
	}

	private static void mostrarMenu() {
		System.out.println("-------------------------------------------");
		System.out.println("1-CREAR ARMAMENTO");
		System.out.println("2-MODIFICAR ARMAMENTO");
		System.out.println("3-BORRAR ARMAMENTO");
		System.out.println("4-BUSCAR ARMAMENTO POR TIPO DE ARMA");
		System.out.println("5-VALOR DE UN ARMAMENTO");
		System.out.println("6-VALOR TOTAL DE TODOS LOS ARMAMENTOS");
		System.out.println("7-MOSTRAR PERSONAJE");
		System.out.println("8-JUGAR");
		System.out.println("9-SALIR");
	}

}
