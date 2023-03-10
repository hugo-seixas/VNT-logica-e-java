import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o valor inicial de Y: ");
		double y = scanner.nextDouble();

		System.out.print("Informe o valor para dividir: ");
		double x = scanner.nextDouble();

		y /= x;

		System.out.println("Valor final de Y: " + y);

		scanner.close();

	}

}
