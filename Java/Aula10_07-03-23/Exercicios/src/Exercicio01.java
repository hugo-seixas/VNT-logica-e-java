import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean primo = true;

		System.out.print("Informe o n�mero ");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				System.out.println(numero + " n�o � primo");
				primo = false;
			}
		}

		if (primo) {
			System.out.println(numero + " � primo");
		}

		scanner.close();
	}
}
