package bucles;
import java.util.Scanner;
public class Actividad23 {
public static void main (String[]args) {
	// programa que lea enteros hasta introducir un 0
	//e imprima la media de todos
	 Scanner scanner = new Scanner(System.in);
   int suma = 0;
   int cantidadNumeros = 10;

   // Bucle para pedir 10 números al usuario
   for (int i = 1; i <= cantidadNumeros; i++) {
       System.out.print("Introduce el número " + i + ": ");
       int numero = scanner.nextInt();
       suma += numero;
   }

   // Calcular la media
   double media = (double) suma / cantidadNumeros;
   System.out.println("La media de los números introducidos es: " + media);

   scanner.close();
}
}