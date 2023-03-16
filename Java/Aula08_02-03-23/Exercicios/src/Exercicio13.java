import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double imposto = 0;

		System.out.println("Informe o salário: R$ ");
		double salario = scanner.nextDouble();

		if (salario >= 1903.99 && salario <= 2826.65) {
			imposto = salario * 0.075;
		} else if (salario >= 2826.66 && salario <= 3751.05) {
			imposto = salario * 0.15;
		} else if (salario >= 3751.06 && salario <= 4664.68) {
			imposto = salario * 0.225;
		} else if (salario > 4664.68) {
			imposto = salario * 0.275;
		} else {
			System.out.println("Isento!");
		}
		System.out.println("Imposto = R$ " + imposto);
		
		scanner.close();
	}
}
