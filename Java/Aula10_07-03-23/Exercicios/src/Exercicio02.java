import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma sennha: ");
		int senha = scanner.nextInt();

		while (senha != 2023) {
			System.out.println("Senha Invalida");
			System.out.println("Tente novamente: ");
			senha = scanner.nextInt();
		}
		System.out.println("Acesso Permitido");
		scanner.close();

	}

}
