package vectores;
import java.util.Scanner;
public class Vector1 {
	 public static void main(String[] args) {
     // Crear un vector de tamaño 5
     int[] vector = new int[5];
     int pos;
     int[] vector2 = new int [6];
     Scanner scanner = new Scanner(System.in);

     // Rellenamos el vector con datos
     System.out.println("Introduce 5 números para llenar el vector:");
     for (int i = 0; i < vector.length; i++) {
         System.out.print("Número " + (i + 1) + ": ");
         vector[i] = scanner.nextInt();
     }

     // Mostrar los datos del vector
     System.out.println("Los datos del vector son:");
     for (int i = 0; i < vector.length; i++) {
         System.out.println("Elemento " + (i + 1) + ": " + vector[i]);
     }
    
     scanner.close();
     //ejer 9 Copiar V5 en V6
     int v6[] =new int [v6.length];
     for (pos=0;pos<v6.length;pos++);
     System.out.println();
	 }
}

