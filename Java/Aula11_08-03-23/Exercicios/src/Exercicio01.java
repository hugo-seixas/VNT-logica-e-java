import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] vetor = new int[4];
		int num = 10;

		for (int i = 0; i < vetor.length; i++) {

			System.out.println("Digite o elemento " + i + " :");
			vetor[i] = scanner.nextInt();
			num += vetor[i];
			System.out.println("Elemento " + i + ": " + num);

		}
		scanner.close();
	}
}