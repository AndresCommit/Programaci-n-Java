package vectores;

import java.util.Scanner;

public class Vector7_Notas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] notas = new int[8];
		System.out.print("Introduce 8 notas: \n");

		for (int i = 0; i < 8; i++) {
			notas[i] = entrada.nextInt();
			if (notas[i] < 0 || notas[i] > 10) {
				System.out.println("Nota inválida. Por favor ingrese una nota entre 0 y 10.");
				i--;
			}
		}
		System.out.println("Notas ordenadas de mayor a menor (las repetidas no se muestran) : ");
		for (int i = 0; i < 8; i++) {
			// Declaramos -1 al máximo
			// Para que lo sustituya cualquier número ( Hasta el 0)
			int max = -1;
			for (int j = 0; j < 8; j++) {
				if (notas[j] > max) {
					max = notas[j];
				}
			}
			if (max > 0) {
				System.out.println(max);
				for (int k = 0; k < 8; k++) {
			//Comparamos al máximo y restamos 1 para seguir comparando
					if (notas[k] == max) {
						notas[k] = -1;
					}

				}
			}
		}
	}
}
