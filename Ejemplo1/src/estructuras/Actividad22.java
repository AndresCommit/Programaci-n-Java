package estructuras;

import java.util.Scanner;

public class Actividad22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2, resul;
		System.out.println("Escribe un número entero: ");
		num1 = entrada.nextInt();

		System.out.println("Escribe otro número entero: ");
		num2 = entrada.nextInt();
		System.out.println(
		    "Introduce + si quieres sumar, - para restar, * para multiplicar, / para dividir y % para sacar el resto de la operación ");

		char operacion;
		operacion = entrada.next().charAt(0);

		switch (operacion) {
		case '+':
			resul = num1 + num2;
			System.out.println("El resultado es: " + resul);
			break;
		}

		switch (operacion) {
		case '-':
			resul = num1 - num2;
			System.out.println("El resultado es: " + resul);
			break;
		}

		switch (operacion) {
		case '*':
			resul = num1 * num2;
			System.out.println("El resultado es: " + resul);
			break;
		}

		switch (operacion) {
		case '/':
			resul = num1 / num2;
			System.out.println("El resultado es: " + resul);
			break;
		}
		switch (operacion) {
		case '%':
			resul = num1 % num2;
			System.out.println("El resultado es: " + resul);
			break;

		}

	}
}
