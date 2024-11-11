package estructuras;

import java.util.Scanner;

public class Actividad19 {
		public static void main (String[] args) {
	Scanner entrada=new Scanner(System.in);

	System.out.println("Escriba un número del 1 al 7: ");
	int numero=entrada.nextInt();
	switch (numero) {
	
			case 1:
				System.out.println("El día es Lunes");break;
		
			case 2:
				System.out.println("El día es Martes");break;
	
			case 3:
				System.out.println("El día es Miércoles");break;
		
			case 4:
				System.out.println("El día es Jueves");break;
		
			case 5:
					System.out.println("El día es Viernes");break;
		
			case 6:
					System.out.println("El día es Sábado");break;
		
			case 7:
					System.out.println("El día es Domingo");break;
		
			default:
					System.out.println("No has introducido un dato válido");break;
	}
	 entrada.close();
}
}
