package estructuras;
import java.util.Scanner;

public class Actividad17 {
	//programa que lea un número y debe mostrar por pantalla si es positivo, negativo o cero
	public static void main(String []args) {
	Scanner entrada=new Scanner (System.in);
	
	System.out.println("Introduce un número entero: ");
	double num=entrada.nextDouble();
	 if (num > 0) {
         System.out.println("El número es positivo.");
     } else if (num < 0) {
         System.out.println("El número es negativo.");
     } else {
         System.out.println("El número  "+num+" es cero.");
     }
	 // Cerrar el objeto Scanner para liberar recursos.
     entrada.close();

	}

}