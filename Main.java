package paquete1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean interruptor = true;
		
		while (interruptor) {
			
			int eleccion = Metodos.pedirInt( "\n1. Insertar película."
					+ "\n2. Mostrar películas." + "\n3. Buscar una película." + "\n4. Búsqueda avanzada."
					+ "\n5. Actualizar datos." + "\n6. Salir." + "\nElija una opción: " );
					
			switch (eleccion) {

			case (1):
				// -------CREATE (Insertar Datos)
				Metodos.CrearRegistro();
				
			break;
				
			case (2):
				// --------READ (MOSTRAR)
				Checkeo.ChekeoArrays();
				Metodos.MostrarDatos();
				
				
				break;
			case (3):
				// ------- READ (Buscar datos)
				Checkeo.ChekeoArrays();
				Metodos.BucarPelicula(Metodos.mensajePelicula);
				
				break;
			case (4):
				// ---- READ (Búsqueda avanzada)
				Checkeo.ChekeoArrays();
				Metodos.BuscarA();
			
				break;
			case (5):
				// ----UPDATE
				Checkeo.ChekeoArrays();
				Metodos.UpdateLista(Metodos.mensajeUpdate);
				break;
				
			case (6):
				Metodos.FinalizarPrograma();
				interruptor = false; 
				break;
				
			default:
				System.out.println("ERROR!. Elija un nº de la lista.");
				break;
			}
		}
		
	}

}


