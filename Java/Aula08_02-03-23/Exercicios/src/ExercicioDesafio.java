import java.util.Scanner;

public class ExercicioDesafio {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o preco: ");
		double preco = scanner.nextDouble();

		System.out.println("Escolha a categoria: ");
		System.out.println("1. Limpeza");
		System.out.println("2. Alimentacao");
		System.out.println("3. Vestuario");
		int categoria = scanner.nextInt();

		System.out.println("Escolha a situacao: ");
		System.out.println("1. Refrigeracao");
		System.out.println("2. Sem Refrigeracao");
		int situacao = scanner.nextInt();

		switch (categoria) {
		case 1:
			if (preco <= 25) {
				preco += (preco * 0.05);
			} else {
				preco += (preco * 0.12);
			}
			System.out.println("Preço com aumento: " + preco);
			break;
		case 2:
			if (preco <= 25) {
				preco += (preco * 0.08);
			} else {
				preco += (preco * 0.15);
			}
			System.out.println("Preço com aumento: " + preco);
			break;
		case 3:
			if (preco <= 25) {
				preco += (preco * 0.1);
			} else {
				preco += (preco * 0.18);
			}
			System.out.println("Preço com aumento: " + preco);
			break;
		default:
			System.out.println("Categoria Inválida");
			break;
		}

		if (categoria == 2 || situacao == 1) {
			preco -= (preco * 0.05);
			System.out.println("Preço com desconto: " + preco);
		} else {
			preco -= (preco * 0.08);
			System.out.println("Preço com desconto: " + preco);
		}

		if (preco <= 50) {
			System.out.println("Barato");
		} else if (preco < 120) {
			System.out.println("Normal");
		} else {
			System.out.println("Caro");
		}
		
		scanner.close();
	}
}