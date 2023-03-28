package atividade03;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Salario sal = new Salario();

		System.out.println("digite o ano atual: ");
		sal.anoAtual = scanner.nextInt();

		System.out.println("digite o valor do salario: ");
		sal.salario = scanner.nextDouble();
		System.out.println("O novo salario é: " + sal.salarioAtual());

		scanner.close();

	}

}
