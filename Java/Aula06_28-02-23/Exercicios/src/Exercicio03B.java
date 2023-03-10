import java.util.Scanner;

public class Exercicio03B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o valor inicial de Y: ");
		int y = scanner.nextInt();

		System.out.print("Informe o valor para dividir: ");
		float x = scanner.nextFloat();

		y /= x;

		System.out.println("Valor final de Y: " + y);

		scanner.close();

	}

}
