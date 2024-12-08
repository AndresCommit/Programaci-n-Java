package PildorasInformaticas;

import java.util.Scanner;

public class Entrada_ejemplo01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca su nombre de usuario: ");
		String usuario = entrada.nextLine();
		
		System.out.println("Para acceder, introduce tu edad, porfavor: ");
		int edad = entrada.nextInt();
		if (edad >= 18) {
			System.out.println("Bienvenido, "+ usuario);
		} else {
			System.out.println("No cumples los requisitos para acceder, "+usuario+" ,lo sentimos.");
		}
	}

}
