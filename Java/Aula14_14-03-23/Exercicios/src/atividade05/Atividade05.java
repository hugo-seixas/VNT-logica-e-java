package atividade05;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();

		System.out.println("Entre com a largura e altura do retangulo:");
		retangulo.largura = scanner.nextDouble();
		retangulo.altura = scanner.nextDouble();

		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERIMETRO = %.2f%n", retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());

		scanner.close();

	}

}
