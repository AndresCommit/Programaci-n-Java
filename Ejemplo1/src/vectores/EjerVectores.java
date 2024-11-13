package vectores;
import java.util.Scanner;
public class EjerVectores {
	public static void main(String[] args) {
		//ejer1
		int v[]=new int[5];
		v[0]=1;
		v[1]=2;
		v[2]=3;
		v[3]=4;
		v[4]=5;
		
		System.out.print(" "+v[0]);
		System.out.print(" "+v[1]);
		System.out.print(" "+v[2]);
		System.out.print(" "+v[3]);
		System.out.print(" "+v[4]);
		System.out.println();
		//ejer2
		int v2[]= {3,5,8,-20,-45};
		System.out.print(" "+v2[0]);
		System.out.print(" "+v2[1]);
		System.out.print(" "+v2[2]);
		System.out.print(" "+v2[3]);
		System.out.print(" "+v2[4]);
		System.out.println();
		
		//ejer3
		Scanner teclado=new Scanner(System.in);
		int v3[]=new int[5];
		int pos;
		//leemos enteros y los guardamos en el vector
		for (pos=0;pos<5;pos++) {
			System.out.println("Introduce un entero: ");
			v3[pos]=teclado.nextInt();
		}
		//mostramos el vector
		for (pos=0;pos<5;pos++) 
			System.out.print(v3[pos]+" ");
		System.out.println();
		
		//ejer4. Calculo máx, mín y media
		double media=0.0;
		int max,min;
		
//		for (pos=0;pos<5;pos++) 
//			media=media+v3[pos];					
		max=v3[0];
		min=v3[0];
		for (pos=0;pos<5;pos++) {
			media=media+v3[pos];
			if (v3[pos]<min)
				min=v3[pos];
			if (v3[pos]>max)
				max=v3[pos];
		}
			
		media=media/5.0;		
		System.out.println("La media es: "+media);
		//Búsqueda del mínimo y del máximo
		//Guardamos el primer elemento como mínimo y máximo iniciales
//		max=v3[0];
//		min=v3[0];
//		for (pos=1;pos<5;pos++) {
//			if (v3[pos]<min)
//				min=v3[pos];
//			if (v3[pos]>max)
//				max=v3[pos];
//		}
		System.out.println("El mínimo es: "+min);
		System.out.println("El máximo es: "+max);
		
		//ejer 7 y 8
		int tam;		
		System.out.println("Introduce tamaño del array: ");
		tam=teclado.nextInt();
		
		int v5[]=new int[tam];
		for(pos=0;pos<v5.length;pos++) {
			System.out.println("Introduce un entero: ");
			v5[pos]=teclado.nextInt();
		}
		
		//mostramos el vector
		for (pos=0;pos<v5.length;pos++) 
			System.out.print(v5[pos]+" ");
		System.out.println();
		
		//ejer9 Copiar v5 en v6
		int v6[]=new int[v5.length];
		for (pos=0;pos<v6.length;pos++)
			v6[pos]=v5[pos];
		for (pos=0;pos<v6.length;pos++) 
			System.out.print(v6[pos]+" ");
		System.out.println();
		//ejer10 Copiar v5 en orden inverso en v7
		int v7[]=new int[v5.length];
		int posI=0;
		for (pos=v5.length-1;pos>=0;pos--) {
			v7[posI]=v5[pos];
			posI++;
		}
		for (pos=0;pos<v7.length;pos++) 
			System.out.print(v7[pos]+" ");
		System.out.println();
	}
}
