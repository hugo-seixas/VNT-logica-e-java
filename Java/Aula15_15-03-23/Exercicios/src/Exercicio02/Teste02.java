package Exercicio02;

import java.util.Scanner;

public class Teste02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o nome do produto: ");
		String nome = scanner.nextLine();

		System.out.print("Informe o preço do produto: R$ ");
		double preco = scanner.nextDouble();

		System.out.print("Informe a quantidade do produto: ");
		int quantidade = scanner.nextInt();

		Produto produto1 = new Produto(nome, preco, quantidade);

		System.out.println(produto1.toString());

		System.out.print("\nInforme a quantidade de produtos para adicionar no estoque: ");
		int quantidadeAdd = scanner.nextInt();
		produto1.addProdutos(quantidadeAdd);
		System.out.println(produto1.toString());

		System.out.print("\nInforme a quantidade de produtos para remover do estoque: ");
		int quantidadeRemove = scanner.nextInt();
		produto1.removeProdutos(quantidadeRemove);
		System.out.println(produto1.toString());

		scanner.close();

	}

}
