import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a 1ª nota: ");
		double nota1 = scanner.nextDouble();

		System.out.print("Digite a 2ª nota: ");
		double nota2 = scanner.nextDouble();

		System.out.print("Digite a 3ª nota: ");
		double nota3 = scanner.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			System.out.println("Média = " + media + " Aprovado!");
		} else if (media >= 5) {
			System.out.println("Média = " + media + " Recuperação!");
		} else {
			System.out.println("Média = " + media + " Reprovado!");
		}
		
		scanner.close();
	}
}
