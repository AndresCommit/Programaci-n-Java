public class PR0210_IntroJava {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n;
 
  
    do {
        System.out.print("Introduce un número entero (entre 1 y 29): ");
        n = scanner.nextInt();
        if (n <= 0 || n >= 30) {
            System.out.println("El número debe ser mayor que 0 y menor que 30. Inténtalo de nuevo.");
        }
    } while (n <= 0 || n >= 30);
 
   
    for (int i = 1; i <= n; i++) {
      
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }
      
        for (int k = 1; k <= i; k++) {
            System.out.print("* ");
        }
       
        System.out.println();
    }
 
    scanner.close();
}
}