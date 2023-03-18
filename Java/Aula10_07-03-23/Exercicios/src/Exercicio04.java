import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
       
		System.out.println("Entre com a coordenada x: ");
        int x = scanner.nextInt();
        
        System.out.println("Entre com a coordenada y: ");
        int y = scanner.nextInt();
        
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro quadrante");
            } else {
                System.out.println("quarto quadrante");
            }
           
            System.out.println("###########################");
            System.out.println("Entre com a coordenada x: ");
            x = scanner.nextInt();
          
            System.out.println("Entre com a coordenada y: ");
            y = scanner.nextInt();
        }
        
        System.out.println("Algoritmo Interrompido!!");
        scanner.close();

	}

}
