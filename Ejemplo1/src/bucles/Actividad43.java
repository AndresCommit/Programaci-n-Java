package bucles;
import java.util.Scanner;

public class Actividad43 {
	public static void main (String[]args) {
		int num=0,i,j;
		Scanner entrada=new Scanner(System.in);

		do {
		System.out.println("Introduzca un entero: ");
		num=entrada.nextInt();
		}while (num<1);

		for(i=1;i<=num;i++)	{				
			
				for(j=1;j<=num;j++)
					System.out.print("* ");
					System.out.println();
	
		}
		entrada.close();
		
	
	}
}
