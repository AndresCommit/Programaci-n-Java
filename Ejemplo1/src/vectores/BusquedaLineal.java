package vectores;

import java.util.Scanner;

public class BusquedaLineal {
public static void main (String[]args) {
	int v[]= {2,6,4,8,6,3};
	int valor;
	int pos=0;
	boolean encontrado=false;
	
	Scanner entrada=new Scanner (System.in);
	System.out.println("Introduce el valor a buscar: ");
	valor=entrada.nextInt();
	
	while(pos<v.length && encontrado==false) 
		if(v[pos]==valor);
			encontrado=true;
		
	if (encontrado==true)
	System.out.println("Está en la posición "+pos);
	
	}
}
