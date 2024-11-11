package bucles;
import java.util.Scanner;
public class Actividad25 {
	public static void main (String[]args) {
		/*programa que pida varios números hasta que el usuario inserte un número par.
		  Hay que ir visualizando cada uno de los números insertados
		   (excepto el número par). Cuando termine porque ha insertado un número par debe mostrar un mensaje indicándolo. */
int num;
Scanner entrada=new Scanner(System.in);
System.out.println("Introduce un número: ");
num=entrada.nextInt();
//bucle principal

if(num%2!=1) {
			System.out.println("Has introducido el " +num+" y es un número par. FIN");
}
else {
while (num%2==1){
			System.out.println("Has introducido el " +num);
			System.out.println("Introduce otro número: ");
			num=entrada.nextInt();

			}
if(num%2!=1) {
	System.out.println("Has introducido el " +num+" y es un número par. FIN");
						}
			}
entrada.close();
	}
}
