package paquete1;

public class BuscarA {

	static String subcadena;
	static int contadorV = 0;
	static int anoInicio = 0;
	static int anoFinal = 0;

	// --------------B�squeda Avanzada de Pel�culas -------------------
	public static void BuscarAPelicula() {
		System.out.print("\nEscriba una palabra del t�tulo: ");
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
				System.out.println("\nEncontr�: ");
				System.out.println("\nT�tulo: " + Metodos.peliculas2[i]);
				System.out.println("G�nero: " + Metodos.genero2[i]);
				System.out.println("A�o: " + Metodos.ano2[i] + "\n");
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

	// ---------------------B�squeda Avanzada de g�neros
	// ------------------------------

	public static void BuscarAGenero() {
		System.out.print("\nEscriba una palabra del g�nero: ");
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
				System.out.println("\nEncontr�: ");
				System.out.println("\nT�tulo: " + Metodos.peliculas2[i]);
				System.out.println("G�nero: " + Metodos.genero2[i]);
				System.out.println("A�o: " + Metodos.ano2[i] + "\n");
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

	// ----------------------------B�queda avanzada por a�o
	// -------------------------

	public static void BuscarAAno() {
		anoInicio = Metodos.pedirInt("\nEscriba entre qu� a�os quiere buscar." + "\nInica la b�squeda en el a�o: ");

		anoFinal = Metodos.pedirInt("\nFinaliza la b�squeda en el a�o: ");

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
				System.out.println("\nEncontr�: ");
				System.out.println("\nT�tulo: " + Metodos.peliculas2[i]);
				System.out.println("G�nero: " + Metodos.genero2[i]);
				System.out.println("A�o: " + Metodos.ano2[i] + "\n");
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

