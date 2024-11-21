package vectores;

public class HojaEjer3 {
 public static void main(String[]args) {
	//Define un array de las notas medias de 4 alumnos en las 3 evaluaciones de un curso.
	 //Inicializa el array a los valores que quieras y después muéstralas por pantalla. 
	 int v[]={2,4,7,8};
	 System.out.println("Las notas medias de los alumnos son: ");
	// Mostrar los datos del vector
	     System.out.println("Los datos del vector son:");
	     for (int i = 0; i < v.length; i++) {
	         System.out.println("Elemento " + (i + 1) + ": " + v[i]);
	     }
}
}
