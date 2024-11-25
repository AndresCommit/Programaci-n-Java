package vectores;
import java.util.Scanner;
public class HojaEjer4 {
	public static void main (String[]args) {
		//Escribe un programa que pida las notas que han obtenido los 6 alumnos de una clase en un determinado módulo y el nombre de cada uno de los alumnos. 
		//Después, se visualizará por pantalla el nombre de cada alumno con su nota. 
		Scanner entrada = new Scanner(System.in);
	        String[] nombres = new String[6];
	        int[] notas = new int[6];

	        // Solicitar nombres y notas
	        for (int i = 0; i < 6; i++) {
	            System.out.print("Introduce el nombre del alumno " + (i + 1) + ": ");
	            nombres[i] = entrada.nextLine();
	            System.out.print("Introduce la nota de " + nombres[i] + ": ");
	            notas[i] = entrada.nextInt();
	            entrada.nextLine();
	        }

	        // Visualizar nombres y notas
	        System.out.println("\nNotas de los alumnos:");
	        for (int i = 0; i < 6; i++) {
	            System.out.println(nombres[i] + ": " + notas[i]);
	        }

	    }
	}
	