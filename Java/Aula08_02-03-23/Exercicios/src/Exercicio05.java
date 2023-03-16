
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double salarioMinimo = 1302;
		double salarioNovo;

		System.out.print("Informe o seu nome: ");
		String nome = scanner.nextLine();

		System.out.print("Informe o seu salário: R$ ");
		double salarioAtual = scanner.nextDouble();

		double faixaSalarial = (salarioAtual / salarioMinimo);

		if (faixaSalarial <= 3) {
			salarioNovo = salarioAtual * 1.20;
		} else if ((faixaSalarial >= 4) && (faixaSalarial <= 6)) {
			salarioNovo = salarioAtual * 1.15;
		} else if ((faixaSalarial >= 7) && (faixaSalarial <= 9)) {
			salarioNovo = salarioAtual * 1.12;
		} else if ((faixaSalarial >= 10) && (faixaSalarial <= 12)) {
			salarioNovo = salarioAtual * 1.10;
		} else if ((faixaSalarial > 12) && (faixaSalarial <= 15)) {
			salarioNovo = salarioAtual * 1.07;
		} else {
			salarioNovo = salarioAtual;
		}

		System.out.println("Funcionário: " + nome + "\nSalário atual: " + salarioAtual + "\nNovo salário: " + salarioNovo);

		scanner.close();
	}
}