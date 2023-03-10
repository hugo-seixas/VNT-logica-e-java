import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Informe o valor que esta sobrando na carteira: R$ ");
	        double valor = scanner.nextDouble();

	        if (valor >= 30) {
	            System.out.println("Vá ao Cinema!");
	        }
	        else {
	            System.out.println("Fique em casa vendo Tv!");
	        }
	        
	        scanner.close();
	}

}
