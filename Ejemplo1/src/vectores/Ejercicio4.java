package vectores;

public class Ejercicio4 {
	public static void main(String[] args) {
			int alumnos[][]= {{30,27,25,21,19,16},{21,17,24,26,30,30}};
			for (int filas=0; filas<alumnos.length;filas++) {
				System.out.println("Los valores de la fila "+filas+" son: ");
				for (int columnas=0;columnas<alumnos[filas].length;columnas++){
					System.out.println(alumnos[filas][columnas]);
					
				}
				
			}
			
	}
}
