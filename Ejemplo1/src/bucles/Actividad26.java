package bucles;

import java.util.Scanner;

public class Actividad26 {
	public static void main(String[] args) {
		// programa que pida al usuario números hasta que el número insertado sea mayor
		// o igual que 10.
		// Cuando inserte un número mayor que 10 termina el programa con un mensaje que
		// lo indique e imprimiendo el número.
		int num;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Introduce un número menor o igual que 10: ");
			num = entrada.nextInt();
		} while (num < 10);
		System.out.println("Has introducido un número igual o mayor a 10: " + num);
		entrada.close();

	}
}
