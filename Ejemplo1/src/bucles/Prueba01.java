package bucles;

import java.util.Scanner;

public class Prueba01 {
	public static void main (String[]args) {
		
		//Metemos el Scanner
		Scanner entrada= new Scanner(System.in);
		//Variables
		int num;
		int nMax;
		
		System.out.println("Escribe un número entero: ");
		num=entrada.nextInt();
		nMax=num;
		
		
		while (num!=0) {
			System.out.println("Escribe un número entero: ");
			num=entrada.nextInt();
		
	}
		if (num>nMax) {
			nMax=num;
		}	
		System.out.println("El máximo es: "+nMax);
	}
}
