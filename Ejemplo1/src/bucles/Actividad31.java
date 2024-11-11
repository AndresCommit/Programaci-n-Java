package bucles;

import java.util.Scanner;

public class Actividad31 {
	public static void main (String[]args) {
	Scanner entrada= new Scanner(System.in);
	
	System.out.println("Escríbeme un número que indicará el número de veces que te voy a preguntar: ");

	int cantidad = 0;
	int num=0;
	int suma=0;

	cantidad=entrada.nextInt();

	for (int i=0; i<cantidad;i++) {
		System.out.println("Escríbeme un número: ");
		num=entrada.nextInt();
		suma=suma+num;
	
		
		}
	System.out.println("La media es: "+ suma/cantidad);
	 if (num%2!=0);
		System.out.println("Has introducido un número par");

	}
}
