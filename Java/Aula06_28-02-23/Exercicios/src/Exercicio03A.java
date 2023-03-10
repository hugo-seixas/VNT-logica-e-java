import java.util.Scanner;

public class Exercicio03A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o valor inicial de Y: ");
		float y = scanner.nextFloat();

		System.out.print("Informe o valor para dividir: ");
		float x = scanner.nextFloat();

		y /= x;

		System.out.println("Valor final de Y: " + y);

		scanner.close();

	}

}
