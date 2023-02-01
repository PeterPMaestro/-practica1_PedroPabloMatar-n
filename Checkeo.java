package paquete1;

public class Checkeo {

	
	
	public static void ChekeoArrays () {
		  while(Metodos.contador < Metodos.longitudPeliculas  && Metodos.peliculas[Metodos.contador] == null) {
			 
			  Metodos.contador++;
				BuscarA.contadorV = Metodos.contador;
			}
		  
			if(BuscarA.contadorV == Metodos.longitudPeliculas) {
				System.out.println("No hay películas en la base de datos. "
						+ "\nDebe introducir al menos una película primero");
				Metodos.contador = 0;
				BuscarA.contadorV = 0;
				Metodos.CrearRegistro();
				
			}
			Metodos.contador = 0;
			BuscarA.contadorV = 0;
	}
}
