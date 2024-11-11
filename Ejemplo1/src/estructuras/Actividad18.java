package estructuras;
import java.util.Scanner;

public class Actividad18 {
	public static void main(String []args) {
	Scanner entrada=new Scanner (System.in);
	int num1, num2, num3;
	
	System.out.println("Introduce un número entero: ");
	num1=entrada.nextInt();
	System.out.println("Introduce un número entero: ");
	num2=entrada.nextInt();
	System.out.println("Introduce un número entero: ");
	num3=entrada.nextInt();
	
	//Proceso y salida
	if (num1<num2 && num1<=num3)
		System.out.println("El número menor es:  "+num1);
	
	else if (num2<num1 && num2<=num3)
		System.out.println("El número menor es:  "+num2);
	
	else 
		System.out.println("El número menor es:  "+num3);
	
	}

}
