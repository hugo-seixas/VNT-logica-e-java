import java.util.Scanner;

public class Exercicio04Float {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o valor inicial de W: ");
		float w = scanner.nextFloat();

		System.out.print("Informe o valor para dividir: ");
		float x = scanner.nextFloat();

		w %= x;

		System.out.println("Valor final de W: " + w);

		scanner.close();

	}

}
