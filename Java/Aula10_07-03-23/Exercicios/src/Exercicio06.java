import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entre com o valor x: ");
		int x = scanner.nextInt();

		for (int i = 1; i <= x; i++) {

			int linha = i;
			int quadrado = (int) Math.pow(i, 2);
			int cubo = (int) Math.pow(i, 3);

			System.out.println("Linha: " + linha + " Quadrado: " + quadrado + " Cubo: " + cubo);
		}
		scanner.close();

	}

}
