package vectores;
import java.util.Scanner;
public class BusquedaLineal2 {
	public static void main (String[]args) {
		Scanner entrada=new Scanner (System.in);
		Scanner teclado=new Scanner (System.in);
		int pos,posEnc=0,valor = 0;
		final int TAM=6;
		int nota;
		int v[]=new int [6];
		boolean encontrado=false;


	        System.out.println("Introduce las 6 notas de los alumnos: ");
	        
	        for (pos = 0; pos < TAM; pos++) {
	            v[pos] = entrada.nextInt();
	        }
	        
	        System.out.println("Introduce la nota para saber su posición: ");
	        nota = entrada.nextInt();
	        
	        for (pos = 0; pos < v.length; pos++) {
	            if (v[pos] == nota) {
	                encontrado = true;
	                posEnc = pos;
	            }
	        }

	        if (encontrado) {
	            System.out.println("Está en la posición: " + posEnc);
	        } else {
	            System.out.println("La nota no está en el vector.");
	        }

	        entrada.close(); // Cerrar el Scanner
	    }
	}