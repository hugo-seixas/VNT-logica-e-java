//Elabore um algoritmo para ler o nome de um aluno, sua idade (em anos) e as quatro notas (de quatro bimestres).
//Calcular a média anual do aluno. Imprimir: nome, idade, notas e média.

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o nome do aluno: ");
		String nome = scanner.nextLine();

		System.out.print("Informe a idade do aluno: ");
		int idade = scanner.nextInt();

		System.out.print("Informe a nota do 1º Bimestre: ");
		double nota1 = scanner.nextDouble();

		System.out.print("Informe a nota do 2º Bimestre: ");
		double nota2 = scanner.nextDouble();

		System.out.print("Informe a nota do 3º Bimestre: ");
		double nota3 = scanner.nextDouble();

		System.out.print("Informe a nota do 4º Bimestre: ");
		double nota4 = scanner.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println();
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Nota do 1º Bimestre: " + nota1);
		System.out.println("Nota do 2º Bimestre: " + nota2);
		System.out.println("Nota do 3º Bimestre: " + nota3);
		System.out.println("Nota do 4º Bimestre: " + nota4);
		System.out.println("Média: " + media);

		scanner.close();

	}

}
