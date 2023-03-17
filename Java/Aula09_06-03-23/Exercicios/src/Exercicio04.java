import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numeroHomens = 0, numeroMulheres = 0;
		double altura, maior = 0;
		char sexo;

		System.out.print("Digite o número de pessoas para avaliar: ");
		int quantidade = scanner.nextInt();

		System.out.println("Digite a altura e o sexo das pessoas:");

		do {
			System.out.print("Altura: ");
			altura = scanner.nextDouble();

			System.out.print("Sexo (M-mulher e H-homem): ");
			sexo = scanner.next().charAt(0);

			quantidade--;

			if (altura > maior) {
				maior = altura;
			}
			if (sexo == 'm') {
				numeroMulheres++;
			} else {
				numeroHomens++;
			}

		} while (quantidade > 0);

		System.out.println("A maior altura do grupo: " + maior);
		System.out.println("O número de homens: " + numeroHomens);
		System.out.println("O número de mulheres: " + numeroMulheres);

		scanner.close();

	}

}
