package bucles;

import java.util.Scanner;

public class Actividad30 {
	public static void main (String[]args) {
		Scanner entrada= new Scanner(System.in);
		int suma=0;

		int num;
		for (int i=0 ; i<=6;i++) {
			

			System.out.println("Escríbeme un número: ");
			num=entrada.nextInt();
			suma=num+num+num+num+num+num;

			
		}
		System.out.println("La suma de los números es: " + suma );

	}
}
