package bucles;

import java.util.Scanner;

public class Actividad44 {
	public static void main (String[]args) {
		
		Scanner entrada= new Scanner(System.in);
int num;
System.out.println("Introduce un número del 1 al 10 para imprimir su tabla de multiplicar ");
num=entrada.nextInt();
	System.out.println("Tabla del: "+num);
	System.out.println("------------------");
	
	for(int i=1;i<=10;i++) {
			System.out.println(num*i);

	
		}
	}
}
