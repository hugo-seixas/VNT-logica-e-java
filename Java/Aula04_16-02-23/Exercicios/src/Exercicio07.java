import java.util.Scanner;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor 
//unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor 
//unitário de cada peça 2. Calcule e mostre o valor a ser pago.

public class Exercicio07 {

	public static void main(String[] args) {

		int codPeca, numeroPeca;
		double valorPeca, total = 0;

		Scanner scanner = new Scanner(System.in);

		int i = 1;
		while (i <= 2) {
			System.out.print("Informe o código da peça: ");
			codPeca = scanner.nextInt();

			System.out.print("Informe o número de peças: ");
			numeroPeca = scanner.nextInt();

			System.out.print("Informe o valor da peça: R$ ");
			valorPeca = scanner.nextDouble();

			total += numeroPeca * valorPeca;
			i++;

		}

		System.out.printf("Valor a pagar: R$ %.2f \n", total);
		scanner.close();

	}

}
