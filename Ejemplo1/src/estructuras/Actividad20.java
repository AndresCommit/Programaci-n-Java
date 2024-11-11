package estructuras;

import java.util.Scanner;

public class Actividad20 {
		public static void main (String[] args) {
	Scanner entrada=new Scanner(System.in);

	System.out.println("Escriba un número del 1 al 7 para saber si el día es laborable o festivo: ");
	int numero=entrada.nextInt();
	switch (numero) {
	
			case 1,2,3,4,5:
				System.out.println("El día es laborable");break;
		
			/*case 2:
				System.out.println("El día es Martes");break;
	
			case 3:
				System.out.println("El día es Miércoles");break;
		
			case 4:
				System.out.println("El día es Jueves");break;
		
			case 5:
					System.out.println("El día es Viernes");break;
		*/
			case 6,7:
					System.out.println("Es Festivo, vamos CHACHOOOOOOOOOO");break;
		
			default:
					System.out.println("No has introducido un dato válido");break;
	}
	 entrada.close();
}
}
