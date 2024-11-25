package practicasT3;
public class Dados {

	public static void main(String[] args) {
		//Creamos una variable para número aleatorio y otra para inicializar el array
		//Constantes para el número de veces y el número de caras del dado
		int numAle;
		final int CARAS= 6;
		int v[] = new int [CARAS] ;
		final int NUMVECES=10000;
			//Bucle for para repetir 10000 tiradas 
		for (int i = 0; i < NUMVECES; i++) {
			numAle= (int)(6*Math.random());
	            // Incrementamos el contador del número
			v[numAle]++; 
			
		}
		 for (int k = 0; k < v.length; k++) {
		            int numero = k + 1;
		            System.out.print("El número " + numero + " ha salido " + v[k] + " veces: ");
		            
		            // Calculamos cuántos asteriscos hay que mostrar
		            int asteriscos = v[k] / 100; 
		            
		            for (int j = 0; j < asteriscos; j++) {
		             //Usamos print en vez de println para imprimir los *
		            System.out.print("*");
		            }
		            //Salto de línea
		            System.out.println("\n");
		 }
	}
}
