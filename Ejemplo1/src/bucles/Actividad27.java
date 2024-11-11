package bucles;
import java.util.Scanner;
public class Actividad27 {
	public static void main(String [] args) {
		Scanner numeros = new Scanner(System.in);
		int num;
		int suma=0;
		int cont=0;
		do {
			System.out.print("Introduzca un valor (0 para acabar): ");
			num = numeros.nextInt();
			if(num>0) {
				suma = suma+num;
			}
			cont = cont + 1;
		}while(num!=0);
		System.out.println("Has introducido el " + cont + " y la suma de todos los numeros es: " + suma );
	}
}