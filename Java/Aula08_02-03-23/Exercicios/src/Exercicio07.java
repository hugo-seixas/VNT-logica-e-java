
import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;

		System.out.print("Informe o primeiro valor a ser calculado: ");
		double numero1 = scanner.nextDouble();

		System.out.print("Informe o segundo valor a ser calculado: ");
		double numero2 = scanner.nextDouble();

		do {
			System.out.println("\nDigite a op��o desejada:\n" + "[1] Soma\n" + "[2] Subtra��o\n" + "[3] Multiplica��o\n"
					+ "[4] Divis�o\n" + "[5] Cancelar");

			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				double soma = numero1 + numero2;
				System.out.println("Soma = " + soma);
				break;

			case 2:
				double subtracao = numero1 - numero2;
				System.out.println("Subtra��o = " + subtracao);
				break;

			case 3:
				double multiplicacao = numero1 * numero2;
				System.out.println("Multiplica��o = " + multiplicacao);
				break;

			case 4:
				double divisao = numero1 / numero2;
				System.out.println("Divis�o = " + divisao);
				break;

			case 5:
				System.out.println("Opera��o Cancelada!");
				break;

			default:
				System.out.println("Opera��o inv�lida. Digite novamente.");
				break;
			}
		} while (opcao != 5);
		scanner.close();
	}
}
