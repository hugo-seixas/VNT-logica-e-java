
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
			System.out.println("\nDigite a opção desejada:\n" + "[1] Soma\n" + "[2] Subtração\n" + "[3] Multiplicação\n"
					+ "[4] Divisão\n" + "[5] Cancelar");

			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				double soma = numero1 + numero2;
				System.out.println("Soma = " + soma);
				break;

			case 2:
				double subtracao = numero1 - numero2;
				System.out.println("Subtração = " + subtracao);
				break;

			case 3:
				double multiplicacao = numero1 * numero2;
				System.out.println("Multiplicação = " + multiplicacao);
				break;

			case 4:
				double divisao = numero1 / numero2;
				System.out.println("Divisão = " + divisao);
				break;

			case 5:
				System.out.println("Operação Cancelada!");
				break;

			default:
				System.out.println("Operação inválida. Digite novamente.");
				break;
			}
		} while (opcao != 5);
		scanner.close();
	}
}
