package cadenas;
import java.util.Scanner;
public class Actividad4Presentacion {
	public static void main(String[] args) {
	//Escribe un programa que recoja una cadena de caracteres por teclado
	//y muestre el número de veces que aparece un carácter también recogido por teclado.
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escribe una cadena de carácteres");
		        String cadena = entrada.nextLine();

		        System.out.print("Introduce el carácter a contar: ");
		        char caracter = entrada.next().charAt(0);

		        int contador = 0;
		        for (int i = 0; i < cadena.length(); i++) {
		            if (cadena.charAt(i) == caracter) {
		                contador++;
		            }
		        }
		 System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces en la cadena.");
		}
	}
