import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {

		double maior, menor, medio;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe 3 valores: ");

		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		System.out.println("Digite 1 para ordem crescente: ");
		System.out.println("Digite 2 para ordem decrescente: ");
		System.out.println("Digite 3 para o maior valor ficar entre os outros dois: ");

		int i = scanner.nextInt();

		if ((a > b) && (a > c)) {
			if (b > c) {
				maior = a;
				medio = b;
				menor = c;

			} else {
				maior = a;
				medio = c;
				menor = b;
			}
		} else {
			if ((b > a) && (b > c)) {
				if (a > c) {
					maior = b;
					medio = a;
					menor = c;

				} else {
					maior = b;
					medio = c;
					menor = a;
				}

			} else {
				if (a > b) {
					maior = c;
					medio = a;
					menor = b;

				} else {
					maior = c;
					medio = b;
					menor = a;
				}
			}
		}

		switch (i) {
		case 1:
			System.out.println("Os números em ordem crescente são: " + menor + ", " + medio + ", " + maior);
			break;

		case 2:
			System.out.println("Os números em ordem decrescente são: " + maior + ", " + medio + ", " + menor);
			break;

		case 3:
			System.out.println("Os números em que o número maior fique entre os outros dois: " + menor + ", " + maior
					+ ", " + medio);
			break;

		default:
			System.out.println("Opção inválida");
			break;
		}

		scanner.close();
	}
}
