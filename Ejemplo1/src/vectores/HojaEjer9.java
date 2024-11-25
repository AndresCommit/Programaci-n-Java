package vectores;

public class HojaEjer9 {
	public static void main(String[] args) {
		// Declaramos el tamaño de la matriz
		final int TAMAÑO = 8;
		int[][] matriz = new int[TAMAÑO][TAMAÑO]; 

		for (int i = 0; i < TAMAÑO; i++) {
			for (int j = 0; j < TAMAÑO; j++) {
				if (i == j) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0;
				}
			}
		}

		// Imprimimos la matriz
		for (int i = 0; i < TAMAÑO; i++) {
			for (int j = 0; j < TAMAÑO; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
			// Nueva línea después de cada fila
		}
	}
}
