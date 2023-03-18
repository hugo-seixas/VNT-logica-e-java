import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o ano atual: ");
		int anoAtual = scanner.nextInt();

		System.out.print("Digite o valor do salario inicial: ");
		double salarioInicial = scanner.nextDouble();

		double percentual = 0.015;
		double novoSalario = salarioInicial + (salarioInicial * percentual);
		System.out.printf("Ano: 2010 - novo salário: R$ %.2f", novoSalario);
		
		for (int i = 2011; i <= anoAtual; i++) {
			percentual *= 2;
			novoSalario += percentual * novoSalario;
			System.out.printf("\nAno: %d - novo salário: R$ %.2f", i, novoSalario);
		}
		
		scanner.close();
	}

}
