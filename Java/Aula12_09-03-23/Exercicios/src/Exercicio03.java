import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o numero: ");
		int numero = scanner.nextInt();
		verificaParOuImpar(numero);

		scanner.close();

	}

	public static void verificaParOuImpar(int numero) {
		if (numero % 2 == 0) {
			System.out.println(numero + " é par");
		} else {
			System.out.println(numero + " é impar");
		}
	}
}
