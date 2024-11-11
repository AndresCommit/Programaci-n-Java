package bucles;
import java.util.Scanner;
public class Actividad24 {
public static void main (String[]args) {
	int num;
	int producto=1;
	Scanner entrada=new Scanner(System.in);
	System.out.println("Introduce un número entero (0=FIN):");
	num=entrada.nextInt();
	//bucle principal
if (num==0)
System.out.println("No hay números. FIN");

else {
	while (num!=0) {
		producto=producto*num;
		System.out.println("Introduce un número entero (0=FIN)");
		num=entrada.nextInt();
			}
	}
//salida
System.out.println("El producto de los n´´umeros es:"+ producto);
	}
}
