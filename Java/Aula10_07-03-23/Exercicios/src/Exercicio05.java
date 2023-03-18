import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int produtoA = 0;
		int produtoB = 0;
		int produtoC = 0;
		int tipo;

		System.out.println("CODIGO:\n1.Produto A \n2.Produto B \n3.Produto C \n4.Fim");

		do {
			System.out.println("Entre com o código do produto: ");
			tipo = scanner.nextInt();

			switch (tipo) {
			case 1:
				produtoA++;
				break;
			case 2:
				produtoB++;
				break;
			case 3:
				produtoC++;
				break;
			case 4:
				System.out.println("MUITO OBRIGADO");
				System.out.println("Produto A: " + produtoA);
				System.out.println("Produto B: " + produtoB);
				System.out.println("Produto C: " + produtoC);
				break;
			default:
				System.out.println("Código Inválido");
				break;
			}

		} while (tipo != 4);

		scanner.close();

	}

}
