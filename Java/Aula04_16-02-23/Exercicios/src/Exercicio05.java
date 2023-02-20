import java.util.Scanner;

// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule 
// e mostre a diferença do produto de A e B pelo produto de C e D, segundo a 
// fórmula: DIFERENCA = (A * B - C * D)

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a, b, c, d, diferenca;

		System.out.print("Informe o primeiro número: ");
		a = scanner.nextInt();

		System.out.print("Informe o segundo número: ");
		b = scanner.nextInt();

		System.out.print("Informe o terceiro número: ");
		c = scanner.nextInt();

		System.out.print("Informe o quarto número: ");
		d = scanner.nextInt();

		diferenca = a * b - c * d;

		System.out.println("DIFERENCA = " + diferenca);

		scanner.close();

	}

}
