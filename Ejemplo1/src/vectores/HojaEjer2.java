package vectores;

import java.util.Scanner;

public class HojaEjer2 {
	public static void main(String[] args) {
		//pedimos el número "n"
		int n;
		Scanner teclado=new Scanner (System.in);
		Scanner entrada= new Scanner (System.in);

		System.out.println("Introduce un número para determinar el rango del vector: ");
		n=teclado.nextInt();
		if (n<1) {
			System.out.println("Has introducido un número inválido");
			teclado.close();
		}
		

		int [] v= new int [n];
		System.out.println("Introduce "+n+" números: ");

		for (int i=0; i<n;i++)
			v[i] = entrada.nextInt();
		for(int k=1;k<=n;k++)
		System.out.print(v[n-k]+ " ");

	}
}
