package vectores;

public class Ejercicio5 {
	public static void main(String[] args) {
			int m[][]= {{1,2,3,4},{10,20,30,40},{100,200,300,400}};
				
				for (int filas=0; filas<m.length;filas++) {
				System.out.println("Los valores de la fila "+filas+" son: \n");
				for (int columnas=0;columnas<m[filas].length;columnas++){
					System.out.println(m[filas][columnas]+"\n");
					
				}
			}
	}
}
