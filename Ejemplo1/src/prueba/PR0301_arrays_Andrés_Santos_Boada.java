package prueba;

import java.util.Random;

public class PR0301_arrays_Andrés_Santos_Boada {
    public static void main(String[] args) {
        int[] conteo = new int[6]; // Array para contar las salidas de cada número (1-6)
        Random random = new Random();

        // Simulación de lanzar el dado 10,000 veces
        for (int i = 0; i < 10000; i++) {
            int resultado = random.nextInt(6) + 1; // Genera un número entre 1 y 6
            conteo[resultado - 1]++; // Incrementa el conteo del número
        }

        // Mostrar resultados
        for (int i = 0; i < conteo.length; i++) {
            int numero = i + 1;
            System.out.print("El número " + numero + " ha salido " + conteo[i] + " veces: ");
            int asteriscos = conteo[i] / 100; // Calcula cuántos asteriscos mostrar
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }
            System.out.println(); // Salto de línea
        }
    }
}