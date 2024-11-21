package vectores;

import java.util.Scanner;

public class HojaEjer1 {
	public static void main(String[] args) {
		//	programa que pida al usuario 4 números enteros 
		//y los almacene en un vector. 
		//Después, debes mostrar esos números por pantalla. 

		Scanner entrada= new Scanner (System.in);
		int [] v= new int [4];
		System.out.println("");
		System.out.println("Introduce 4 números: ");

		for (int i=0; i<4;i++)
			v[i] = entrada.nextInt();
			System.out.println("Has introducido el: ");
			System.out.print(" "+v[0]);
			System.out.print(" "+v[1]);
			System.out.print(" "+v[2]);
			System.out.print(" "+v[3]);

	}
}
