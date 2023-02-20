// Crie um algoritmo que leia o ano atual e o ano em que uma pessoa nasceu. Calcule a idade dessa pessoa e imprima o resultado na tela.

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int anoAtual, anoNascimento, idade;

		System.out.print("Informe o ano atual: ");
		anoAtual = scanner.nextInt();

		System.out.print("Informe o ano em que você nasceu: ");
		anoNascimento = scanner.nextInt();

		idade = anoAtual - anoNascimento;

		System.out.println("Idade: " + idade + " anos");

		scanner.close();

	}

}
