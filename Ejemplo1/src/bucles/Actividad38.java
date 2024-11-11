package bucles;
import java.util.Scanner;
public class Actividad38 {
//calcular los salario semanal de unos empleados a los que se les paga 15 euros por hora si éstas no superan las 35 horas. Cada hora por encima de 35 se considerará extra y se paga a 22 €. 
public static void main (String[]args) {
	int horas;
	System.out.println("Introduzca el número de horas para saber su salario: ");
	Scanner entrada= new Scanner(System.in);
	horas=entrada.nextInt();

	if (horas<35) {
		System.out.println("El salario será: " + horas * 15 +"€");

		
		}
	}
}