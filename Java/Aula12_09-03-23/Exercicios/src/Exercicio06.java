import java.util.Arrays;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] vetor = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º. valor: ");
			vetor[i] = scanner.nextInt();
		}

		Arrays.sort(vetor);

		System.out.println("--------------------------------");
		System.out.println("-------- Vetor Ordenado --------");
		System.out.println("--------------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.print(vetor[i] + " ");
		}

		scanner.close();

	}
}