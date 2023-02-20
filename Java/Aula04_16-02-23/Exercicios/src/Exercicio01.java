// Crie um algoritmo que lê o nome de um correntista, sua agência e conta. Exiba esses dados na tela

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nomeCorrentista;
		String agencia;
		String conta;

		System.out.print("Digite o nome do correntista: ");
		nomeCorrentista = scanner.nextLine();

		System.out.print("Digite a agência: ");
		agencia = scanner.nextLine();

		System.out.print("Digite a conta: ");
		conta = scanner.nextLine();

		System.out.println();
		System.out.println("****************************");
		System.out.println("***** DADOS INFORMADOS *****");
		System.out.println("****************************");
		System.out.println("Nome: " + nomeCorrentista);
		System.out.println("Agência: " + agencia);
		System.out.println("Conta: " + conta);
		System.out.println("****************************");

		scanner.close();
	}

}
