package Exercicio01;

import java.util.Scanner;

public class Teste01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Produto produto1 = new Produto();
		
		System.out.print("Informe o nome do produto: ");
		produto1.nome = scanner.nextLine();

		System.out.print("Informe o preço do produto: R$ ");
		produto1.preco = scanner.nextDouble();
		
		System.out.print("Informe a quantidade do produto: ");
		produto1.quantidade = scanner.nextInt();
		
		System.out.println(produto1.toString());
		
		System.out.print("\nInforme a quantidade de produtos para adicionar no estoque: ");
		int quantidade = scanner.nextInt();
		produto1.addProdutos(quantidade);
		System.out.println(produto1.toString());
		
		System.out.print("\nInforme a quantidade de produtos para remover do estoque: ");
		quantidade = scanner.nextInt();
		produto1.removeProdutos(quantidade);
		System.out.println(produto1.toString());
		
		scanner.close();
		
	}

}
