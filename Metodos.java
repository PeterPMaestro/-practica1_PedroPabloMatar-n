package paquete1;

import java.util.Scanner;

public class Metodos {

	static Scanner sc = new Scanner(System.in);
	static String[] peliculas = new String[3];
	static String[] genero = new String[3];
	static int[] ano = new int[3];
	static String[] peliculas2 = new String[3];
	static String[] genero2 = new String[3];
	static int[] ano2 = new int[3];
	static int contador = 0;
	static int interruptor1 = 0;
	static int interruptor2 = 0;
	static int longitudPeliculas = peliculas.length;
	static boolean condicion = true;
	static String bandera = "n";
	static String palabra;
	static String mensajeAno = ("Introduzca el a�o del estreno: ");
	static String mensajePelicula = ("Introduzca el nombre de la pel�cula: ");
	static String mensajeGenero = ("Introduzca el g�nero: ");
	static String mensajeUpdate = ("Escriba el t�tulo que desea cambiar: ");
	static int num = 0;

	
	
//-------------------------------PEDIR INT -------------------------
	public static int pedirInt(String mensaje) {
		System.out.print(mensaje);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
// -------------------------- PEDIR STRING ------------------------------
	/*public static String pedirString(String mensaje) {
		System.out.print(mensaje);
		String palabra = sc.nextLine();	
		return palabra;
	}*/
//---------------------------MODULOS DE INSERTAR ------------------------------- 
	/*Permiten la posibilidad de hacer una o varias inserciones a la vez*/
	
	public static void IntroducirAno(String mensajeAno) {
		System.out.print(mensajeAno);
		ano[contador] = sc.nextInt();
		sc.nextLine();
	}

	public static void IntroducirPelicula(String mensajePelicula) {
		System.out.print(mensajePelicula);
		peliculas[contador] = sc.nextLine();

	}

	public static void IntroducirGenero(String mensajeGenero) {
		System.out.print(mensajeGenero);
		genero[contador] = sc.nextLine();
	}

	// -----------------CREATE / INSERTAR ------------------------------
	public static void CrearRegistro() {
		while (condicion) {
			if (peliculas[contador] == null) {
				Metodos.IntroducirPelicula(mensajePelicula);
				Metodos.IntroducirGenero(mensajeGenero);
				Metodos.IntroducirAno(mensajeAno);
				Metodos.condicion = false;
				System.out.println("Pel�cula guardada");
			} else {
				Metodos.contador++;
			}
		}
		contador = 0; 
		condicion = true;
	}

	// ----------------------READ ---------------------------
	public static void MostrarDatos() {
		//int longitudPeliculas = peliculas.length;
		for (int i=0; i < longitudPeliculas; i++) {
			if (peliculas[i] != null) {
			System.out.println("\nT�tulo: " + peliculas[i]);
			System.out.println("G�nero: " + genero[i]);
			System.out.println("A�o: " + ano[i] + "\n");
			}
		}
	}
	
	//--------------------- BUSCAR / SEARCH ----------------------
	public static void BucarPelicula (String mensajeUpdate) {
		
		System.out.print(mensajeUpdate);
		String Titulo = sc.nextLine();
		while (interruptor2 == 0) {
			if (Titulo.equals(peliculas[contador])) {
				System.out.println("\nT�tulo: " + peliculas[contador]);
				System.out.println("G�nero: " + genero[contador]);
				System.out.println("A�o: " + ano[contador] + "\n");
				//System.out.print("\nT�tulo cambiado.\n");
				interruptor2++;
				//contador++;
			} else if (contador <= longitudPeliculas) {
				interruptor2 = 1;
				System.out.print("Ese t�tulo no se encuentra en la lista.");	
			}
			contador++;
		}
		contador = 0;
		interruptor2 = 0;	
	}
	public static void BuscarA () {

	do {
		Metodos.num = Metodos.pedirInt("\nMen� de busqueda avanzada. \n1. B�squeda por t�tulo y coincidencia."
				+ "\n2. B�squeda por g�nero." + "\n3. B�squeda por a�o." + "\n4. Salir de la b�squeda avanzada"
				+ "\nElija una opci�n: ");
		switch (Metodos.num) {

		case 1:
			BuscarA.BuscarAPelicula();
			break;
		case 2:
			BuscarA.BuscarAGenero();

			break;
		case 3:
			BuscarA.BuscarAAno();
			break;
		case 4:
			System.out.println("B�squeda avanzada finalizada");
			Metodos.interruptor2 = 0;
			break;
		default:
			System.out.println("ERROR!. Elija un n� de la lista.");
			break;

		}
	} while (Metodos.interruptor2 == 1);
	Metodos.contador = 0;

}


	
	// ----------- UPDATE -------------------
	public static void UpdateLista(String mensajeUpdate) {
		System.out.print(mensajeUpdate);
		String Titulo = sc.nextLine();
		while (interruptor2 == 0) {
			if (Titulo.equals(peliculas[contador])) {
				// System.out.print("\nEscriba el nombre del nuevo t�tulo: ");
				IntroducirPelicula("\nEscriba el nombre del nuevo t�tulo: ");
				IntroducirGenero("\nEscriba el nombre del nuevo g�nero: ");
				IntroducirAno("\nEscriba el nombre del nuevo a�o: ");
				System.out.print("\nT�tulo cambiado.\n");
				interruptor2++;
				contador++;
			} else if (contador <= longitudPeliculas) {
				interruptor2 = 1;
				System.out.print("Ese t�tulo no se encuentra en la lista.");
				
			}
			contador++;
		}
		interruptor2 = 0;
		contador = 0; 	
	}
	public static void EliminarPelicula (String mensajePelicula) {
		System.out.print(mensajePelicula);
		String Titulo = sc.nextLine();
		while (interruptor2 == 0) {
			if (Titulo.equals(peliculas[contador])) {
				peliculas[contador] = null;
				genero[contador] = null;
				ano[contador] = 0;
				System.out.print("\nT�tulo eliminada.\n");
				interruptor2++;
			} else if (contador <= longitudPeliculas) {
				interruptor2 = 1;
				System.out.print("Ese t�tulo no se encuentra en la lista.");	
			}
			contador++;
		}
		contador = 0;
		interruptor2 = 0;	
	}
	
	// ---------------------------------FINALIZAR PROGRAMA -----------------------------
	public static void FinalizarPrograma() {
		contador = 0; 
		System.out.println("Programa finalizado");
		sc.close();
	}
	
}
