//Faça um algoritmo para ler a base e a altura de um triangulo retângulo. 
//Em seguida, calcular a sua área. Imprimir: base,altura e a área.

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a base do triângulo: ");
		double base = scanner.nextDouble();

		System.out.print("Informe a altura do triângulo: ");
		double altura = scanner.nextDouble();

		double areaTriangulo = base * altura / 2;

		System.out.println();
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("Área: " + areaTriangulo);

		scanner.close();

	}

}
