package vectores;
import java.util.Scanner;
public class BusquedaBinariaDecreciente {
	public static void main (String[]args) {
	//Escribe un programa que pida las notas que han obtenido 6 alumnos en el módulo de Programación; posteriormente, 
	//el programa visualizará la posición donde está colocado el alumno que haya obtenido una determinada nota,
	//que se insertará a través del teclado. Si no hay ningún alumno con esa nota, se visualizará el mensaje correspondiente. 
	//Suponemos que el usuario va a insertar las notas de forma ordenada (descendentemente). Hay que utilizar el método de búsqueda binaria.
		 int v[]= {2,4,5,5,7,8,9};
	        int valor;
	        int ini,fin,me;
	        boolean encontrado=false;
	        int posEn=0;
	       
	        Scanner entrada=new Scanner(System.in);
	        System.out.println("Introduce valor a buscar: ");
	        valor=entrada.nextInt();
	 
	        // Inicialización
	        ini = 0;
	        fin= v.length - 1;
	        me = (ini + fin) / 2;
	        // buscando posición
	        while (ini >= fin && encontrado==false) {
	            if (v[me] < valor)
	                // cambiamos fin. Nos quedamos con la mitad izquierda
	                fin = me - 1;
	            else
	                // cambiamos ini. Nos quedamos con mitad derecha
	                ini = me+1;
	                       
	            //Comprobamos el valor del medio
	            if (v[me] == valor) {
	                encontrado=true;
	                posEn=me;
	            }
	           
	            me = (ini + fin) / 2;
	        }
	 
	        if (encontrado==true)
	            System.out.println("Valor en posición: " + posEn);
	        else
	            System.out.println("Valor no encontrado.");
	       
	    }
	 
	}