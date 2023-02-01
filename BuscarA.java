package paquete1;

public class BuscarA {

	static String subcadena;
	static int contadorV = 0;
	static int anoInicio = 0;
	static int anoFinal = 0;

	// --------------Búsqueda Avanzada de Películas -------------------
	public static void BuscarAPelicula() {
		System.out.print("\nEscriba una palabra del título: ");
		subcadena = Metodos.sc.nextLine();

		for (int i = 0; i < Metodos.longitudPeliculas; i++) {
			if (Metodos.peliculas[i].contains(subcadena)) {
				Metodos.peliculas2[Metodos.contador] = Metodos.peliculas[i];
				Metodos.genero2[Metodos.contador] = Metodos.genero[i];
				Metodos.ano2[Metodos.contador] = Metodos.ano[i];
				Metodos.contador++;
			}
		}
		for (int i = 0; i < Metodos.longitudPeliculas; i++) {
			if (Metodos.peliculas2[i] != null) {
				System.out.println("\nEncontré: ");
				System.out.println("\nTítulo: " + Metodos.peliculas2[i]);
				System.out.println("Género: " + Metodos.genero2[i]);
				System.out.println("Año: " + Metodos.ano2[i] + "\n");
			} else {
				contadorV++;
			}
		}
		if (contadorV == Metodos.longitudPeliculas) {
			System.out.println("\nNo he encontrado ninguna coincidencia\n");
		}
		LimpiarArray();
		Metodos.contador = 0;
		contadorV = 0;
		subcadena = null;
	}

	// ---------------------Búsqueda Avanzada de géneros
	// ------------------------------

	public static void BuscarAGenero() {
		System.out.print("\nEscriba una palabra del género: ");
		subcadena = Metodos.sc.nextLine();
		Metodos.interruptor1 = 1;

		for (int i = 0; i < Metodos.longitudPeliculas; i++) {
			if (Metodos.genero[i].contains(subcadena)) {
				Metodos.peliculas2[Metodos.contador] = Metodos.peliculas[i];
				Metodos.genero2[Metodos.contador] = Metodos.genero[i];
				Metodos.ano2[Metodos.contador] = Metodos.ano[i];
				Metodos.contador++;
			}
		}
		for (int i = 0; i < Metodos.longitudPeliculas; i++) {
			if (Metodos.peliculas2[i] != null) {
				System.out.println("\nEncontré: ");
				System.out.println("\nTítulo: " + Metodos.peliculas2[i]);
				System.out.println("Género: " + Metodos.genero2[i]);
				System.out.println("Año: " + Metodos.ano2[i] + "\n");
			} else {
				contadorV++;
			}
		}
		if (contadorV == Metodos.longitudPeliculas) {
			System.out.println("\nNo he encontrado ninguna coincidencia\n");
		}
		LimpiarArray();
		Metodos.contador = 0;
		subcadena = null;
		contadorV = 0;

	}

	// ----------------------------Búqueda avanzada por año
	// -------------------------

	public static void BuscarAAno() {
		anoInicio = Metodos.pedirInt("\nEscriba entre qué años quiere buscar." + "\nInica la búsqueda en el año: ");

		anoFinal = Metodos.pedirInt("\nFinaliza la búsqueda en el año: ");

		for (int i = 0; i < Metodos.longitudPeliculas; i++) {
			if (Metodos.ano[i] >= anoInicio && Metodos.ano[i] <= anoFinal) {
				Metodos.peliculas2[Metodos.contador] = Metodos.peliculas[i];
				Metodos.genero2[Metodos.contador] = Metodos.genero[i];
				Metodos.ano2[Metodos.contador] = Metodos.ano[i];
				Metodos.contador++;
			}
		}
		for (int i = 0; i < Metodos.longitudPeliculas; i++) {
			if (Metodos.peliculas2[i] != null) {
				System.out.println("\nEncontré: ");
				System.out.println("\nTítulo: " + Metodos.peliculas2[i]);
				System.out.println("Género: " + Metodos.genero2[i]);
				System.out.println("Año: " + Metodos.ano2[i] + "\n");
			} else {
				contadorV++;
			}
		}
		if (contadorV == Metodos.longitudPeliculas) {
			System.out.println("\nNo he encontrado ninguna coincidencia\n");
		}
		LimpiarArray();
		Metodos.contador = 0;
		anoInicio = 0;
		anoFinal = 0;
		contadorV = 0;
	}

	// -------------------Limpiar Array ------------------------------
	public static void LimpiarArray() {
		for (int i = 0; i < Metodos.longitudPeliculas; i++) {
			if (Metodos.peliculas2[i] != null) {
				Metodos.peliculas2[i] = null;
				Metodos.genero2[i] = null;
				Metodos.ano2[i] = 0;
			}
		}
	}
}

