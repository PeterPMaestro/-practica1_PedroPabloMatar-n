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
	static String mensajeAno = ("Introduzca el año del estreno: ");
	static String mensajePelicula = ("Introduzca el nombre de la película: ");
	static String mensajeGenero = ("Introduzca el género: ");
	static String mensajeUpdate = ("Escriba el título que desea cambiar: ");
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
				System.out.println("Película guardada");
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
			System.out.println("\nTítulo: " + peliculas[i]);
			System.out.println("Género: " + genero[i]);
			System.out.println("Año: " + ano[i] + "\n");
			}
		}
	}
	
	//--------------------- BUSCAR / SEARCH ----------------------
	public static void BucarPelicula (String mensajeUpdate) {
		
		System.out.print(mensajeUpdate);
		String Titulo = sc.nextLine();
		while (interruptor2 == 0) {
			if (Titulo.equals(peliculas[contador])) {
				System.out.println("\nTítulo: " + peliculas[contador]);
				System.out.println("Género: " + genero[contador]);
				System.out.println("Año: " + ano[contador] + "\n");
				//System.out.print("\nTítulo cambiado.\n");
				interruptor2++;
				//contador++;
			} else if (contador <= longitudPeliculas) {
				interruptor2 = 1;
				System.out.print("Ese título no se encuentra en la lista.");	
			}
			contador++;
		}
		contador = 0;
		interruptor2 = 0;	
	}
	public static void BuscarA () {

	do {
		Metodos.num = Metodos.pedirInt("\nMenú de busqueda avanzada. \n1. Búsqueda por título y coincidencia."
				+ "\n2. Búsqueda por género." + "\n3. Búsqueda por año." + "\n4. Salir de la búsqueda avanzada"
				+ "\nElija una opción: ");
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
			System.out.println("Búsqueda avanzada finalizada");
			Metodos.interruptor2 = 0;
			break;
		default:
			System.out.println("ERROR!. Elija un nº de la lista.");
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
				// System.out.print("\nEscriba el nombre del nuevo título: ");
				IntroducirPelicula("\nEscriba el nombre del nuevo título: ");
				IntroducirGenero("\nEscriba el nombre del nuevo género: ");
				IntroducirAno("\nEscriba el nombre del nuevo año: ");
				System.out.print("\nTítulo cambiado.\n");
				interruptor2++;
				contador++;
			} else if (contador <= longitudPeliculas) {
				interruptor2 = 1;
				System.out.print("Ese título no se encuentra en la lista.");
				
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
				System.out.print("\nTítulo eliminada.\n");
				interruptor2++;
			} else if (contador <= longitudPeliculas) {
				interruptor2 = 1;
				System.out.print("Ese título no se encuentra en la lista.");	
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
