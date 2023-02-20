import java.util.Scanner;

//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: 
//A, B e C. Em seguida, calcule e mostre: a) a área do triângulo retângulo que tem 
//A por base e C por altura. b) a área do círculo de raio C (pi = 3.14159). c) a área 
//do trapézio que tem A e B por bases e C por altura. d) a área do quadrado que 
//tem lado B. e) a área do retângulo que tem lados A e B.

public class Exercicio08 {

	public static void main(String[] args) {

		final float PI = 3.14159f;
		float a, b, c;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o valor de A: ");
		a = scanner.nextFloat();

		System.out.print("Informe o valor de B: ");
		b = scanner.nextFloat();

		System.out.print("Informe o valor de C: ");
		c = scanner.nextFloat();

		double areaTriangulo = a * c / 2, areaCirculo = PI * Math.pow(c, 2), areaTrapezio = (a + b) * c / 2,
				areaQuadrado = Math.pow(b, 2), areaRetangulo = a * b;

		System.out.println();
		System.out.printf("TRIÂNGULO: %.3f \n", areaTriangulo);
		System.out.printf("CÍRCULO: %.3f \n", areaCirculo);
		System.out.printf("TRAPÉZIO: %.3f \n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f \n", areaQuadrado);
		System.out.printf("RETÂNGULO: %.3f", areaRetangulo);

		scanner.close();

	}

}
