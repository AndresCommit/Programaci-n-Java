package cadenas;
import java.util.Scanner;

public class Actividad2Presentacion {
public static void main (String[]args) {
	
	//Escribe un programa que recoja una cadena de caracteres por teclado 
	//y muestre el número de vocales que tiene. Utiliza una sola comparación.
	Scanner scanner= new Scanner (System.in);
	System.out.print("Introduce la cadena de caracteres: ");
	        String cadena = scanner.nextLine();
	        
	        int cont = 0;

	        for (char c : cadena.toCharArray()) {
	            // Comparamos si el carácter es una vocal
	            if ("aeiouAEIOU".indexOf(c) != -1) {
	                cont++;
	            }
	        }

	        System.out.println("Número de vocales: " + cont);
	        scanner.close();
	    }
	}

