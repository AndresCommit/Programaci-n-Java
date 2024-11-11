package bucles;

import java.util.Scanner;

public class Actividad32 {
	public static void main (String[]args) {
		
		//Metemos el Scanner
		Scanner entrada= new Scanner(System.in);
		
		//Declaramos variables
		int nota;
		int aprobados=0;
		
		//Estructura de repetición for
		for (int i=0;i<10;i++) {
			
		do {
			System.out.println("¿Qué nota has sacado? ");
			nota=entrada.nextInt();

      if (nota < 0 || nota > 10) {
          System.out.println("Has introducido una nota incorrecta. Debe estar entre 0 y 10.");
      }
		} while (nota < 0 || nota > 10);
		 if (nota >= 5) {
       aprobados++;
		 		}
			}
		 System.out.println("El número de alumnos que han aprobado es: " + aprobados);
		entrada.close();
		}
	}

