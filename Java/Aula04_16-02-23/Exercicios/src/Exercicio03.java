import java.util.Scanner;

// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa,
// conforme exemplos: Entrada: 10, 30 / Saída: SOMA = 40

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n1, n2, soma;

		System.out.print("Informe o primeiro número: ");
		n1 = scanner.nextInt();

		System.out.print("Informe o segundo número: ");
		n2 = scanner.nextInt();

		soma = n1 + n2;

		System.out.println("SOMA = " + soma);

		scanner.close();

	}

}
