import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		int numero = scanner.nextInt();
		
		System.out.println("Os divisores de " + numero + " s�o: ");
        
		for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
		
		scanner.close();
	}

}
