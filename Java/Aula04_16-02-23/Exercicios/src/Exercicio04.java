
// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo
// com duas e quatro casas decimais.
// Fórmula da área: area = π . raio2
// Considere o valor de π = 3.1415

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {

		final double PI = 3.14159;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o valor do raio de um círculo: ");
		double raio = scanner.nextDouble();

		double area = PI * (Math.pow(raio, 2));
		
		System.out.printf("Área do círculo com duas casas decimais:  %.2f \n", area);
		System.out.printf("Área do círculo com quatro casas decimais:  %.4f", area);
		
		scanner.close();

	}

}
