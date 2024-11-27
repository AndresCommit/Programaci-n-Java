package vectores;
import java.util.Scanner;
public class HojaEjer11 {

	public static void main(String[] args) {
		final int DEPARTAMENTOS = 4;
		final int PROFESORES_POR_DEPARTAMENTO = 6;

		       int[][] edades = new int[DEPARTAMENTOS][PROFESORES_POR_DEPARTAMENTO];
		        Scanner scanner = new Scanner(System.in);

		        for (int i = 0; i < DEPARTAMENTOS; i++) {
		            for (int j = 0; j < PROFESORES_POR_DEPARTAMENTO; j++) {
		                System.out.print("Ingrese la edad del profesor " + (j + 1) + " del departamento " + i + ": ");
		                edades[i][j] = scanner.nextInt();
		            }
		        }

		        while (true) {
		            System.out.print("Ingrese una edad para buscar (negativa para salir): ");
		            int edadBuscada = scanner.nextInt();

		            // Salir si la edad es negativa
		            if (edadBuscada < 0) {
		                break;
		            }

		            // Variables para almacenar el último profesor encontrado
		            int departamentoEncontrado = -1;
		            int profesorEncontrado = -1;

		            for (int i = 0; i < DEPARTAMENTOS; i++) {
		                for (int j = 0; j < PROFESORES_POR_DEPARTAMENTO; j++) {
		                    if (edades[i][j] == edadBuscada) {
		                        departamentoEncontrado = i;
		                        profesorEncontrado = j + 1; 
		                    }
		                }
		            }

		            if (departamentoEncontrado != -1) {
		                System.out.println("El último profesor con la edad " + edadBuscada + " es el profesor " + profesorEncontrado + " del departamento " + departamentoEncontrado + ".");
		            } else {
		                System.out.println("No se encontró ningún profesor con la edad " + edadBuscada + ".");
		            }
		        }

		        scanner.close();
		    }	
	}
