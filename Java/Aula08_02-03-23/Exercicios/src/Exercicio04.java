import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a 1� nota: ");
		double nota1 = scanner.nextDouble();

		System.out.print("Digite a 2� nota: ");
		double nota2 = scanner.nextDouble();

		System.out.print("Digite a 3� nota: ");
		double nota3 = scanner.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			System.out.println("M�dia = " + media + " Aprovado!");
		} else if (media >= 5) {
			System.out.println("M�dia = " + media + " Recupera��o!");
		} else {
			System.out.println("M�dia = " + media + " Reprovado!");
		}
		
		scanner.close();
	}
}
