package atividade02;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o preco do dolar: ");
		double precoDolar = scanner.nextDouble();
		
		System.out.print("Quantos dolares vai comprar? ");
		double quantidade = scanner.nextDouble();
		
		double resultado = Conversor.dolarParaReal(quantidade, precoDolar);
		
		System.out.printf("A quantidade que vai pagar em reais = %.2f%n", resultado);
		
		scanner.close();

	}

}
