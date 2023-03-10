import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Informe o valor inicial de X: ");
		double x = scanner.nextDouble();

		System.out.print("Informe o valor para multiplicar: ");
		double y = scanner.nextDouble();
		
		x *= y;
		
		System.out.println("Valor final de X: " + x );
		
		scanner.close();

	}

}
