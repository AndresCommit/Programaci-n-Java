package vectores;
import java.util.Scanner;
public class BusquedaBinaria {
	public static void main (String[] args) {
		int v[]= {2,4,5,7,15,22,31};
		int valor;
		Scanner  teclado=new Scanner (System.in);
		int ini=0, fin=v.length, me;
		//pedimos el valor a buscar
		System.out.println("Valor a buscar: ");
		valor=teclado.nextInt();
		
		for(int i=0;i<v.length;i++)
			System.out.println(v[i]+ "  ");
			System.out.println("BÚSQUEDA");

		do {
			//calcular mitad
			me=(ini+fin)/2;
			//nos quedamos con la mitad correspondiente
			if (v[me]>=valor)
				fin=me-1;
			else
				fin=me+1;
		}while (ini<=fin);
		System.out.println("Valor en posición: "+me);
		System.out.println();
	}
}
