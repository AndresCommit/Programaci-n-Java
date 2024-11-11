package vectores;

public class Ejemplo01 {
	public static void main (String[]args) {
		int nAlumnos [] ={21,17,30,14,12,25};
		String Modulos [] = {"Sistemas Informaticos", "Bases de Datos",
				"Programación", "Lenguaje de Marcas", "Entornos de Desarrollo", 
				"Acceso a Datos"};
		for(int pos=0; pos<nAlumnos.length; pos++) {
		System.out.println("Módulo "+ Modulos[pos]);
		System.out.println(" "+ nAlumnos[pos]);

		}
	}
}
