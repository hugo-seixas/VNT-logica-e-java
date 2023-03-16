
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		
		do {
			System.out.println("Digite a op��o desejada:\n" + "[1] para doar R$10\n" + "[2] para doar R$25\n" + "[3] para doar R$50\n"
					+ "[4] para doar outros valores\n" + "[5] para cancelar");

			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Doa��o de R$ 10,00\n");
				break;

			case 2:
				System.out.println("Doa��o de R$ 25,00\n");
				break;

			case 3:
				System.out.println("Doa��o de R$ 50,00\n");
				break;

			case 4:
				System.out.print("Digite o valor: R$ ");
				double outroValor = scanner.nextDouble();
				System.out.println("Doa��o de R$ " + outroValor + "\n");
				break;

			case 5:
				System.out.println("Opera��o cancelada!");
				break;

			default:
				System.out.println("Op��o Inv�lida. Digite novamente.");
				break;
			}
		} while (opcao != 5);

		System.out.println("Obrigado pela contribui��o");
		
		scanner.close();
	}
}
