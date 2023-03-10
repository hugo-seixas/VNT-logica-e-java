import java.util.Scanner;

public class Exercicio04Int {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o valor inicial de W: ");
		int w = scanner.nextInt();

		System.out.print("Informe o valor para dividir: ");
		float x = scanner.nextFloat();

		w %= x;

		System.out.println("Valor final de W: " + w);

		scanner.close();

	}

}
